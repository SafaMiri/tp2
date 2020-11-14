package ex1.prosit;
import java.util.Arrays;
import java.util.Scanner;
public class Ex1Prosit {
    private static Object sc;
       public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("veullez saisir la taille du tableau");
       int n=sc.nextInt();
       int x;
       for(int i=0;i<n;i++)
       {
           do{
               System.out.println("Donnez t["+ i + "] : ");
               x=sc.nextInt();
                          
           }while(x<0);
          
           
       }
        // we wrote a code which resolve this problem
        
        
    }
}
      
    
    

