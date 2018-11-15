package opgave01;

public class TestMain {

    public static void main(String[] args) {
        SortedLinkedList list = new SortedLinkedList();

        list.addElement("fisk");
        list.addElement("abe");
        list.addElement("diamanter");
        list.addElement("aarhus");
        list.addElement("planter");
        System.out.println(list.removeElement("aarhus"));
        System.out.println(list.toString());

        System.out.println(list.countElements());

        // addAll
        SortedLinkedList list2 = new SortedLinkedList();
        list2.addElement("bananer");
        list2.addElement("pære");
        list2.addElement("øl");

        System.out.println(list2.toString());
        list.addAll(list2);
        System.out.println(list.toString());

    }

}
