
package bstnode;

// no imprime nada, pero maneja dos string

public class Pruebas {
    public static Object str;
    public static Object nuevo;
    public static int entero;
    public static void main(String[] args) {    
    
    BST tree = new BST();
    tree.put( "facil", "eff" );
    tree.put( "conjunto", "eee" );
    tree.put( "aire", "aye" );
    tree.put( "e", "sea" );
    tree.put( "iglu", "eye" );
    tree.put( "h", "aitch" );
    tree.put( "z", "zed" );
 //   String str = tree.get("i"); // str will equal "eye"
 //   tree.put( "i", "eye updated" );
 //   str = tree.get( "i" ); // str will equal "eye updated"


    System.out.println("BUSCAR");
    str = tree.get( "e" );      //objecto
     
    nuevo = "sea";                                  // Palabra que se desea buscar
    String AsString = "" + nuevo;                   // Lo coloca como tostring
    
    entero= AsString.compareTo(str.toString());     //como to string compara
    System.out.println(entero );                    // = 0 lo encontro
    System.out.println("Lo encontro = 0, sino =! 0");
    System.out.println("Impresion como objeto = "+ tree.get( "e" ));//imprime como objecto
     
    System.out.println();
    System.out.println("INordered Strings:");
    BST.InorderPrint(tree.getRoot());
    System.out.println();
    
    

}
}