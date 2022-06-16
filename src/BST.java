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
    public void deleteKey(int key) { root = deleteRec(root, key); }

    /* A recursive function to
      delete an existing key in BST
     */
    private Node deleteRec(Node root, int key)
    {
        /* Base Case: If the tree is empty */
        if (root == null)
            return root;

        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);

            // if key is same as root's
            // key, then This is the
            // node to be deleted
        else {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // node with two children: Get the inorder
            // successor (smallest in the right subtree)
            root.key = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }

    private int minValue(Node root)
    {
        int minv = root.key;
        while (root.left != null)
        {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }
}
