package mass1;
import java.util.Scanner;
import java.util.Arrays;
public class ex11 {
	public static void main(String args[]) {
		
		
		int q;
		do {
			int max,ch=0 ;
			int[] mass;
			
			Scanner in = new Scanner(System.in);
			System.out.print("Завдання № 11"+ '\n');
			System.out.print("Введіть кількість чисел"+ '\n');
			max=in.nextInt();
		
			if(1<=max&&max<=35) {// перевірка 1
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
				 int index = 0;
			        while (index < mass.length) {
			            int count = 0;
			            for (int i = index + 1; i < mass.length - count; i++) {
			                if (mass[i] == mass[index]) {
			                    System.arraycopy(mass, i + 1, mass, i, mass.length - i - 1);
			                    count++;
			                    i--;
			                }
			            }
			            mass = Arrays.copyOf(mass, mass.length - count);
			            index++;
			        }
			        System.out.println(mass.length);
			        
			q=0;
			}
			else {// кінець перевірки 1
				System.out.print("Спробуй попасти в діапазон (1≤N≤35)\n");
				q=1;
			}
		}while (q==1);
	}
}