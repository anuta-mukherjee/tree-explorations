/*
 * This is utility code for non binary java trees
 * It includes functions to add children
 * It also includes a utility function that traverses the tree in BFS fashion
 * to print all the nodes in level order.
 */


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MyTreeNode<T> {
    private T data = null;
    private List<MyTreeNode> children = new ArrayList<MyTreeNode>();
    private MyTreeNode parent = null;

    public MyTreeNode(T data) {
        this.data = data;
    }

    public void addChild(MyTreeNode child) {
        child.setParent(this);
        this.children.add(child);
    }

    public void addChild(T data) {
        MyTreeNode<T> newChild = new MyTreeNode<T>(data);
        this.addChild(newChild);
    }

    public void addChildren(List<MyTreeNode> children) {
        for (MyTreeNode t : children) {
            t.setParent(this);
        }
        this.children.addAll(children);
    }

    public List<MyTreeNode> getChildren() {
        return children;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private void setParent(MyTreeNode parent) {
        this.parent = parent;
    }

    public MyTreeNode getParent() {
        return parent;
    }

    
    //Function to print nodes of the tree in level order
    public static void BFS(MyTreeNode<String> root){
        Queue<MyTreeNode<String>> queue = new LinkedList<MyTreeNode<String>>();
        queue.add(root);

        int numChildren = 1;

        while(queue.peek() != null){

            int level = queue.size();

            while(level > 0) {
                MyTreeNode<String> curr = queue.remove();
                for (MyTreeNode node : curr.getChildren()) {
                    queue.add(node);
                }
                System.out.print(curr.getData() + " ");
                level --;
            }

            System.out.println();
        }
    }


    //Test code
    public static void main(String args[]) {

        System.out.println("Hello and welcome to learning trees!");

        MyTreeNode<String> root = new MyTreeNode<String>("Root");

        //a1
        MyTreeNode<String> a1 = new MyTreeNode<String>("a1");
        root.addChild(a1);

            MyTreeNode<String> a1b1 = new MyTreeNode<String>("b1");
            a1.addChild(a1b1);

                MyTreeNode<String> a1b1c1 = new MyTreeNode<String>("c1");
                a1b1.addChild(a1b1c1);

                MyTreeNode<String> a1b1c2 = new MyTreeNode<String>("c2");
                a1b1.addChild(a1b1c2);


            MyTreeNode<String> a1b2 = new MyTreeNode<String>("b2");
            a1.addChild(a1b2);

                MyTreeNode<String> a1b2c1 = new MyTreeNode<String>("c1");
                a1b2.addChild(a1b2c1);

                MyTreeNode<String> a1b2c2 = new MyTreeNode<String>("c2");
                a1b2.addChild(a1b2c2);




        //a2
        MyTreeNode<String> a2 = new MyTreeNode<String>("a2");
        root.addChild(a2);

            MyTreeNode<String> a2b1 = new MyTreeNode<String>("b1");
            a1.addChild(a2b1);

                MyTreeNode<String> a2b1c1 = new MyTreeNode<String>("c1");
                a2b1.addChild(a2b1c1);

                MyTreeNode<String> a2b1c2 = new MyTreeNode<String>("c2");
                a2b1.addChild(a2b1c2);

            MyTreeNode<String> a2b2 = new MyTreeNode<String>("b2");
            a1.addChild(a2b2);

                MyTreeNode<String> a2b2c1 = new MyTreeNode<String>("c1");
                a2b2.addChild(a2b2c1);

                MyTreeNode<String> a2b2c2 = new MyTreeNode<String>("c2");
                a2b2.addChild(a2b2c2);


        //a3
        MyTreeNode<String> a3 = new MyTreeNode<String>("a3");
        root.addChild(a3);

            MyTreeNode<String> a3b1 = new MyTreeNode<String>("b1");
            a1.addChild(a3b1);

                MyTreeNode<String> a3b1c1 = new MyTreeNode<String>("c1");
                a3b1.addChild(a3b1c1);

                MyTreeNode<String> a3b1c2 = new MyTreeNode<String>("c2");
                a3b1.addChild(a3b1c2);

            MyTreeNode<String> a3b2 = new MyTreeNode<String>("b2");
            a1.addChild(a3b2);

                MyTreeNode<String> a3b2c1 = new MyTreeNode<String>("c1");
                a3b2.addChild(a3b2c1);

                MyTreeNode<String> a3b2c2 = new MyTreeNode<String>("c2");
                a3b2.addChild(a3b2c2);

        BFS(root);

    }

}
