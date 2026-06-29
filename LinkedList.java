// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Node{
    int data;
    Node next;
Node(int data){
    this.data = data;
    this.next = null;
}
}
class LinkedListd {
    public static void main(String[] args) {
        
        Node n1 = new Node(10);
         Node n2 = new Node(20);
          Node n3 = new Node(30);
           Node n4 = new Node(40);
           n1.next =n2;
           n2.next =n3;
           n3.next=n4;
        //System.out.println(n1.data);
        //System.out.println(n1.next.data);
        //System.out.println(n1.next.next.data);
        //System.out.println(n1.next.next.next.data);
        Node head=n1;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp =temp.next;
        }
        System.out.println("null");
    }
}