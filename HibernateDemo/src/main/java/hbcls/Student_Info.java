package hbcls;

import javax.persistence.*;

@Entity
@Table(name="student_info1")
public class Student_Info {

	private String rollno , stname;	
	private Address addr;

	@Id	
	@Column(name="rollno",length = 30)
	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	@Column(name="stname",length = 100)
	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	@OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)	
	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
}
