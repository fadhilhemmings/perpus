
package Perpustakaan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Konfig {
    
    private static Connection MYSQLConfig;
    
    public static Connection configDB()throws SQLException{
        try{
            String url = "jdbc:mysql: //localhost:3306/latihanperpus";
            String user ="root";
            String pass ="";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MYSQLConfig = DriverManager.getConnection(url, user, pass);
        }catch (SQLException e){
            System.out.println("koneksi ke database gagal!" + e.getMessage());   
        }
        return MYSQLConfig;
    }
}
