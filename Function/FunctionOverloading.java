import Strings.Main;

package Function;

class Main {
    void fun(int a) {
        System.out.println("The first number with one argument is" + a);
    }

    int fun(int a, int b) {
        return a * b;
    }

    double fun(double a, double b, double c) {
        return a * b + c;
    }

    boolean fun(boolean True) {
        return True;
    }
}

class main2 extends Main {
    void fun(int a) {
        System.out.println(a);
    }
}

class FunctionOverloading {
    public static void main(String[] args) {
        Main obj1 = new Main();
        main2 obj2 = new main2();
        obj1.fun(23);

        System.out.println(obj1.fun(4, 5));
        System.out.println(obj1.fun(3, 4, 5));
        System.out.println(obj1.fun(false));
        obj2.fun(3);

    }
}
