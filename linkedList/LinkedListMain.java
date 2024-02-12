import core.lists.MyLinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addToEnd(1);
        list.addToEnd(2);
        list.addToBeginning(3);
        list.addToBeginning(4);

        System.out.println("Size of list: " + list.getSize());

        for (int i = 0; i < list.getSize(); i++) {
            System.out.println("Element at index " + i + ": " + list.getElement(i));
        }
    }
}

