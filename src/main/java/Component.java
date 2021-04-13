import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class Component implements Initializable {

    @FXML
    private Label firstName;

    @FXML
    private Label lastName;

    @FXML
    private Label id;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

	public Label getFirstName() {
		return firstName;
	}

	public void setFirstName(Label firstName) {
		this.firstName = firstName;
	}

	public Label getLastName() {
		return lastName;
	}

	public void setLastName(Label lastName) {
		this.lastName = lastName;
	}

	public Label getId() {
		return id;
	}

	public void setId(Label id) {
		this.id = id;
	}

}
