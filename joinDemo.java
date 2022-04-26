package joinOperation;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class joinDemo {
	
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
	/*	Question q1=new Question();
		q1.setQuestion("what is java");
		
		Answer a1=new Answer();
		a1.setAid(101);
		a1.setAnswer("java is the programming language");
		a1.setQuestion(q1);
		
		Answer a2=new Answer();
		a2.setAid(102);
		a2.setAnswer("java is the platform");
		a2.setQuestion(q1);
		
		Answer a3=new Answer();
		a3.setAid(103);
		a3.setAnswer("java is the object oriented language");
		a3.setQuestion(q1);
		
		List<Answer> list=new ArrayList<Answer>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		q1.setAnswer(list);
		
		
		
		/*Question q2=new Question();
		q2.setQuestion("what is hibernate");
		
		Answer a2=new Answer();
		a2.setAid(102);
		a2.setAnswer("hibernate is an orm tool");
		a2.setQuestion(q2);
		
		
		session.save(q1);
		session.save(a1);
		session.save(a2);
		session.save(a3);
		
		tx.commit();
		
		System.out.println("data saved ");
		
		session.close();
		factory.close();
		
		
		//factory.close();
	*/
		
		//fetch the data in the database
		Question q1=session.get(Question.class, 1);
		System.out.println("Question: " +q1.getQuestion());
		
		System.out.println("Answer: ");
		for(Answer a:q1.getAnswer())
		{
			System.out.println(a.getAnswer());
		}
		tx.commit();
		session.close();
		factory.close();
		
		
				
	}

}
