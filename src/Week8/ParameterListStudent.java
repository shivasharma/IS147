package Week8;

/**
 * Created by Shiva on 10/14/2015.
 */
public class ParameterListStudent {

    public static void main(String[] args) {


        //First overload method called
        int[] list = {2, 4, 6, 8, 9, 8};
        double result = average (list);
        System.out.println (result);

        //Second overload method called
        double[] listDouble = {2.5,3.5};
        double resultDouble = average (listDouble);
        System.out.println (resultDouble);
    }


    public static double average (int ... list)
    {
        double result = 0.0;
        if (list.length != 0)
        {    int sum = 0;
            for (int num : list)
                sum += num;
            result = (double)sum / list.length;
        }
        return result;
    }

    public static double average (double [] listDouble)
    {
        double result = 0.0;
        if (listDouble.length != 0)
        {   int sum = 0;
            for (double num : listDouble)
                sum += num;
            result = (double)sum / listDouble.length;
        }
        return result;
    }
}
