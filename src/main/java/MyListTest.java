public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(5);
        listInteger.add(6);

        System.out.println("element 4: "+listInteger.set(4));
        System.out.println("element 1: "+listInteger.set(1));
        System.out.println("element 2: "+listInteger.set(2));

      System.out.println("element 6: "+listInteger.set(100));

    }
}
