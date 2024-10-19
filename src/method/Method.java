package method;

public class Method {

    // принимает значение инта
    public static int square(int a) {

        return a * a;  // возврат умноженного само на себя значения
    }

    public static String printFullName(String... a) {// принимает несколько строк
        if (a == null || a.length == 0) {
            return "ничего не произойедт ))";
        }

        String[] strings = new String[a.length];
        strings[0] = a[0];
        strings[1] = a[1];
        String fullname = strings[0] + " " + strings[1]; // сложение строк в одну
        return fullname;  // ретерн плонго имя фамилии

    }

    public static String[] corneyValuesArray(String... strings) { // принял стринг вернет массив стринга
        if (strings == null || strings.length == 0) {
            return new String[]{" ниче не ввели"};
        }

        String max = strings[0];
        String min = strings[0];
        for (int i = 0; i < strings.length; i++) { // провекра циклом макс и мин значения
            if (strings[i].length() > max.length()) {
                max = strings[i];
            } else if (strings[i].length() < min.length()) {
                min = strings[i];
            }
        }
        String[] maxmin = new String[2]; // массив из вдух строк
        maxmin[0] = max; // присваевате мах
        maxmin[1] = min; // присваевает мин
        return maxmin; // ретерн массива
    }

    public static int[] corneyValuesArray(int... a) { // принял  инт вернет массив инт
        if (a == null || a.length == 0) {
            System.out.println("ничего не ввели");
            int[] error = new int[2];
            error[0] = 0;
            error[1] = 0;
            return error;


        }

        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i++) {  // провекра циклом макс и мин значения
            if (a[i] > max) {
                max = a[i];

            } else if (a[i] < min) {
                min = a[i];

            }
        }
        int[] massivmaxmin = new int[2];
        massivmaxmin[0] = max;
        massivmaxmin[1] = min;

        return massivmaxmin; // ретерн масиива интов
    }

    public static char[] corneyValuesArray(char... a) {
        if (a == null || a.length == 0) {
            System.out.println("ничего не ввели");
            char[] error = new char[2];
            error[0] = '0';
            error[1] = '0';
            return error;

        }
        char max = a[0];
        char min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];
            }
        }
        char[] maxmin = new char[2];
        maxmin[0] = max;
        maxmin[1] = min;


        return maxmin;
    }
     public static long  factorial (int a){
        if (a == 0){
            return 0;
        } else if (a == 1){
            return 1;
        }else {
            return a * factorial(a-1);
        }

    }
}

