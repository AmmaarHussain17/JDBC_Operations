import java.sql.*;

public class InsertRow {
    public static void main(String args[]) throws Exception {

        String url = "jdbc:postgresql://localhost:5432/jdbcTest";
        String username = "postgres";
        String password = "jack123";

        System.out.println("Connection Made");

        String sql = "INSERT INTO employee VALUES (106,'Anwar','IT')";

        Connection connect = DriverManager.getConnection(url, username, password);
        Statement state = connect.createStatement();

        boolean status = state.execute(sql);
        System.out.println(status);

        connect.close();
        System.out.println("Connection Close");
    }
}