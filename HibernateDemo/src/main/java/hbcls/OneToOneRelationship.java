package hbcls;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class OneToOneRelationship {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setCust_id("C-2");
		customer.setCust_name("def");
		customer.setCust_email("def@gmail.com");
		
		Transaction_Info trans = new Transaction_Info();
		trans.setTrans_id("T-2");
		trans.setProd_name("Keyboard");
		trans.setQty(2);
		trans.setTotal(3000.00);
		trans.setCustomer(customer);
		
		
		Configuration con = new Configuration();
		con.configure("hbcls/nandha.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction t = ses.beginTransaction();
		
		ses.persist(trans);
		
		t.commit();
		ses.close();
		sf.close();
		
		
	}
}
