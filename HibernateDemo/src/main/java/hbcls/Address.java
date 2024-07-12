package hbcls;

import javax.persistence.*;

@Entity
@Table(name="collegeaddress1")
public class Address {
	
	private String addr_id;

	@Id
	@Column(name="addrid",length = 30)
	public String getAddr_id() {
		return addr_id;
	}

	public void setAddr_id(String addr_id) {
		this.addr_id = addr_id;
	}

	private String addr1 , addr2 , street;
	
	private Student_Info stud;

	@Column(name="addr1",length=100)
	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	@Column(name="addr2",length=100)
	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	@Column(name="street",length=100)
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@ManyToOne(targetEntity = Student_Info.class, cascade = CascadeType.ALL)	
	public Student_Info getStud() {
		return stud;
	}

	public void setStud(Student_Info stud) {
		this.stud = stud;
	}
}
