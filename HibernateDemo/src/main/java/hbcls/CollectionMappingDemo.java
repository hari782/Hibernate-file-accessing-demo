package hbcls;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class CollectionMappingDemo {

	public static void main(String[] args) {
		
		List<String> group_name = new ArrayList();
		group_name.add("Telecom: Idea");
		group_name.add("Steel : TMT");
		group_name.add("Clothes : Allen Soley");
		
		Groups gr = new Groups();
		gr.setGroupId("G-1");
		gr.setOwner_name("Aditya Birla Groups");
		gr.setGroups(group_name);
		
		
		Configuration con = new Configuration();
		con.configure("hbcls/nandha.cfg.xml");
		
		SessionFactory sf = con.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction t = ses.beginTransaction();
		
		ses.persist(gr);
		
		t.commit();
		ses.close();
		sf.close();
	}

}
