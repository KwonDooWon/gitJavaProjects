package testProject;

public class Customer {
	private String name;
	private String id;
	private String password;
	private String email;
	
	public Customer(String name, String id, String password, String email) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.email = email;
		
		System.out.println("이름 : " + this.name);
		System.out.println("이메일 : " + this.email);
	    System.out.println("아이디 : " + this.id);
	    System.out.println("비밀번호 : " + this.password);
	    System.out.println("회원정보가 정상적으로 등록되었습니다.");
	}
	
	public void setname(String name) {
	      this.name = name;
	}
	
	public void setid(String id) {
	      this.id = id;
	}
	
	public void setpassword(String password) {
	      this.password = password;
	}
	
	public void setemail(String email) {
	      this.email = email;
	}
	
	public String getname() {
	      return name;
	}
	
	public String getid() {
	      return id;
	}
	
	public String getpassword() {
	      return password;
	}
	
	public String getemail() {
	      return email;
	}
	
	public boolean equals(String id, String password) {
		return (this.id.equals(id) && this.password.equals(password));
	}
	
	public boolean idCheck(String id) {
		return (this.id.equals(id));
	}
	
	public boolean passwordCheck(String password) {
		return (this.password.equals(password));
	}
	
	public String toString() {
	       String str = this.name + "\t" + this.id + "\t" + this.password+ "\t" + this.email; 
	        return str;
	}

}
