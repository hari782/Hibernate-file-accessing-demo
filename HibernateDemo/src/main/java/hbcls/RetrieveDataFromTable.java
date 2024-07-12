package hbcls;

import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;

public class RetrieveDataFromTable {

	public static void main(String[] args) {
		
		Configuration con = new Configuration();
		con.configure("hbcls/nandha.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction t = ses.beginTransaction();
		
		Query q = ses.createQuery("from Student where rollno='st-2'");
		List lst = q.list();
		Iterator ite = lst.iterator();
		while(ite.hasNext()) {
			Student st = (Student)ite.next();
			
			//String rno = st.getRollno();
			String stname = st.getStname();
			//int rank = st.getRank();
			double mark = st.getMark();
			
			//System.out.println("Roll No : " + rno);
			System.out.println("Name : " + stname);
			//System.out.println("Rank : " + rank);
			System.out.println("Mark : " + mark);
			
			System.out.println("*********************************");
		}
	}
}








