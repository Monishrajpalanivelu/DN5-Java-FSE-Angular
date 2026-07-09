class Node{
int id;
String task;
Node next;

Node(int id,String task){
this.id=id;
this.task=task;
}
}

public class TaskLinkedList{

Node head;

void add(Node n){
n.next=head;
head=n;
}

void traverse(){
Node temp=head;
while(temp!=null){
System.out.println(temp.task);
temp=temp.next;
}
}

}