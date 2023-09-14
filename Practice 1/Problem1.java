import java.util.Scanner; 

public class Problem1{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input name: ");
		String userName = in.nextLine();
		in.close();
		
		System.out.print("+");
		
		for (int i = 0; i < userName.length(); i++) {
			System.out.print("-");
		}
		
		System.out.println("+");
		System.out.print("|");
        System.out.print(userName); 
        System.out.println("|"); 
        
        
        System.out.print("+"); 
        
        for (int i = 0; i < userName.length(); i++) {
        	System.out.print("-");
        }
        
        System.out.print("+"); 
	}
}