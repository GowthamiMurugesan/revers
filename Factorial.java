import java.util.Scanner;
public class Factorial {

	public static void main(String[] args){
		int i,n;
		int fact=1;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for(i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println("the factorial is"+fact);
	}

}
