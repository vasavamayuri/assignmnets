import java.util.Scanner;
public class p2 {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any character");
        char ch = sc.next().charAt(0);
        int length;
        
        if(((ch >= 'A' && ch <= 'Z')||ch >= 'a' && ch <= 'z') || length >1)
        {
        
          
        if(ch=='a'|| ch =='e' || ch =='i' || ch=='o' || ch=='u')
        {
            System.out.println(  ch+" is a vowel");
        }
        else 
        {
            System.out.println(  ch+" is a Consonant");
        }
    }else
    {
        System.out.println("only enter alphabets");
    }
    }
    
}
