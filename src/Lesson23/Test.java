package Lesson23;


class Y extends Test {
    public Y(int i) {
        System.out.println("Y");
    }

    public boolean abc() {
        return true;
    }
}

public class Test {
    public Test() {
        System.out.println("X");
    }

    public Test(int i) {
        System.out.println("X" + i);
    }

    private boolean abc() {
        return false;
    }


    public static void main(String[] args) {
        Test t = new Y(18);
        System.out.println(t.abc());
    }
}
