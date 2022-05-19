package mass1;
import java.util.Scanner;
public class ex2 {
	public static void main(String args[]) {
		
		
		int q;
		do {
			int max ;
			int[] mass;
			
			Scanner in = new Scanner(System.in);
			System.out.print("Завдання № 2"+ '\n');
			System.out.print("Введіть кількість чисел"+ '\n');
			max=in.nextInt();
		
			if(1<=max&&max<=100) {// перевірка 1
				mass = new int[max];
				
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
//				
//				for (int i = 0; i < max; i++) {
//					System.out.print("Введіть число №"+(i+1)+'\n');
//					mass[i]=in.nextInt();
//				}
				System.out.print("Парні числа з масиву:");
				for (int i=0; i<max; i++) {
					if(mass[i]%2==0) {
						System.out.print(" "+mass[i]);
					}
				
				}
			
			q=0;
			}
			else {// кінець перевірки 1
				System.out.print("Спробуй попасти в діапазон (1≤N≤100)\n");
				q=1;
			}
		}while (q==1);
	}
}