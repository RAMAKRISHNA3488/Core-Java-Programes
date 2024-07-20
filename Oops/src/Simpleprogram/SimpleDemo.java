package Simpleprogram;

public class SimpleDemo {
	private int Id;
	private String Name;
	private String Email;
	private String Password;
	private String Mobile;
	

	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public String getMobile() {
		return Mobile;
	}


	public void setMobile(String mobile) {
		Mobile = mobile;
	}


	@Override
	public String toString() {
		return "Registation [Id=" + Id + ", Name=" + Name + ", Email=" + Email + ", Password=" + Password + ", Mobile="
				+ Mobile + "]";
	}
	public SimpleDemo(int Id,String Name,String Email,String Password,String Mobile) {
		this.Id=Id;
		this.Name=Name;
		this.Email=Email;
		this.Password=Password;
		this.Mobile=Mobile;
	}


	public static void main(String[] args) {
		SimpleDemo sd=new SimpleDemo(111, "Ramakrishna", "ramak@gmail.com", "test","1254698");
		System.out.println(sd);
		
		SimpleDemo sd2=new SimpleDemo(222, "surya", "surya@gmail.com", "fullstack","56987458");
		System.out.println(sd2);
		

	}

}
