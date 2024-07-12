package hbcls;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class HibernateXMLDemo {

	public static void main(String[] args) {
		
		Student st = new Student();
		st.setRollno("st-7");
		st.setStname("pqr");
		st.setRank(5);
		st.setMark(88.18);
		
		Configuration con = new Configuration();
		con.configure("hbcls/nandha.cfg.xml");
		
		SessionFactory sf = con.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction t = ses.beginTransaction();
		
		ses.persist(st);
		
		
		t.commit();
		//ses.close();
		//sf.close();
		
		
		//System.out.println("Success...");
		
	}
}
