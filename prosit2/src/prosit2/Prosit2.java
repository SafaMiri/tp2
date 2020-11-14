package prosit2;
import java.util.Scanner;
import java.util.Random;
public class Prosit2 {
       public static void main(String[] args) {
        Scanner nombre=new Scanner(System.in);
        int Nv1=0,Nv2=0;
        System.out.println("saisir un entier");
        int nob = nombre.nextInt();
        while((Nv2>=10)&&(Nv1>=15))
        {
        System.out.println("tirer un entier au hasard");
        Random r = new Random();
        int Mys = r.nextInt(101);
        if(nob>Mys){
            System.out.println("le nombre mystére est inf a le nob saisie");
        }
        else{
            System.out.println("le nombre mystére est sup a le nob saisie");
        }
        
        
        
        }        }
        
        }

           
        
       
    
    

