package Week8;


public class PrintArrayArgument {

    public static void main(String[] args){
        // method printArray to print Integer array
        Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Printing Arrays");
        printArray(integerArray); // pass an Integer array

    }

    public static void printArray(Integer[] inputArray) {
        // display array elements
        for (Integer element : inputArray)
            System.out.println (element);
        System.out.println();
    }
}
