
package Week3;

import java.math.BigDecimal;

public class CheckDataType {
    public static void main(String[] args) {
        String str = "Sample String";
        System.out.println(str.getClass().getSimpleName());

        int x = 5;
        System.out.println(((Object)x).getClass().getSimpleName());

        double y = 5.0;
        System.out.println(((Object)y).getClass().getSimpleName());

        boolean z = false;
        System.out.println(((Object)z).getClass().getSimpleName());
    }
}
