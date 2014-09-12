
package bstnode;

import java.io.*;
import java.util.*;


public class Pruebas {
    static Object str;
    static Object nuevo;
    static int entero;
    static String sCadena;
    static ArrayList palabras = new ArrayList();
    static String palabras2[]=new String[2];

//inicio del programa
//------------------------------------------------------------//
    public static void main(String[] args) {    

        BST tree = new BST();
//------------------------------------------------------------//
//lectura del archivo de texto
//-----------------------------------------------------------//    
        String oracion;
        String palabra1;
        String palabra2;
        try {
            FileReader fr = new FileReader("diccionario.txt");
            BufferedReader bf = new BufferedReader(fr);
            while((oracion = bf.readLine())!=null){
                
                oracion=oracion.replace("(","");
                oracion=oracion.replace(")","");
                palabras2=oracion.split(",");
                tree.put(palabras2[0],palabras2[1]);

            }
            } catch (FileNotFoundException fnfe){
                fnfe.printStackTrace();
            } catch (IOException ioe){
                    ioe.printStackTrace();
            }
//-----------------------------------------------------------//

//-----------------------------------------------------------//

        System.out.println("");   
        System.out.println("Traduccion");

//-----------------------------------------------------------//
//se lee el archivo a traducir y se separa en palabras
//las palabras de guardan en una arraylist
//-----------------------------------------------------------//
        String oracion2;
        String palabra3;
        try {
            FileReader fr = new FileReader("texto.txt");
            BufferedReader bf = new BufferedReader(fr);
            // Leemos la primera linea
            oracion2 = bf.readLine();

            int contador = 0;
            StringTokenizer st = new StringTokenizer (oracion2);
            // bucle por todas las palabras
            while (st.hasMoreTokens()){
                palabra3 = st.nextToken();
                palabras.add(palabra3);
                contador++;
            }
            }catch (FileNotFoundException fnfe){
                fnfe.printStackTrace();
            }catch (IOException ioe){
                ioe.printStackTrace();
            }
//-----------------------------------------------------------//
//recorre el array para ver si la palabra se puede traducir
//-----------------------------------------------------------//
    
        for(int i=0;i<palabras.size();i++){
            nuevo = palabras.get(i);                        // Palabra que se desea buscar
         String AsString = "" + nuevo;                   // Lo coloca como tostring
            str = tree.get( AsString );
 
            if(str!=null){                                  //si encontro la palabra, se cambia por la traduccion en espa;ol
                System.out.print(str+" ");
            }else{                                          //si no encontro la palabra, se imprime en ingles
                System.out.print("*"+nuevo+"* ");
            }
        }
                
 //-----------------------------------------------------------//
        System.out.println("");   
        System.out.println();
        System.out.println("InOrdered Strings:");           //se imprime el arbol en In-orden
        BST.InorderPrint(tree.getRoot());
        System.out.println();        
//-----------------------------------------------------------//
    }
}
