package hbcls;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class HibernateAnnotationDemo {

	public static void main(String[] args) {
		
		Library lib = new Library();
		lib.setLib_id("LIB-1");
		lib.setLib_name("NEC Library");
		lib.setTotal_books(1000);
		
		Configuration con = new Configuration();
		con.configure("hbcls/nandha.cfg.xml");
		
		SessionFactory sf = con.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction t = ses.beginTransaction();
		
		ses.persist(lib);
		
		t.commit();
		ses.close();
		sf.close();
		
	}
}
