
public class Main {
	public static void main(String[] args) {
		// User u = new User("Mark", "Antony", "142");
		DBConnector.Connect();
		// DBConnector.AddUser(u);
		System.out.println(DBConnector.ConvertuserToArrayList(DBConnector.GetAllUsers()));
	}
}
