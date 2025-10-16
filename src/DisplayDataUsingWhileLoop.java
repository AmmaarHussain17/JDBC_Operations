import java.sql.*;

public class DisplayDataUsingWhileLoop {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:postgresql://localhost:5432/jdbcTest";
        String username = "postgres";
        String password = "jack123";

        Connection connect = DriverManager.getConnection(url,username,password);
        System.out.println("Connection Made");

        Statement state = connect.createStatement();

        String sql = "SELECT * FROM employee";

        ResultSet result = state.executeQuery(sql);

        while(result.next())
        {
            System.out.print(result.getInt(1) + " - ");
            System.out.print(result.getString(2) + " - ");
            System.out.println(result.getString(1));
        }
        connect.close();
        System.out.println("Connection Closed");

    }
}
