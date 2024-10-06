package method;

import java.util.Arrays;

public class Method {

    public static void main(String[] args) {

    }

    public static int square(int a) {

        return a * a;
    }

    public static String printFullName(String a, String b) {
        String fullname = a + " " + b;
        return fullname;

    }

    public static String[] corneyValuesArray(String[] a) {
        String max = a[0];
        String min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() > max.length()) {
                max = a[i];
            } else if (a[i].length() < min.length()) {
                min = a[i];
            }
        }
        String[] maxmin = new String[2];
        maxmin[0] = max;
        maxmin[1] = min;
        return maxmin;
    }
}