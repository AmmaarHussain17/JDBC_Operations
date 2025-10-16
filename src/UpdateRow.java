import java.sql.*;

public class UpdateRow {
    public static void main(String args[]) throws Exception
    {
        String url = "jdbc:postgresql://localhost:5432/jdbcTest";
        String username = "postgres";
        String password = "jack123";

        Connection connect = DriverManager.getConnection(url, username, password);
        System.out.println("Connection Made");

        String sql = "UPDATE employee SET name = 'Max' WHERE emp_id = 101";

        Statement state = connect.createStatement();
        boolean status = state.execute(sql);

        System.out.println(status);

        System.out.println("Connection Made");
        connect.close();
    }
}
