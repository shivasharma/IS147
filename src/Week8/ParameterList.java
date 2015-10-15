package Week8;

/**
 * Created by Shiva on 10/14/2015.
 */
public class ParameterList {
    public static void main(String[] args) {

        int[] list = {2, 4, 6, 8, 9, 8};

        double result = average (list);
        System.out.println (result);
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

}
