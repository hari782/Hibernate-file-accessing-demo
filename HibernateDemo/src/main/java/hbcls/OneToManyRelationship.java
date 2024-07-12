package hbcls;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class OneToManyRelationship {

	public static void main(String[] args) {
		
		Subject s1 = new Subject();
		s1.setSub_id("Sub-1");
		s1.setSub_name("Java");
		s1.setCategory("Technology");
		
		Subject s2 = new Subject();
		s2.setSub_id("Sub-2");
		s2.setSub_name("AWS");
		s2.setCategory("Cloud");
		
		List<Subject> lst = new ArrayList();
		lst.add(s1);
		lst.add(s2);
		
		Teacher teacher= new Teacher();
		teacher.setTeacher_id("T-1");
		teacher.setTeacher_name("abc");
		teacher.setSub(lst);
		
		
		Configuration con = new Configuration();
		con.configure("hbcls/nandha.cfg.xml");
		
		SessionFactory sf = con.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction t = ses.beginTransaction();
		ses.persist(teacher);
		
		t.commit();
		ses.close();
		sf.close();
		
	}
}
