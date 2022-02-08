import java.util.Scanner;



public class Bst {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
      Scanner scan= new Scanner(System.in);
      int T=scan.nextInt();
      
      int []array=new int [T];

      for (int i=0; i<T; i++){
           array[i]=scan.nextInt();
         } scan.close();
         for (int j=0;j<array.length; j++)
         {

      boolean prime= isPrime(array[j]);
      if (prime==false){
          System.out.println("Not prime");
      }else {System.out.println("Prime");
      }
          }
} 
    public static boolean isPrime(int n){
        if (n<=1)
                  return false;
              if (n==2)
                  return true;
              
          for (int i=2; i<=Math.sqrt(n);i++){
              
              if (n%i==0)
                  return false;}
             
                
              
               return true; 

            
    }
}

   
