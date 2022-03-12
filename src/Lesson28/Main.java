package Lesson28;


class NeMyasoException extends RuntimeException {
    NeMyasoException(String e) {
        super(e);
    }
}

class NeVodaException extends Exception {
    NeVodaException(String e) {
        super(e);
    }
}

class Tiger {
    void eat(String s) {
        if (s != "myaso") {
            throw new NeMyasoException("Tigr ne est" + s);
        } else {
            System.out.println("Tigr est" + s);
        }

    }

    void drink(String s) throws NeVodaException {
        if (s != "voda") {
            throw new NeVodaException("Tigr ne pjet" + s);
        } else {
            System.out.println("Tigr p'et" + s);
        }

    }
}

public class Main {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat("myaso");
        try {
            t.drink("voda");
            try {
                t.drink("pivo");
            } catch (NeVodaException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("eto inner finnaly block");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

