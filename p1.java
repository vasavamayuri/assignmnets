
//Write a Java program to Take three numbers from the user and print the greatest number.
import java.util.Scanner;
public class p1 {
    public static void main(String[] args) {
        int x,y,z;
        
       Scanner sc= new Scanner(System.in);
       System.out.println("Enetr first number"  );
      
          x= sc.nextInt();
          System.out.println("Enetr second number" );
          y= sc.nextInt();
         
          System.out.println("Enetr third number"  );
          z= sc.nextInt();
        
         
         
        if(x>y && x>z)
        { 
            System.out.println("X is a Greater");

        }
        else if( y>z){
            System.out.println("Y is greater");

        }else{
            System.out.println("z is greater");
        }



        
    }
    
}
