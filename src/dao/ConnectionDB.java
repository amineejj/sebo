package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDB {
    private Connection con;
    private Statement st;

    public ConnectionDB(String pilote, String db) {
        //Charger Pilote
     
            try {
				Class.forName(pilote);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("1");
				e.printStackTrace();
			}
        
            
        //Etablir cnx
            try {
				con = DriverManager.getConnection(db, "root", "");
				  st = con.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("2");
				e.printStackTrace();
			}
          
        
    }

    public void close() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
			System.out.println("3");
            ex.printStackTrace();
        }
    }

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public Statement getSt() {
		return st;
	}

	public void setSt(Statement st) {
		this.st = st;
	}
}
