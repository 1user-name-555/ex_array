package mass1;

import java.io.InputStream;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ex17 {
    
    static int[][] getMatrix(InputStream is, int x, int y) {
        var array = new int[y][];
        Scanner scanner = new Scanner(System.in);
        IntStream.range(0, y).forEach(i -> {
            array[i] = new int[x];
            IntStream.range(0, x).forEach(j -> array[i][j] = scanner.nextInt());
        });

        return array;
    }
    
    public static void main(String args[]) {
    
        Scanner in = new Scanner(System.in);
        System.out.print("Завдання № 17"+ '\n');
        System.out.print("Введiть число n:"+ '\n');
        int n=in.nextInt();
        System.out.print("Введiть масив"+ '\n');
        
        int[][] a=new int[n][n];
        
        a=getMatrix(null, n,n);
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j){
//              System.out.print(a[i][j]+ " ");
                if(a[i][j] != a[j][i]){
                    System.out.print("no");
                    System.exit(0);
                }
            }
//          System.out.print('\n');
        }
        System.out.print("yes");
    
    
    }   
}


