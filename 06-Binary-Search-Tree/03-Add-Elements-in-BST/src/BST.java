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

    // 向二分搜索树种添加新的元素e
    public void add(E e) {
        if (root == null) {
            root = new Node(e);
        } else {
            add(root, e);
        }
    }

    // 向以node为根的二分搜索树中插入元素E，递归算法
    private void add(Node node, E e) {
        if (node.e == e) {
            return;
        } else if (e.compareTo(node.e) < 0 && node.lefe == null) {
            node.lefe = new Node(e);
            size ++;
            return;
        } else if (e.compareTo(node.e) > 0 && node.right == null) {
            node.right = new Node(e);
            size ++;
            return;
        }

        if (e.compareTo(node.e) < 0) {
            add(node.lefe, e);
        } else { // e.compareTo(node.e) > 0
            add(node.right, e);
        }
    }
}
