
package supermarket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DBKonekcija {
    //Poziv metode connect direktono nad klasom Connecion jer je statična klasa 
    public static Connection connect() throws ClassNotFoundException, SQLException{
        Connection conn =null;
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
        
        conn=DriverManager.getConnection("jdbc:derby://localhost:1527/supermarket","","");
    }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
}
        JOptionPane.showMessageDialog(null, "Povezan sa bazom");
        return conn;
    }
    
    
    
}
