package mass1;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class ex15 {
	public static void main(String args[]) {
		
		
		int q;
		
			int max=9,ch=0 ;
			Integer[] mass;
			
			Scanner in = new Scanner(System.in);
			System.out.print("Завдання № 15"+ '\n');
		
				mass = new Integer[max];
				
				int q2;
				do {
					System.out.print("Введіть натуральні числа"+ '\n');
					 String vvod=in.nextLine();
					 String[] tok=vvod.split(" ");
					 
						 
					 if(tok.length<=max && tok.length>0) { // перевірка 
						 
						 
						 for (int i=0; i<tok.length;i++) { 
					            int x=Integer.parseInt(tok[i]);
					            mass[i]=x;		
					        }
					 q2=0;
					 }
					 else {// кінець перевірки 
						 System.out.print("Ви ввели явно не <="+max+" чисел"+ '\n');
						 q2=1;
					 }
					 

				}while(q2==1);

				if(0==0) {
					
					int N;
					
					N=mass.length;
					
				  
				    
				    for(int i = 0, count = 0; i < N-2; i++)
				    {   int L = i;
				        int R = i + 1;
				        while(mass[L] == mass[R])
				        {   int cnt = 2;
				            while((--L >= 0) && (mass[L] == mass[R]  )) cnt++;
				            while((++R <  N) && (mass[R] == mass[L+1])) cnt++;
					        if(R>=mass.length) R=mass.length-1;
				            if(cnt < 3) break;
				            count += cnt;
				        }
				        if(count!=0){   System.out.print(count); System.exit(0); }
				    }
				    
				    System.out.print(0);
				}				
	}
}