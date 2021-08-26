public class LinkedList {
    public LinkedList()
    {
        length=0;
    }
    Node head;
    private int length=0;
    public synchronized Node getHead()
    {
        return head;
    }
    public synchronized  void insertAtBegin(Node node)
    {
        node.setNext(head);
        head=node;
        length++;
    }
    public synchronized void insertAtEnd(Node node)
    {
        if(head==null)
        {
            head=node;
        }
        else
        {
            Node p,q;
            for(p=head; (q=p.getNext())!=null;p=q);
            p.setNext(node);
        }
        length++;
    }
    public void insert(int data, int position)
    {
        if(position<0)
            position=0;
        if(position>length)
            position=length;
        if(head==null)
            head=new Node(data);
        else if(position==0)
        {
            Node temp=new Node(data);
            temp.next=head;
            head=temp;
        }
        else
        {
            Node temp=head;
            for(int i=1;i<position;i++)
            {
                temp=temp.getNext();
            }
            Node newNode=new Node(data);
            newNode.next=temp.next;
            temp.setNext(newNode);
        }
         length++;
    }

    //Remove operations
    public synchronized Node removeFromBegin()
    {
        Node node=head;
        if(node!=null)
        {
            head=node.getNext();
            node.setNext(null);
        }
        return node;
    }

    public synchronized  Node removeFromEnd()
    {
        if(head==null)
        {
            return null;
        }
        Node p=head;
        Node q=null;
        Node next=head.getNext();
        if(next==null)
        {
            head=null;
            return p;
        }
        while((next=p.getNext())!=null)
        {
            q=p;
            p=next;
        }
        q.setNext(null);
        return p;
    }
}

