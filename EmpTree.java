
/**
 * Write a description of class EmpTree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmpTree
{
   
   private TreeNode root;

   // Construct an empty Tree of integers
   public EmpTree() { root = null; }

   // Insert a new node in the binary search tree.
   // If the root node is null, create the root node here.
   // Otherwise, call the insert method of class TreeNode.
   public void insertNode( Employee d )
   {
      if ( root == null )
         root = new TreeNode( d );
      else
         root.insert( d );
   }

  
    public void displayAll()
   {
       displayInorder(root);
   }  
    
   // Recursive method to display the details of Employee (using inorder traversal) 
   private void displayInorder(TreeNode node)
   { 
       if (node == null) // base case
        return;
        
        displayInorder (node.left); // node.left
        System.out.println(node.data.toString()); // node.data.toString()
        displayInorder (node.right);
    }  
  
    // Write method to display using preorder traversal
   private void displayPreorder(TreeNode node)
    {
        if (node == null)
            return;
 
        /* first print data of node */
        System.out.print(node.data.toString());
 
        /* then recur on left subtree */
        displayPreorder(node.left);
 
        /* now recur on right subtree */
        displayPreorder(node.right);
    }
 
     // Write method to display using postorder traversal
    private void displayPostorder(TreeNode node)
   { 
       if (node == null) // base case
        return;
        
        displayPostorder (node.left); // node.left
        displayPostorder (node.right);
        System.out.println(node.data.toString()); // node.data.toString()

    }
    
    // Write method to count number of employees @ nodes in the BST
   public void count()
   {
       System.out.println(_count(root));
   }
   
   private int _count(TreeNode node)
   {
       if (node == null) // base case
        return 0;
       return 1 + _count(node.left) + _count(node.right);
   }
    
    // Write method to calculate the total salary
   public void calcSalary()
   { 
       _calcSalary(root);
  } 
   
   private void _calcSalary(TreeNode node)
   {
       if (node == null) // base case
        return;
       Employee e = node.data;
       double x = e.calSalary();
       int i = 1 + _count(node.right) + _count(node.left) ;
       System.out.println("\nTotal payment of employee "+ i +" : RM"+ x);
       
        _calcSalary(node.left);
        _calcSalary(node.right);
   }
   
   public double calcSum()
   {
       return _calcSum(root);
   }
   
   private double _calcSum(TreeNode node)
   {
       double sum,sumRight = 0;
       double sumLeft =0;
       Employee e = node.data;
       double x = e.calSalary();
       if (node == null) // base case
        return 0;
        else{
             if(node.left != null)  
                sumLeft = _calcSum(node.left);  
                
             if(node.right != null)  
                sumRight = _calcSum(node.right); 
                
             sum = x + sumLeft + sumRight;
             return sum;
        }
       
    }
    
        // Write method to search for an employee based on name entered by the user
   public void search(String name)
   {
        _search(root,name);
   }
    
   // Recursive method to display the details of Employee (using inorder traversal 
   private void _search(TreeNode node, String name)
   { 
       if (node == null) // base case
        return;
        
       if (node.data.getName().equalsIgnoreCase(name))
            System.out.println(node.data.toString()); 
       
       _search(node.left,name);
       _search(node.right,name); 
    }  
    
}
