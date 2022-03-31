package studentManagment;

import java.sql.PreparedStatement;

public class StudentDao {
	
	
private static Connection cp;

public static boolean insertStudentToDb(Student st){

	boolean f=false;
	try {
		
		//jdbc code..
		Connection con= (Connection) cp .creatC();
		String q="insert into student(sname,smobile,scity) value (,?,?)";
		//preparedStatement
		PreparedStatement pstmt=((java.sql.Connection) con).prepareStatement(q);
		// set value of parameter
		pstmt.setString(1, st.getStudentName());
		pstmt.setString(2, st.getStudentMobile());
		pstmt.setString(3, st.getStudentCity());
		
		//execute
		pstmt.executeLargeUpdate();
		f=true;
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		
	
	return f;
	
}
}
