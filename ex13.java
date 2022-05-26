package mass1;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class ex13 {
	public static void main(String args[]) {
		
		
		int q;
		
			int max=5,ch=0 ;
			Integer[] mass;
			
			Scanner in = new Scanner(System.in);
			System.out.print("Завдання № 13"+ '\n');
		
				mass = new Integer[max];
				
				int q2;
				do {
					System.out.print("Введіть натуральні числа N, A, B, C, D."+ '\n');
					System.out.print("Зауважте (A < B; C < D; 1 ≤ A, B, C, D ≤ N)."+ '\n');
					 String vvod=in.nextLine();
					 String[] tok=vvod.split(" ");
					 
						 
					 if(tok.length==max) { // перевірка 2
						 
						 
						 for (int i=0; i<tok.length;i++) { 
					            int x=Integer.parseInt(tok[i]);
					            mass[i]=x;		
					        }
					 q2=0;
					 }
					 else {// кінець перевірки 2
						 System.out.print("Ви ввели явно не "+max+" чисел"+ '\n');
						 q2=1;
					 }
					 

				}while(q2==1);

				if(0==0) {
					int n = mass[0];
			        int a = mass[1];
			        int b = mass[2];
			        int c = mass[3];
			        int d = mass[4];  
			        
			        int[] x = new int[n + 1];
			        int[] y = new int[n + 1];
			 
			        for (int i = 1; i <= n; i++) {
			            x[i] = i;	
			            y[i] = x[i];
			        }
			        for (int i = 0; i <= b - a; i++) {
			            x[a + i] = y[b - i];
			        }
			        for (int i = 1; i <= n; i++) {
			            y[i] = x[i];
			        }
			 
			        for (int i = 0; i <= d - c; i++) {
			            x[c + i] = y[d - i];
			        }
			 
			        for (int i = 1; i <= n; i++) {
			            System.out.print(x[i] + " ");
			        }
				}				
	}
}