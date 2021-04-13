import java.sql.*;
import java.util.*;

public class DBConnector {

    public static Connection Con;

    public static boolean Connect() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://freedb.tech/freedbtech_FXMiniProject",
                    "freedbtech_FXMiniProject", "FXMiniProject");

            if (Con != null) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void AddUser(User u) {
        // PreparedStatement ps = Con.prepareStatement("INSERT INTO `User`(`FirstName`, `LastName`, `ID`) VALUES (\'"
        //         + u.Firstname + "\' , \' " + u.Lastname + ", \' ," + u.Id + "\'");

        try {
            PreparedStatement ps = Con
                    .prepareStatement("INSERT INTO `User`(`FirstName`, `LastName`, `ID`) VALUES (?,?,?)");
            ps.setString(1, u.Firstname);
            ps.setString(2, u.Lastname);
            ps.setString(3, u.Id);

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    public static ResultSet GetAllUsers() {
        try {
            Statement st = Con.createStatement();
            return st.executeQuery("SELECT * FROM `User`");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<User> ConvertuserToArrayList(ResultSet rs) {
        ArrayList<User> temp = new ArrayList<User>();
        try {
            while (rs.next()) {
                User u = new User(rs.getString(1), rs.getString(2), rs.getString(3));
                temp.add(u);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return temp;
    }

}
