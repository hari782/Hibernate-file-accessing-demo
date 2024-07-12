package hbcls;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ComponentMappingDemo {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Staff ID : ");
		String staff_id = sc.nextLine();
		
		System.out.println("Staff Name : ");
		String staff_name = sc.nextLine();
		
		System.out.println("Address1: ");
		String addr1 = sc.nextLine();
		
		System.out.println("Address2: ");
		String addr2 = sc.nextLine();
		
		System.out.println("Street : ");
		String street = sc.nextLine();
		
		System.out.println("City : ");
		String city = sc.nextLine();
		
		System.out.println("Pincode : ");
		String pincode =  sc.nextLine();
		
		StaffAddress address = new StaffAddress();
		address.setAddress1(addr1);
		address.setAddress2(addr2);
		address.setStreet(street);
		address.setCity(city);
		address.setPincode(pincode);
		
		Staff staff = new Staff();
		staff.setStaff_id(staff_id);
		staff.setStaff_name(staff_name);
		staff.setAddress(address);
		
		Configuration con = new Configuration();
		con.configure("hbcls/nandha.cfg.xml");
		
		SessionFactory sf = con.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction t = ses.beginTransaction();
		
		ses.persist(staff);
		t.commit();
		ses.close();
		sf.close();
	}
}
