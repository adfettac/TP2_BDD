package model;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		System.setProperty("jdbc.drivers", "com.mysql.cj.jdbc.Driver");
		
		DataAccess dataAccess = new DataAccess("jdbc:mysql://localhost:8889"
				+ "/company?useSSL=false&serverTimezone=UTC", "root", "root");
		
	/*
	ELEMENTS DE REPONSES DONNES PAR PROF
	List <EmployeeInfo> liste = new ArrayList <Employee> ();
        
        WHILE{
          E = new Employee(x, x, x);
          liste.add(e);
                  }
        return liste;
      }*/

	}

}
