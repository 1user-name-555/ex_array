package mass1;

import java.io.InputStream;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ex18 {
    
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
        System.out.print("Завдання № 18"+ '\n');
        System.out.print("Введiть число n та m:"+ '\n');
         String vvod=in.nextLine();
         String[] tok=vvod.split(" ");
         int n=Integer.parseInt(tok[0]);
         int m=Integer.parseInt(tok[1]);
         
        System.out.print("Введiть масив"+ '\n');



         
        int[][] mass=new int[n][m];
        int[] sum=new int[n];
        mass=getMatrix(null, n,m);
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j){
                sum[i]+=mass[i][j];
                
            }
        }
        int ss = 0;
        for(int i=0; i<n;i++) {
            if(sum[i]>sum[Math.abs(i-1)]) {
                ss=i;
            }
        }
        System.out.print(sum[ss]+"\n"+ss);

    }   
}


