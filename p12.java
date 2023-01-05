//Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.
public class p12 {
    public static void main(String[] args) {
        int n;
        for(n=1;n<=100;n++)
        {
            if(n%3==0 || n% 5==0)
            {
                System.out.println(n);
            }
        }
    }
    
}
