
public class test {

	
	static String city="Mumbai";
	static String revstr="";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println(city.length());
		
		for(int i=city.length()-1;i>=0;i--) {
			
			revstr+=city.charAt(i);
			
			
			
			
		}
		System.out.println(revstr);
	}

}
