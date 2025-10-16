import java.sql.*;

public class DisplayCertainName {

    public static void main(String args[]) throws Exception
    {
        String url = "jdbc:postgresql://localhost:5432/jdbcTest";
        String username = "postgres";
        String password = "j*******";

        Connection connect = DriverManager.getConnection(url,username,password);

        System.out.println("Connection Made");

        String sql = "SELECT name FROM employee WHERE emp_id = 101";

        Statement state = connect.createStatement();
        ResultSet result = state.executeQuery(sql);

        result.next();
        String name = result.getString("name");

        System.out.println("Name of the Student : " + name);

        System.out.println("Connection Close");
        connect.close();
    }
}
