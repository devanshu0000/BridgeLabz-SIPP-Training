public class Linkedlist{
    Node head;
    Node tail;
    public class Node{
    Node next;
    int data;

    Node(int data){
        this.data=data;
        next=null;
    }
}

    public void add(int data){
        Node n= new Node(data);
        if(head==null){
            head=tail=n;
        }
        else{
            tail.next=n;
            tail=n;
        }
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;        }
    }
    public static void main(String[] args) {
        Linkedlist l1= new Linkedlist();
        l1.add(1);
        l1.add(2);
        l1.display();
    }
    
}

