package le_main;

public class Stuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yes = 1;
		double pi = 3.1415926535;
		boolean stuff = true;
		char b = 'k';
		
		Profile mary = new Profile("CrustyCosby", "1232134", false, -1000);
		
		System.out.println(Calculator.add(2, 3));
		System.out.println(mary.login("CrustyCosby", "123134"));
		
	}
	
	

}
