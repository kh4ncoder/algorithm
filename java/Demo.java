import linkedlist.SingleLinkedList;

import java.util.LinkedList;

public class Demo {
    public static void main(String... args) {
//        listTest();
        singleLinkedListTest();
    }

    private static void listTest() {
        LinkedList<String> li = new LinkedList<>();
        li.add("sd");
        li.add("kd");
        li.addFirst("ad");
        li.addLast("zd");
        li.remove();
        System.out.println(li);
    }

    private static void singleLinkedListTest() {
        SingleLinkedList<String> lit = new SingleLinkedList<>();
        lit.add("fk");
        lit.add("nk");
        lit.addFirst("ak");
        lit.addLast("zk");

        System.out.println(lit.contains("ck"));
        System.out.println(lit.contains("nk"));

        System.out.println(lit);
        String v = lit.removeLast();
        System.out.println(v);
        lit.remove();
        System.out.println(lit);
        lit.clear();
        System.out.println(lit);
    }
}
