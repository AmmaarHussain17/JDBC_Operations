import java.sql.*;

public class DeleteRow {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:postgresql://localhost:5432/jdbcTest";
        String username = "postgres";
        String password = "j******";

        Connection connect = DriverManager.getConnection(url,username,password);
        System.out.println("Connection Made");

        String sql = "DELETE FROM employee WHERE emp_id = 106";

        Statement state = connect.createStatement();
        boolean status = state.execute(sql);

        System.out.println(status);
        connect.close();

        System.out.println("Connection Close");

    }
}
