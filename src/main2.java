
import static method.Method.*;

public class main2 {

    public static void main(String[] args) {

        int x = 5;
        int y = square(5);
        System.out.println(y);

        String name = "bob";
        String fuullname = "ibanelevilo";
        System.out.println(printFullName(name,fuullname));


        String[] macciv = {"da", "dqwdqwdqwdq", "dqwdqwdqwdqwqqqqqqqq", "dqdqwdqwdq"};
        String[] vsvod = corneyValuesArray(macciv);
        System.out.println("max : " + vsvod[0]);
        System.out.println("min : " + vsvod[1]);


        int[] arrays = new int[]{5, 56, 5453, 543, 11113, 3123123,};
        int[] maxmin = corneyValuesArray(arrays);
        System.out.println("max : " + maxmin[0]);
        System.out.println("min : " + maxmin[1]);


        char [] maxminchar = new char[] { 's','f','z','s','i'};
        char [] resultmaxminchar = corneyValuesArray(maxminchar);
        System.out.println("maxminchar : " + resultmaxminchar[0]);
        System.out.println("minminchar : " + resultmaxminchar[1]);

    }
}