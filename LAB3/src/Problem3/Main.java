package Problem3;
public class Main {
    public static void main(String[] args) {
        MyArray<String> array = new Array<>(2);
        System.out.println("Array empty? " + array.isEmpty()); 

        array.add("Element 1");
        array.add("Element 2");
        
        System.out.println("Array size: " + array.size()); 

        try {
            array.add("Element 3");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        } 

        System.out.println("Array empty? " + array.isEmpty()); 
    }
}

