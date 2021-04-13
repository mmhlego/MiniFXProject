import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

public class Show implements Initializable {
	@FXML
	private AnchorPane anchor;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public AnchorPane getAnchor() {
		return anchor;
	}

	public void setAnchor(AnchorPane anchor) {
		this.anchor = anchor;
	}
}