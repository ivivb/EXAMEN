/*
 * Examen Entornos de desarrollo - Enunciado
 */

package Cheese;
/**
 * Imports del paquete
 */

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author CES
 */
public class ListaProductos {

    /**
     * Estructura HashMap para almacenar los productos de la lista de productos
     * @see "HashMap java doc"
     */
    private HashMap<String, Producto> listaP = new HashMap();
    
    /**
     * Cuenta calculada con el número de productos contenidos en la lista
     */
    private static int n = 0;


    
    private int getN() {
        return n;
    }

    private void setN(int n) {
        this.n = n;
    }
    /**
     * Comprueba si la cadena pasada es valida ( no está vacía)
     * @param campo cadena a analizar
     * @return True: Cadena vacía, False: Cadena correcta
     */
    private boolean check_null(String campo){
    
        if (campo.replace(" ","") == "")  return true; else return false;
    }
    
    /**
     * Añade productos
     * @param prod producto que se añadira
     * @return si es correcto, nos retornará el producto, si no es correcto, será nulo.
     */
    public Producto addProducto(Producto prod) {
        
        if (listaP.containsKey(prod.getcode())) {
            // System.out.println("Producto con código duplicado");
            return null;
        }
        n++;
        this.setN(n);
        listaP.put(prod.getcode(), prod);
        return prod;
    }

    /**
     * Elimina productos
     * @param codigo código del producto
     * @return nos devuelve el producto
     */
    public Producto eliminarProducto(String codigo) { 
        
        Producto prod = buscarProducto(codigo);
        if (prod != null) {
        listaP.remove(codigo);
        n--;
        this.setN(n);
        }
        return prod;
    }

    /**
     * Buscador de productos
     * @param codigo código del producto
     * @return si el código el correcto, nos devuelve el producto, si no, nos dará el código
     */
    public Producto buscarProducto(String codigo) { 
        Producto prod = null;
        
        if (!listaP.containsKey(codigo)) {
            return prod;
        }
        else{
            return listaP.get(codigo);
        }
    }

    /**
     * Es una lista con todos los productos que tenemos
     * @return nos devuelve lla lista de productos
     */
    public ArrayList<Producto> getProductos() {
        ArrayList<Producto> prodsList = new ArrayList<>();
        prodsList.addAll(listaP.values());
        return prodsList;
    }
    
    /**
     * Nos da el total de productos que tenemos
     * @return número de productos
     */
    public int totalProductos(){
            return this.getN();
    }
}
