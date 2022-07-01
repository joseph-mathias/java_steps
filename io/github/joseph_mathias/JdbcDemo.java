

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcDemo {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/test";
        Connection connection = null;

        int rollno = 1;
        String name = "Mercy";
        int age = 15;
        String sql = "insert into student(rollno, name, age)" + "values(" + rollno + ", '" + name + "', " + age + ");";

        try {
            connection = DriverManager.getConnection(url, "postgres", "postgres");

            Statement statement = connection.createStatement();
            int m = statement.executeUpdate(sql);
            if (m == 1)
                System.out.println("Inserted Successfully: " + sql);
            else
                System.out.println("insertion Failed!!");
        } catch (Exception e) {
            System.out.println("Something Went Wrong! " + e);
        } finally {
            connection.close();
        }
    }
}
