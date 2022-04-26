package joinOperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import joinOperation.joinDemo;

public class ansque {
	public static void main( String[] args )
    {
        
    	
    	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session session=factory.openSession();
    	
    /*	Question q1=new Question();
		q1.setQuestion("what is java");
		
		Answer a1=new Answer();
		a1.setAid(101);
		a1.setAnswer("java is the programming language and platform");
		a1.setQuestion(q1);
		
		Question q2=new Question();
		q2.setQuestion("what is hibernate");
		
		Answer a2=new Answer();
		a2.setAid(102);
		a2.setAnswer("hibernate is an orm tool");
		a2.setQuestion(q2);
		*/
    	
    	
    	
        Transaction tx=session.beginTransaction();
        
        
       
        
        tx.commit();
        System.out.println("data saved");
        session.close();
        factory.close();
        
        
    }

}
