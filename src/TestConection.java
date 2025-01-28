import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConection {

    public static void main(String[] args) throws SQLException {
        final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
        final String user = "root";
        final String password = "10850300Fb@";

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("Conexão efetuada com Sucesso!");

        Statement statement = connection.createStatement();
        statement.execute("CREATE DATABASE IF NOT EXISTS curso_java");

        System.out.println("Banco criado com sucesso!");
        connection.close();
    }
}
