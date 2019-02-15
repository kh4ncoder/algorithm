import linkedlist.SingleLinkedList;

public class Demo {
    public static void main(String... args) {
        singleLinkedListTest();
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

        lit.insert(3, "hk");
//        lit.insert(5, "zzk");
        System.out.println(lit);

        String v = lit.removeLast();
        System.out.println(v);
        lit.remove();
        System.out.println(lit);
        lit.clear();
        System.out.println(lit);
    }
}
