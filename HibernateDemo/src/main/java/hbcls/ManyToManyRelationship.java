package hbcls;

import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;

public class ManyToManyRelationship {

	public static void main(String[] args) {
		
		
		
		Question question = new Question();
		question.setQid("q-1");
		question.setQname("Expand WWW");
		Answer ans1 = new Answer();
		ans1.setAns_id("ans-1");
		ans1.setAns("World Web Wide");
		ans1.setPosted_by("abc");
		
		Answer ans2 = new Answer();
		ans2.setAns_id("ans-2");
		ans2.setAns("Web World Wide");
		ans2.setPosted_by("abc");
		
		Answer ans3 = new Answer();
		ans3.setAns_id("ans-3");
		ans3.setAns("World Wide Web");
		ans3.setPosted_by("abc");
		
		List<Answer> ans = new ArrayList();
		ans.add(ans1);
		ans.add(ans2);
		ans.add(ans3);
		question.setAnswer(ans);
		
		
		Configuration con = new Configuration();
		con.configure("hbcls/nandha.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction t = ses.beginTransaction();
		ses.persist(question);
		t.commit();
		ses.close();
		sf.close();
		
	}
}
