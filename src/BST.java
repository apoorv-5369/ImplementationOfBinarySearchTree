public class BST {
    private Node root;
    public void insert(int key){
        root=insert(root, key);
    }
    private Node insert(Node node, int key){
        if(node==null) return new Node(key);
        if(key<=node.key) node.left=insert(node.left, key);
        else{
            node.right=insert(node.right, key);
        }
        return node;
    }
    public Node search(int key){
        return search(root, key);
    }
    private Node search(Node node, int key){
        if(node==null||node.key==key) return node;
        if(key<=node.key) search(node.left, key);
        return search(node.right, key);
    }
    public void inOrder(){
        System.out.print("The inOrder Traversal is: ");
        inOrder(root);
        System.out.println();
    }
    private void inOrder(Node node){
        if(node==null) return;
        inOrder(node.left);
        System.out.print(node.key+ " ");
        inOrder(node.right);
    }
    public void preOrder(){
        System.out.print("The preOrder Traversal is: ");
        preOrder(root);
        System.out.println();
    }
    private void preOrder(Node node){
        if(node==null) return;
        System.out.print(node.key+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void postOrder(){
        System.out.print("The postOrder traversal is: ");
        postOrder(root);
        System.out.println();
    }
    private void postOrder(Node node){
        if(node==null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.key+" ");
    }
}
