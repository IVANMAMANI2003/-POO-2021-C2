
package prueba;

import java.util.Scanner;

public class Prueba {

    public void operacion (){
        Scanner teclado=new Scanner (System.in);
        int a=0, b=0;
        System.out.println("ingrese la primera variable a = ");
        a=teclado.nextInt();
        System.out.println("ingrese la segunda variable b = ");
        b=teclado.nextInt();


        if (a>b){
            System.out.println("\n a es mayor que b");
        }
        else if (a<b){
                System.out.println("\n a es menor que b");
            }
            else{
                System.out.println("\n a es igual que b");
            }
    }


    public static void main(String[] args) {
        Prueba resul=new Prueba ();
       resul.operacion ();


    }
}
