package hbcls;

import javax.persistence.*;

@Entity
@Table(name="transaction")
public class Transaction_Info {

	private String trans_id , prod_name;
	private int qty;
	private double total;
	private Customer customer;
	
	@Id
	@Column(name="transid",length = 30)
	public String getTrans_id() {
		return trans_id;
	}
	
	public void setTrans_id(String trans_id) {
		this.trans_id = trans_id;
	}
	
	@Column(name="prodname",length = 150)
	public String getProd_name() {
		return prod_name;
	}
	
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	
	@Column(name="qty",length = 3)
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	@Column(name="total",length=5)
	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	
	@OneToOne(targetEntity = Customer.class,cascade = CascadeType.ALL)
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
