package Doubly;

public class Lists {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> intList = new DoublyLinkedList<Integer>();
        System.out.println(intList);
        intList.add(31);
        intList.add(12);
        intList.add(6);
        intList.add(2);
        intList.add(4);
        intList.add(8);
        intList.add(10);
        System.out.println(intList);
        System.out.println(intList.getSize());
        System.out.println(intList.remove(4));
        System.out.println(intList);
        System.out.println(intList.getSize());
        System.out.println(intList.previous(6));
        System.out.println(intList.previous(31));
        System.out.println(intList.remove(31));
        System.out.println(intList);
        intList.clear();
        System.out.println(intList);
        System.out.println(intList.getSize());
    }
}
