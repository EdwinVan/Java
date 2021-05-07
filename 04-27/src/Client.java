import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List <Object> products = new ArrayList<Object>();
        products.add("CCTV1");
        products.add("CCTV2");
        products.add("CCTV3");
        products.add("CCTV4");
        products.add("CCTV5");
        products.add("CCTV6");
        products.add("CCTV7");
        products.add("CCTV8");
        products.add("CCTV9");
        products.add("CCTV10");

        AbstractObjectList list;
        AbstractIterator iterator;

        list = new ProductList(products);
        iterator = list.createIterator();

        System.out.println("正向遍历");

        while (!iterator.isLast()){
            System.out.println(iterator.getNextItem()+",");
            iterator.next();
        }

        System.out.println();
        System.out.println();


        System.out.println("逆向遍历");
        while (!iterator.isFirst()){
            System.out.println(iterator.getPreviousItem()+",");
            iterator.previous();
        }
    }
}
