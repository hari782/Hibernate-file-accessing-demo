package hbcls;

import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;

public class HQLJoinTables {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String customer_id = sc.nextLine();
		
		Configuration con = new Configuration();
		con.configure("hbcls/nandha.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction t = ses.beginTransaction();
		
		Query q = ses.createQuery("from Transaction_Info where customer_custid=:c");
		q.setString("c", customer_id);
		
		List lst = q.list();
		Iterator ite = lst.iterator();
		while(ite.hasNext()) {
			Transaction_Info tf = (Transaction_Info)ite.next();
			Customer customer = tf.getCustomer();
			String cust_id = customer.getCust_id();
			String cust_name = customer.getCust_name();
			String cust_email = customer.getCust_email();
			String trans_id = tf.getTrans_id();
			String prod_name = tf.getProd_name();
			int qty = tf.getQty();
			double total = tf.getTotal();
			
			System.out.println("Customer ID : " + cust_id);
			System.out.println("Customer Name : " + cust_name);
			System.out.println("Customer Email : " + cust_email);
			System.out.println("Transaction ID : " + trans_id);
			System.out.println("Product Name : " + prod_name);
			System.out.println("Quantity : " + qty);
			System.out.println("Total : " + total);
			
			System.out.println("----------------------------------------");
		}
	}
}
