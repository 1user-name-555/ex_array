package mass1;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class ex12 {
	public static void main(String args[]) {
		
		
		int q;
		do {
			int max,ch=0 ;
			Integer[] mass;
			
			Scanner in = new Scanner(System.in);
			System.out.print("Завдання № 12"+ '\n');
			System.out.print("Введіть кількість чисел"+ '\n');
			max=in.nextInt();
		
			if(1<=max&&max<=100) {// перевірка 1
				mass = new Integer[max];
				
				int q2;
				 in.nextLine();
				do {
					System.out.print("Введіть "+max+" чисел через пробіл"+ '\n');
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
				Arrays.sort(mass, Collections.reverseOrder());
				
				int q3=0;
				Integer height;
				do {
					 System.out.print("Введіть ріст Петі (максимум 300)"+ '\n');
					 height=in.nextInt();
					 if(height<300&&height>0) {
						 for (int i = 0; i < max; i++) {
								if(height<=mass[i]) {
									ch=i+2;
								}
							}
					 }
					 else {
						 System.out.print("Спробуй ще раз"+ '\n');
						 q3++;
					 }
					
					
				}while(q3!=0);
				
				
				for (int i = 0; i < max; i++) {
					System.out.print(mass[i]+" ");

				}
				System.out.print("\n"+ch);
			q=0;
			}
			else {// кінець перевірки 1
				System.out.print("Спробуй попасти в діапазон (1≤N≤35)\n");
				q=1;
			}
		}while (q==1);
	}
}