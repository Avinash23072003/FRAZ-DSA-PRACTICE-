package Arrays;
class Bike {

    // defaulr constructor
    int age;
    String name;

    Bike(int newage, String newname) {
        age = newage;
        name = newname;

    }

    // paramaterised constructor
    void defaultDetails() {
        System.out.println("Hello" + age + "name" + name);
    }

    void paramDetails(int c, int d) {

        System.out.println("[" + c + "  " + d + "]");

    }

}

class Constructor {
    public static void main(String[] args) {
        Bike obj = new Bike(10, "Amey");
        obj.defaultDetails();

    }
}
