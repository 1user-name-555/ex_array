package mass1;

import java.util.Scanner;

public class ex16 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Завдання № 16"+ '\n');
        System.out.print("Введiть число n:"+ '\n');
        int n = in.nextInt();
    
        int[][] mass =new int [ n ][ n ];
    
    
        for (int i = 0; i < n; i++) {
            for (int ii = 0; ii < n; ii++) {
                if (i + ii < n - 1) {
                    mass[ i ][ ii ] = 0;}
                else if (i + ii == n - 1)
                    mass[ i ][ ii ] = 1;
                else
                    mass[ i ][ ii ] = 2;
            }
        }
        for(int i = 0; i < n; i++) {
            for(int ii = 0; ii < n; ii++) {
                System.out.print( mass[ i ][ ii ]+" ");
            }
            System.out.print("\n");
        }
        
    }
}
