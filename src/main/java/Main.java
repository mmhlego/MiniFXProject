import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
	public static void main(String[] args) {
		launch(args);

		// User u = new User("Mark", "Antony", "142");
		DBConnector.Connect();
		// DBConnector.AddUser(u);
		System.out.println(DBConnector.ConvertuserToArrayList(DBConnector.GetAllUsers()));
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Register.fxml"));
		Parent root = loader.load();
		Scene s = new Scene(root);
		s.setFill(Color.TRANSPARENT);
		primaryStage.setScene(s);
		primaryStage.initStyle(StageStyle.TRANSPARENT);
		primaryStage.show();
	}
}