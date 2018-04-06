import java.util.LinkedList;

public class app {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.addLast("6");
        list.add("10");
        for (String e: list) {
            System.out.println(e);
        }
    }
}
