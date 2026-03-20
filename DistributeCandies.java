class Solution {
    private int moves =0;
    public int distCandy(Node root) {
        // code here
       dfs(root);
       return moves;
    }
        private int dfs(Node node) {
            if(node == null) return 0;
            
            int leftExcess = dfs(node.left);
            int rightExcess = dfs(node.right);
            moves += Math.abs(leftExcess) + Math.abs(rightExcess);
            return node.data + leftExcess + rightExcess - 1;

        }
        

        
}