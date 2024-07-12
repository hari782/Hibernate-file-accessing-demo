package hbcls;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class ManyToOneRelationship {

	public static void main(String[] args) {
		
		Address addr = new Address();
		addr.setAddr_id("N-1");
		addr.setAddr1("Nandha Engineering College");
		addr.setAddr2("Perundurai Road");
		addr.setStreet("Vaikaal Medu");
		
		
		Student_Info sf1 = new Student_Info();
		sf1.setRollno("st-1");
		sf1.setStname("abc");
		sf1.setAddr(addr);
		
		Student_Info sf2 = new Student_Info();
		sf2.setRollno("st-2");
		sf2.setStname("def");
		sf2.setAddr(addr);
		
		Configuration con = new Configuration();
		con.configure("hbcls/nandha.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction t = ses.beginTransaction();
		ses.persist(sf1);
		ses.persist(sf2);
		
		t.commit();
		ses.close();
		sf.close();
		
		
	}
}
