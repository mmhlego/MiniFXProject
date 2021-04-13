import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

public class Show implements Initializable {
	@FXML
	private AnchorPane anchor;

	ArrayList<User> allUsers;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		getAllUsers();

		showAllUsers();
	}

	private void showAllUsers() {
		for (int i = 0; i < allUsers.size(); i++) {
			FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Component.fxml"));

			User current = allUsers.get(i);

			try {
				Parent root = loader.load();
				Component control = loader.getController();

				control.getFirstName().setText(current.Firstname);
				control.getLastName().setText(current.Lastname);
				control.getId().setText(current.Id);

				double margin = 10.0;

				AnchorPane.setTopAnchor(root, margin + i * (margin + control.getBack().getPrefHeight()));
				AnchorPane.setLeftAnchor(root, margin);

				anchor.getChildren().add(root);

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void getAllUsers() {
		ResultSet results = DBConnector.GetAllUsers();
		allUsers = DBConnector.ConvertuserToArrayList(results);

		for (User u : allUsers) {
			System.out.println(u.Firstname + "\t" + u.Lastname + "\t" + u.Id);
		}
	}

	public AnchorPane getAnchor() {
		return anchor;
	}

	public void setAnchor(AnchorPane anchor) {
		this.anchor = anchor;
	}
}