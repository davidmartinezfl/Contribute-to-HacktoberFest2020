/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        Stack<Node> st = new Stack<>();
        LinkedList<Integer> ll = new LinkedList<>();
        
        if( root == null ){
            return ll;
        }
        st.add(root);
            
        while( !st.isEmpty() ){
            Node curr = st.pop();
            ll.add(curr.val);
            Collections.reverse(curr.children);
            for( Node i : curr.children ){
                st.add(i);
            }
        }
        return ll;
    }
}