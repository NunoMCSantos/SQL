package pt.marinha.hiber;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.util.logging.PlatformLogger;

public class SQLinsert {
    private static final Logger LOG = Logger.getLogger(SQLinsert.class.getName());
    
    
    
  static final String JDBC_DRIVER  
          ="org.apache.derby.jdbc.EmbeddedDriver";
  static final String DB_URL=
          "jdbc:derby://localhost:1527/Formando";
  //Database credentials
  static final String USER= "app";
  static final String PASS="app";
  
  public static void main(String[]args){
      LOG.setLevel(Level.ALL);
      try {//register driver
          LOG.log(Level.INFO,"Registo do driver");
          Class.forName(JDBC_DRIVER);
          LOG.log(Level.INFO,"Driver registado OK");
      }catch (ClassNotFoundException ex){
          LOG.log(Level.SEVERE, ex.toString());
      }
      Connection c=null;
      PreparedStatement p= null;
      try{
          LOG.fine("Activar Conexão");
      c= DriverManager.getConnection(DB_URL, USER, PASS);
      LOG.info("Conexão OK");
      }catch (SQLException ex){
          LOG.log(Level.SEVERE, ex.toString());
      }
      
  }
    
}
