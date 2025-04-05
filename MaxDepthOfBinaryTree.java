public class MaxDepthOfBinaryTree {
    public MaxDepthOfBinaryTree() {
    }
 
    public static int maxDepth(TreeNode var0) {
       if (var0 == null) {
          return 0;
       } else {
          int var1 = maxDepth(var0.left);
          int var2 = maxDepth(var0.right);
          return 1 + Math.max(var1, var2);
       }
    }
 
    public static void main(String[] var0) {
       TreeNode var1 = new TreeNode(3);
       var1.left = new TreeNode(9);
       var1.right = new TreeNode(20);
       var1.right.left = new TreeNode(15);
       var1.right.right = new TreeNode(7);
       System.out.println("Maximum Depth of the Tree: " + maxDepth(var1));
    }
 }