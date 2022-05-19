
/**
 * Write a description of class TreeNode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// Class TreeNode definition
public class TreeNode {
   // package access members
   TreeNode left;   // left node
   Employee data;        // data item
   TreeNode right;  // right node

   // Constructor: initialize data to d and make this a leaf node
   public TreeNode( Employee d )
   { 
      data = d;              
      left = right = null;  // this node has no children
   }

   // Insert a TreeNode into a Tree that contains nodes.
   // Ignore duplicate values.
   public void insert( Employee d )
   {
      if ( d.getId() < data.getId())
      {
         if ( left == null )
            left = new TreeNode( d );
         else
            left.insert( d );
      }
      else if ( d.getId() > data.getId())
      {
         if ( right == null )
            right = new TreeNode( d );
         else
            right.insert( d );
      }
   }
 
   
}// end class
