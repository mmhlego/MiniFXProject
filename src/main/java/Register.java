import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Register implements Initializable {
	@FXML
	private TextField firstNameTXF;
	@FXML
	private TextField lastNameTXF;
	@FXML
	private TextField IDTXF;
	@FXML
	private Button registerBTN;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		registerBTN.setOnAction(e -> {
			if (checkData()) {
				gotoNextPage();
			}
		});
	}

	private void showAlert(String message) {
		Alert al = new Alert(AlertType.ERROR);
		al.setHeaderText("Error");
		al.setContentText(message);
		al.show();
	}

	private boolean checkData() {
		if (firstNameTXF.getText().equals(new String())) {
			showAlert("Firstname field is empty");
			return false;
		} else if (lastNameTXF.getText().equals(new String())) {
			showAlert("lastname field is empty");
			return false;
		} else if (IDTXF.getText().equals(new String())) {
			showAlert("ID field is empty");
			return false;
		} else {
			return true;
		}
	}

	private void gotoNextPage() {
		Stage current = (Stage) registerBTN.getScene().getWindow();
		current.close();

		Stage newStage = new Stage(StageStyle.TRANSPARENT);
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Show.fxml"));
		Parent root;
		try {
			root = loader.load();
			Scene scene = new Scene(root);
			newStage.setScene(scene);
			newStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public TextField getFirstNameTXF() {
		return firstNameTXF;
	}

	public void setFirstNameTXF(TextField firstNameTXF) {
		this.firstNameTXF = firstNameTXF;
	}

	public TextField getLastNameTXF() {
		return lastNameTXF;
	}

	public void setLastNameTXF(TextField lastNameTXF) {
		this.lastNameTXF = lastNameTXF;
	}

	public TextField getIDTXF() {
		return IDTXF;
	}

	public void setIDTXF(TextField iDTXF) {
		IDTXF = iDTXF;
	}

	public Button getRegisterBTN() {
		return registerBTN;
	}

	public void setRegisterBTN(Button registerBTN) {
		this.registerBTN = registerBTN;
	}
}