package estacionamento;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connection {

    private final String url = "jdbc:postgresql://localhost:5432/postgres";
    private final String user = "postgres";
    private final String password = "postgres";

    public void initialize() {
        try {
            //DriverManager.registerDriver(new org.postgresql.Driver()); 
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e);
        }
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            //ResultSet rs = stmt.executeQuery("SELECT * FROM carros WHERE carros.placa = '" + placa + "'");
            ResultSet rs = stmt.executeQuery("SELECT * FROM carros");
            System.out.println("placa");

            while (rs.next()) {
                String id = rs.getString("placa");
                System.out.println(id );
            }
            
        } catch (SQLException e) {
            System.out.println("SQL exception occured" + e);
        }
        
    }
    
}