import java.math.BigInteger;
import java.util.Arrays;


public class HelloWorld {
    public static void main(String[] args) {

    }


    //Метод для проверки, является ли модуль заданного числа степенью двойки
    public static boolean isPowerOfTwo(int value) {
        return (Integer.bitCount(Math.abs(value)) == 1);
    }


    //Метод проверки предложения на то, является ли оно палиндромом без учёта знаков препинания и пробелов
    public static boolean isPalindrome(String text) {
        StringBuilder reversed = new StringBuilder(text);
        String formatted_reversed = reversed.reverse().toString().replaceAll("[^a-zA-Z0-9]", "");
        String formatted = text.replaceAll("[^a-zA-Z0-9]", "");
        return formatted.equalsIgnoreCase(formatted_reversed);
    }


    //Метод для вычисления факториала, стоящего на N месте числовой прямой
    public static BigInteger factorial(int N) {
        BigInteger result = new BigInteger("1");
        for (int i = 1; i < N + 1; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result; 
    }

    
    //Метод для слияния двух отсортированных массивов в один
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int len1 = a1.length;
        int len2 = a2.length;
        int[] result = new int[len1 + len2];
        
        while (i < len1) { 
            result[k++] = a1[i++];
        }

        while (j < len2) { 
            result[k++] = a2[j++];
        }
        Arrays.sort(result);
        return result;
    }
}
