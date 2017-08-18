import java.util.ArrayList;

public class ToStringExample {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(3);
        array.add(30);

        System.out.println(array);
        System.out.println(new LeftClass());
    }
}

class LeftClass {
    public String str = "nice String";

    @Override
    public String toString() {
        return str;
    }
}
