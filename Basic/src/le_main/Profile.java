package le_main;

public class Profile {
	
	// Instance variables
	private String username;
	private String password;
	private boolean isMale;
	private int age;
	
	// Constructor
	public Profile(String username, String password, boolean isMale, int age) {
		this.username = username;
		this.password = password;
		this.isMale = isMale;
		this.age = age;
	}
	public boolean login(String username, String password) {
		return this.username.equals(username) && this.password.equals(password);
	}
}
