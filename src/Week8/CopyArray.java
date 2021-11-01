 public static void main(String[] student) {

        int arr1[] = { 0, 1, 2, 3, 4, 5 };
        int arr2[] = { 5, 10, 20, 30, 40, 50 };
        System.arraycopy(arr1, 0, arr2, 0, 2);

        System.out.print("arr2 = ");
        System.out.print(arr2[0] + " ");
        System.out.print(arr2[1] + " ");
        System.out.print(arr2[2] + " ");
        System.out.print(arr2[3] + " ");
        System.out.print(arr2[4] + " ");


    }
/*
Parameters
src − This is the source array.
srcPos − This is the starting position in the source array.
dest − This is the destination array.
destPos − This is the starting position in the destination data.
length − This is the number of array elements to be copied.
Return Value
This method does not return any value.
*/
