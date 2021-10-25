
import java.lang.String;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;


public class Main {

    public static void main(String[] args) {


        int count=5;
        double amount =45.565656;
        float amount12=234.3434f;
        String result=String.format("%.2f", amount);
        System.out.printf("count is %d and amount is %s",count,result);

        DecimalFormat df= new DecimalFormat("#.###");
        String floatformat=df.format(amount12);
        System.out.println("The decimalformat value" + floatformat);
        System.out.println("The floatformat value" + floatformat);
        System.out.println("********************************************");
        double money = 100.1;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String moneyString = formatter.format(money);
        System.out.println(moneyString);

        double amount1 =200.0;
        System.out.println(NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(amount1));
        System.out.println(NumberFormat.getCurrencyInstance(new Locale("de", "DE")).format(amount1));
        System.out.println(NumberFormat.getCurrencyInstance(new Locale("zh", "CN")).format(amount1));

        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println(n.format(1000));

    }

}
