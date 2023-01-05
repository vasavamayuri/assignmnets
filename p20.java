/*Create a class to print an integer and a character with two methods having the same name but different sequence of the integer and the character parameters */

class PrintNumber {
    static void printn(int a, char ch)
     {
         
         System.out.println(a + " "+ ch);
     }
      static void printn(char ch ,int a)
     { 
         
        System.out.println(a + " "+ ch);
     }
 
 }
 public class p20 
 {
     public static void main(String[] args) {
         PrintNumber pe=new PrintNumber();
         PrintNumber.printn(10,'v');
         PrintNumber.printn('m',20);
         
     
 
 
     }
 }
