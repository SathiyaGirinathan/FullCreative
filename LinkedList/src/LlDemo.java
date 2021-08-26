public class LlDemo {
    public static void main(String[] args) {
        Node n1=new Node(20);
        Node n2=new Node(30);
        Node n3=new Node(40);
        Node n4=new Node(50);
        LinkedList l =new LinkedList();
        System.out.println(l.length());
        l.insertAtBegin(n1);
        l.insertAtEnd(n2);
        l.insertAtEnd(n3);
        l.insertAtEnd(n4);
        l.insert(10,0);
        System.out.println(l);
        System.out.println(l.length());

    }
}
