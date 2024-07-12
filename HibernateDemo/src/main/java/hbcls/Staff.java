package hbcls;

public class Staff {

	private String staff_id , staff_name;
	
	private StaffAddress address;

	public String getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
	}

	public String getStaff_name() {
		return staff_name;
	}

	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}

	public StaffAddress getAddress() {
		return address;
	}

	public void setAddress(StaffAddress address) {
		this.address = address;
	}
}
