package Problem5;

public class TestSorting {

    public static void main(String[] args) {
    	
        Chocolate[] chocolates = {
            new Chocolate(100, "Milk Chocolate"),
            new Chocolate(50, "Dark Chocolate"),
            new Chocolate(75, "White Chocolate")
        };

        System.out.println("До сортировки:");
        printArray(chocolates);

        Sort.bubbleSort(chocolates);

        System.out.println("После пузырьковой сортировки:");
        printArray(chocolates);

        Time[] times = {
            new Time(14, 30, 0),
            new Time(9, 15, 0),
            new Time(18, 45, 0)
        };

        System.out.println("До сортировки:");
        printArray(times);

        Sort.mergeSort(times);

        System.out.println("После сортировки слиянием:");
        printArray(times);
    }

    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
        System.out.println();
    }
}
