package hbcls;

import javax.persistence.*;

@Entity
@Table(name="customer")
public class Customer {

	private String cust_id , cust_name;
	private String cust_email;
	private Transaction_Info trans;
	
	@Id
	@Column(name="custid",length = 30)
	public String getCust_id() {
		return cust_id;
	}
	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}
	
	@Column(name="custname",length = 100)
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	
	@Column(name="custemail",length = 200)
	public String getCust_email() {
		return cust_email;
	}
	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}
	
	@OneToOne(targetEntity = Transaction_Info.class,cascade = CascadeType.ALL)
	public Transaction_Info getTrans() {
		return trans;
	}
	public void setTrans(Transaction_Info trans) {
		this.trans = trans;
	}
	
	
	
}
