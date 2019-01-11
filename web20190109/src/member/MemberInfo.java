package member;

import java.util.Date;

public class MemberInfo {
	
	private String id;
	private String password;
	private String name;
	private String address;
	private Date registerDate;
	private String email;
	
	

	public MemberInfo() {}  // default 생성자 명시적으로 써줌

	public MemberInfo(String id, String password, String name, String address, Date registerDate, String email) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.registerDate = registerDate;
		this.email = email;
	}

	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name 
				+ ", address=" + address + ", registerDate=" + registerDate 
				+ ", email=" + email + "]";
	}
		

}
