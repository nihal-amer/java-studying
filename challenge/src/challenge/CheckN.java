package challenge;
import java.util.Scanner;
public class CheckN {
	public static void MultipleI (int n ) {
		if (n<2 && n>20) {
			System.out.println("Error");
		}
		for ( int i =1 ;i<11; i++) {
			 int result= n*i;
			 System.out.println(n +" x " + i + " = "+ result );
		}
	}
	


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
      MultipleI(n);
      
        scanner.close();
}
}