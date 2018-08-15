public class BST<E extends Comparable<E>> {

    private class Node {
        public E e;
        public Node lefe, right;

        public Node(E e) {
            this.e = e;
            lefe = null;
            right = null;
        }
    }

    private Node root;
    private int size;

    public BST() {
        root = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
