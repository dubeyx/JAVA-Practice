
package New;
import java.util.*;
public class TreeNode {
	     int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode max;
        if(p.val==q.val) 
        {
            if(root.val<=p.val) {return root;}
            else {return p;}
        }
      
        
        
        
      if(root.val<=p.val && root.val>q.val)
        {
            return root;
        }
        else if(root.val>p.val && root.val<=q.val) 
        {
            return root;
        }
        
        else
        {
        
         
            
            
            
            if(root.val>p.val && root.val>q.val)
         {
            return lowestCommonAncestor(root.left,p,q); 
         }
            
        else if(root.val<=p.val && root.val<=q.val)
            {
                
                return lowestCommonAncestor(root.right,p,q); 
                    
            }
            
          
            
            
            
        }
         
    }
}