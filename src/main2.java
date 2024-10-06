
import static method.Method.*;

public class main2 {

    public static void main(String[] args) {
        int x = 5;
        int y = square(5);
        System.out.println(y);

        String name = "bob";
        String fuullname = "ibanelevilo";
        System.out.println(printFullName(name, fuullname));


        String[] macciv = {"da", "dqwdqwdqwdq", "dqwdqwdqwdqwqqqqqqqq", "dqdqwdqwdq"};
        String[] vsvod = corneyValuesArray(macciv);
        System.out.println("max : " + vsvod[0]);
        System.out.println("min : " + vsvod[1]);

    }
}