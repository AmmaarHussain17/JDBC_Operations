import java.sql.*;

public class InsertRowValuesFromDataTypes {
    public static void main(String[] args) throws Exception {

        int emp_id = 104;
        String name = "Jerry";
        String designation = "IT";

        String url = "jdbc:postgresql://localhost:5432/jdbcTest";
        String username = "postgres";
        String password = "jack123";

        Connection connect = DriverManager.getConnection(url, username, password);
        System.out.println("Connection Made");

        String sql = "INSERT INTO employee VALUES (?,?,?)";

        PreparedStatement state = connect.prepareStatement(sql);
        state.setInt(1,emp_id);
        state.setString(2,name);
        state.setString(3,designation);

        state.execute();

        connect.close();
    }
}
