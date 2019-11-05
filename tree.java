public class Tree{
    class Node{
        int data;
        Node left,right;
        Node(int value){
            this.data=value;
            left=right=null;
        }
    }
 void insert(int data)
    {
        root=insertR(root,data);
    }
   Node insertR(Node root,int data)
   {
       if(root==null)
       {
           root=new Node(data);
           return root;
       }
       if(data<root.data)
       {
           root.left=insertR(root.left,data);
       }
       else if(data>root.data)
       {
           root.right=insertR(root.right,data);
       }
       return root;
   }
}
