package ejemplos;
import java.util.*;


public class examen {
	static Scanner tec = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0, n=0,sum=0,Ce,De,Un;
System.out.print("Introduce un número entero: ");
n=tec.nextInt();

 
Ce =(n/100); 
De = ((n - (Ce * 100))/10); 
Un =n - (Ce * 100) - (De * 10);
sum=Un+De+Ce;
System.out.print(sum);

//System.out.print(sum1);
	}


}
