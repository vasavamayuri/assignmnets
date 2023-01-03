import java.util.Scanner;
public class Hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter teh charachter: ");
        char c = sc.next().charAt(0);
        int res = (int)(c);
        System.out.println("ASCII Value of charchter is : "+res);
        sc.close();
    }
}