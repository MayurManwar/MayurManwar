package studentManagment;

import java.sql.DriverManager;

public class Connection {
	
	java.sql.Connection con;
	
public  java.sql.Connection creatC() {
	try {
	
	
	//load the driver
	Class.forName(" com.mysql. jdbc.Driver");
	
	//create the connection..
	String user= "root";
	String password ="root";
	String url ="jdbc:mysql:/localhost:3306/student_managment";
	
	
	con=DriverManager.getConnection(url, user, password);
	
	
}catch(Exception e) {
	e.printStackTrace();
	
}
	return con;
	
}
}