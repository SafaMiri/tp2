package ex1.tableau;
import java.util.*;
import java.util.Scanner;
public class Ex1Tableau {
        public static void main(String[] args) {
       char c;

        Scanner scan = new Scanner(System.in);
        //choix de la taille du tableau
        System.out.println("Veuillez préciser la taille du tableau");
        int n= scan.nextInt();
        char [] tableau= new char[n];

        //remplissage du tableau
        for (int i=0;i<n;i++){
            System.out.print("\tT["+(i)+"]=");
            c= scan.next().charAt(0);
            tableau[i]=c;
        }
        //affichage du tableau
        for (int i=0;i<n;i++) {
            System.out.print(tableau[i]+"|");
        }

        //calcul d'occurences
        System.out.print("\nDonner le caractère à calculer l'occurence :");
        c=scan.next().charAt(0);
        int occ=0;
        for (int i=0;i<n;i++)
            if (tableau[i] == c)
                occ++;
        System.out.println("Le nombre d'occurence de "+ c+" est: "+occ);

        //recherche du caractère
        System.out.println("Donner le caractère à chercher");
        c=scan.next().charAt(0);
        occ=0;
        for (int i=0;i<n;i++) {
            if (tableau[i] == c){
                occ++;
                if (occ==1)
                    System.out.print("\nLe caractère existe dans la(les) position(s):\t"+i);
                else
                    System.out.print("\t"+i);
            }
            if( (occ==0) && (i==n-1) )
                System.out.println("Le caractère n'existe pas");
        }

        //suppression de la premiere occurence d'un caractère
        System.out.println("\nDonner le caractère à en supprimer la premiere occurence");
        c = scan.next().charAt(0);

        for (int i=0,out=0;(i<n) && (out==0);i++)
            if (tableau[i] == c){
                out=1;
                n--;
                for(int j=i;j<n;j++)
                    tableau[j]= tableau[j+1];

            }
        for (int i=0;i<n;i++)
            System.out.print(tableau[i]+"|");

        //suppression de toutes les  occurences du caractère
        System.out.println("\nDonner le caractère à en supprimer toutes les occurences");
        c = scan.next().charAt(0);
        for (int i=0;i<n;i++){

            if (tableau[i] == c){
                for(int j=i;j<n-1;j++)
                tableau[i]=tableau[j+1];
            n--;
            i--;

            }
        }
        for (int i=0;i<n;i++){
            System.out.print(tableau[i]+"|");
        }
    }

}
