package hbcls;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InheritanceMappingDemo {

	public static void main(String[] args) {
		
		Contract ct = new Contract();
		ct.setEmp_id("emp-1");
		ct.setEmp_name("abc");
		ct.setHrrate(200.00);
		ct.setIncentive(500.00); 
		
		Permanent per = new Permanent();
		per.setEmp_id("emp-2");
		per.setEmp_name("def");
		per.setSalary(30000.00);
		per.setBonus(5000.00);
		
		Employee emp = new Employee();
		emp.setEmp_id("emp-3");
		emp.setEmp_name("ghi");
		
		
		Configuration con = new Configuration();
		con.configure("hbcls/nandha.cfg.xml");
		
		SessionFactory sf = con.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction t = ses.beginTransaction();
		
		ses.persist(ct);		
		ses.persist(per);
		ses.persist(emp);
		
		t.commit();
		ses.close();
		sf.close();
	}
}
