/*
*	grupo  : 1ºgdam
*	alumno : Iván Sánchez García
*	n.exp. : 7245
*	fecha  : 01/06/2022
 */
package Cheese;

/**
 *
 * @author ___
 */
public class Main {
    
    
    
     public static void main(String[] args) {
         
    
         System.out.println("1º Gdam: Entornos de desarrollo");
         
         String cod1 = "001";
         Producto prod1 = new Producto(cod1, "Patito de goma", 2, 1.2);
         System.out.println(prod1);
         
         String cod2 = "002";        
         Producto prod2 = new Producto(cod2, "Esponja", 3, 1.2);
         System.out.println(prod2);
    }
}
