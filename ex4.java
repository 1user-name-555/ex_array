package mass1;
import java.util.Scanner;
public class ex4 {
	public static void main(String args[]) {
		
		
		int q;
		do {
			int max,ch=0 ;
			int[] mass;
			
			Scanner in = new Scanner(System.in);
			System.out.print("Завдання № 4"+ '\n');
			System.out.print("Введіть кількість чисел"+ '\n');
			max=in.nextInt();
		
			if(1<=max&&max<=10000) {// перевірка 1
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
				System.out.print("Кількість елементів масиву, більших за попередній: ");
				for (int i=0; i<max; i++) {
					int ii=i;
					if(ii-1<0) {
						ii=0;
					}else {
						ii=i-1;
					}
					if(mass[i]>mass[ii]) {
						ch++;
					}
				
				}
			System.out.print(ch);
			q=0;
			}
			else {// кінець перевірки 1
				System.out.print("Спробуй попасти в діапазон (1≤N≤10000)\n");
				q=1;
			}
		}while (q==1);
	}
}