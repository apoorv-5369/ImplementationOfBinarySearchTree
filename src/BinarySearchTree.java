public class BinarySearchTree {
    public static void main(String[] args){
        BST bst=new BST();
        bst.insert(10);
        bst.insert(15);
        bst.insert(5);
        bst.insert(8);
        bst.insert(18);
        bst.insert(12);
        bst.insert(10);
        bst.preOrder();
        bst.inOrder();
        bst.postOrder();
        search(bst,12);
        search(bst,9);
        System.out.println("Delete 15");
        bst.deleteKey(15);
        bst.inOrder();

    }
    private static void search(BST bst, int key){
        if(bst.search(key)!=null) System.out.println(key+" found");
        else{
            System.out.println(key+" Not found");
        }
    }

}
