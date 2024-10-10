
import static method.Method.*;

public class main2 {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum / array.length);


        double[] array2 = {-7.6, 8.6, 5.6, 10.5, 17.6, 5.9};
        double min = array2[0];
        double max = array2[0];
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] < min) {
                min = array2[i];
            } else if (array2[i] > max) {
                max = array2[i];
            }
        }
        System.out.println(max);
        System.out.println(min);


        char[] chars1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (char c : chars1) {
            for (char vowel : vowels) {
                if (c == vowel) {
                    System.out.println(c);
                    break;
                }
            }
        }
        String scs = "Hello Java top";
       String scs2 = scs.replace(" ", "_");
       System.out.println(scs2);

       String string = "hello,bannan,werruel,good,bed";
       String[] strings = string.split(",");
       for (int i = 0; i < strings.length; i++) {
           System.out.println(strings[i]);
       }




    }
}