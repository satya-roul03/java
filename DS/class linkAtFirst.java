class linkAtFirst
{
    Node head;
    class Node
    {
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
        public void addFirst(String data)
        {
            Node newNode=new Node(data);
            if(head== null)
            {
                head=newnode;
                return;
            } 
            newNode.next=head;
            hade=newNode;
        }
        public void addLast(String data)
        {
            Node newNode=new Node(data);
            if(head==null)
            {
                head=newNode;
                return;
            }
            Node CurrNode=head;
            While(currNode.next != null)
            {
                currNode=currNode.next;
            }
            currNode.next=newNode;
        }
        public void printList()
        {
            if(head==null)
            {
                System.out.println("List is empty");
            }
            Node currNode=head;
            While(currNode != null)
            {
                System.out.print(currNode.data+"->");
                currNode=currNode.next;
            }
            System.out.println("NULL");
        }
    }
    public static void main(String args[])
    {
        linkAtFirst list=new linkAtFirst();
        list.addFirst("It");
        list.addFirst("is");
        list.addFirst("a");
        list.printList();
        list.addLast("LinkedList");
        list.printList();

    }
}