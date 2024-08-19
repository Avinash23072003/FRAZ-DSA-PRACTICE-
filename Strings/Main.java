package Strings;

class Class1 {
    // variables
    String name;
    int age;
    int price;

    String name(String an) {
        return an;
    }

    void brand() {
        System.out.println("Azhhgds1229");
    }

    int age(int curr_age) {
        return age - curr_age;
    }

}

class Main {
    public static void main(String[] args) {
        Class1 obj = new Class1();
        System.out.println(obj);
        System.out.println(obj.age);
        obj.age = 35;
        System.out.println(obj.age(2));
        obj.age = 55;
        System.out.println(obj.age(2));
        obj.brand();
        obj.name("Shahrukh");
        obj.age(4);

    }
}
