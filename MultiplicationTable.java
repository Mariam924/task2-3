
package multiplication.table;
import java.util.Scanner;
public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        int num;
        System.out.print("Enter a number  ");
        num=read.nextInt();
        
        for(int i=1;i<=num;i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print(i*j +"  ");
            }
            System.out.println();
        }
                
                
                
                
                
                
                
                
                
                
        }
    }

        
        
    
    

