
package Form;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConnectionMySQL {
    Connection con;
    public Connection getConnection(){
        try {        
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_hotel","root","");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi GAGAL \n"+e);
        }
        return con;
    }
}
