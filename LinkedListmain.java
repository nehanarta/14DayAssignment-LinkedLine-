public class LinkedListmain {
    public static void main(String[] args){
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.push(56);
        linkedList1.push(30);
        linkedList1.push(70);
        linkedList1.firstElementDelete();
        linkedList1.display();

        LinkedList<Integer> linkedList2=new LinkedList<>();
        linkedList2.append(56);
        linkedList2.append(30);
        linkedList2.append(70);
        linkedList2.lastElementDelete();
        linkedList2.display();
    }
}
