import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Register implements Initializable{

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
