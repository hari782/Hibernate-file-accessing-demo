package hbcls;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class UpdateDataUsingHQL {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Roll No : ");
		String rno = sc.nextLine();
		
		System.out.println("Enter Mark : ");
		double mark = sc.nextDouble();
		
		Configuration con = new Configuration();
		con.configure("hbcls/nandha.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction t = ses.beginTransaction();
		Query q = ses.createQuery("update Student set mark=:m where rollno=:r");
		q.setDouble("m", mark);
		q.setString("r", rno);
		q.executeUpdate();
		
		t.commit();
		ses.close();
		sf.close();
		
		
		
		
		
		
	}
}
