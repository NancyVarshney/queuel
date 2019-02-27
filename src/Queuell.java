import java.util.Scanner;

class Node{
private int data;
private Node next;
public Node()
        {
        data=0;
        next=null;
        }
public Node(int data,Node next){
        this.data = data;
        this.next = next;
        }

public void setdata(int data)
        {
        this.data=data;
        }

public int getdata()
        {
        return data;

        }

public void setnext(Node next)
        {
        this.next=next;
        }
public Node getnext()
        {
        return next;
        }
        }

public class Queuell {
    Node front;
    Node rear;
    int size;

    public Queuell() {
        front = null;
        rear = null;
     }



    public boolean isempty() {
        if (front == null && rear == null) {
            return true;
        } else
            return false;
    }

    public void enqueue(int val) {

        Node n = new Node();
        n.setdata(val);
        if (isempty()) {
            front = rear = n;
        } else {
            rear.setnext(n);
            rear = n;
        }
    }

    public void dequeue() {
        if (front == null) {
            return;

        } else {
            front = front.getnext();
        }
    }

    public void display() {
        Node temp;
        temp = front;
        if (isempty()) {
            return;
        }
        while (temp != null) {
            System.out.println(temp.getdata());
            temp = temp.getnext();
        }
    }


    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
   Queuell obj=new Queuell();
    System.out.println(obj.isempty());
   obj.enqueue(36);
   obj.enqueue(56);
  obj.enqueue(67);
  obj.dequeue();
  obj.display() ;
  System.out.println(obj.isempty());



    }
}


