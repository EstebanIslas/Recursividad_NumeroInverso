/*
 * Islas Santos Esteban.
 * Universidad Tencológica de Tulancingo.
 */
package main;

/**
 *
 * @author USUARIO
 */
public class Main {

    
    public static void main(String[] args) {
        Main main = new Main();
        
        System.out.println("invertir numero " + main.invertirNumero(123));//3 
    }
    
     private static String invertirNumero(int num) {
        if(num<10){
            return String.valueOf(num);
        } else {
            return  String.valueOf(num%10) + invertirNumero(num/10);
        }
    }
     
    
}
