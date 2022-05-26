package mass1;

import java.util.Arrays;
import java.util.Scanner;
 
public class ex14 {
    public static void main(String[] args) {
        Scanner readStr = new Scanner(System.in);
        int n;
        
        System.out.print("Завдання № 13");
        System.out.print("Введіть розмір послідовності: ");
        n = readStr.nextInt();
        if (n > 10000 || n < 1){
            System.err.print("Помилка введених даних! Дані не задовольняють вимогу");
            System.exit(0);
        }
 
        Integer[] intN = new Integer[n];
        Arrays.fill(intN, 0); //заповнюємо нулями, якщо введених даних менше
        String strN;
 
        readStr = new Scanner(System.in);
        System.out.print("Введіть послідовність чисел через пробіл: ");
        strN = readStr.nextLine();
        String[] strArray = strN.split("\\s");
        for (int i = 0; i < strArray.length; i++){
            if(Integer.parseInt(strArray[i]) <= 109) intN[i] = Integer.parseInt(strArray[i]);
        }
 
        int k;
        readStr = new Scanner(System.in);
        System.out.print("Введіть число K: ");
        k = readStr.nextInt();
        readStr.close();
 
        System.out.println("\nПочаткова послідовність: " + Arrays.toString(intN) + "\n");
 
        int countMove;
        if (k > intN.length) k = k % intN.length;
 
        int[] newInt = new int[intN.length];
        for (int i = 0; i < intN.length; i++){
            if (k > intN.length - 1) k = 0;
            newInt[k] = intN[i];
            k++;
        }
 
        System.out.println("Після зсуву послідовність: " + Arrays.toString(newInt));
 
    }
}