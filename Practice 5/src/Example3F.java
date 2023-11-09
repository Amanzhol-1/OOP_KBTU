public class Example3F {
	
    public static void main(String[] args) {
    	
        int i;
        int[] data = {50, 320, 97, 12, 2000};

        for (i = 0; i < 5; i++) {
        	try {
        		System.out.println(data[i]);
        	} catch(ArrayIndexOutOfBoundsException a) {
        		System.out.println("Array index out of bounds exception");
        	}
        }
 
        System.out.println("Done");
    }
}
     