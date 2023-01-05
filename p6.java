/*Pattern  1
2 3
4 5 6
7 8 9 10 */
public class p6 {
    public static void main(String[] args) {
        int i ,j,sum=0;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
                sum=sum+1;
                System.out.print(sum +" " );
                
            }
            
            System.out.println();
           
            
        }
    }
    
}
