package joinOperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class JoinDemo2 {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Student s1=new Student();
		s1.setStudent("ajit sharma");
		
		teacher t1=new teacher();
		t1.setTid(101);
		t1.setTname("komal sontakke");
		t1.setTno(12345678);
		t1.setStudent(s1);
		
		Student s2=new Student();
		s2.setStudent("sujata padvekar");
		
		teacher t2=new teacher();
		t2.setTid(102);
		t2.setTname("monalisa chakraborthy");
		t2.setTno(567890);
		t2.setStudent(s2);
		
		session.save(s1);
		session.save(s2);
		session.save(t1);
		session.save(t2);
		
		tx.commit();
		factory.close();
		
		

	}

}
