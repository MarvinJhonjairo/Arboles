
package bstnode;

public class BST<E>{
    private BSTNode root;

   public BST(){
        root = null;
   }

   public boolean isEmpty(){
        return root == null;
   } 

   public BSTNode getRoot(){
        return root;
   }  
    
    public void put( String key, Object value ){
        if ( root == null ){
            root = new BSTNode( key, value );
        }
        else{
            root.put( key, value );
        }
    }

    public Object get( String key ){
        return root == null ? null : root.get( key );
    }
    
    public static void InorderPrint(BSTNode root){
        if ( root != null )
        {
        InorderPrint( root.getLeft() ); // Print items in left subtree.
        System.out.print( root.getString() + " " ); // Print the root item.
        InorderPrint( root.getRight()); // Print items in right subtree.
        }
    }
    

}
