package Function;

class Vehicle {
    String make;
    int wheels;
    String model;

    Vehicle() {
        System.out.println("Vehicle constructoer calleed");
    }

    void converttoString() {
        System.out.println(make + model);
    }
}

class Car extends Vehicle {
    int speed;
    int airbags;
    int passengers;

    Car() {
        System.out.println("Car constructor called");
    }

    int CarMethod() {
        return speed + '=' + passengers;
    }
}

class Bus {
    int load;
    boolean ac;
    String conductor;

    boolean BusMetod() {
        return ac;
    }

}

class Truck extends Vehicle {
    int loadcapacity;
    int meter;
    String name;

    int TruckMethod() {
        return loadcapacity + meter;
    }
}

class Inheritance {
    public static void main(String[] args) {
        Vehicle obj = new Vehicle();
        obj.make = "Hyundai";
        obj.wheels = 4;
        obj.model = "@3Create";
        obj.converttoString();

        // child objects
        // 1)Car
        Car obj1 = new Car();
        obj1.speed = 23;
        obj1.airbags = 4;
        obj1.passengers = 12;
        obj1.make = "Tata motors";
        obj1.model = "17Empire";
        System.out.println(obj1.make);
        System.out.println(obj1.model);
        obj1.converttoString();
        System.out.println(obj1.CarMethod());

        // Truck objects
        Truck obj2 = new Truck();
        obj2.loadcapacity = 234;
        obj2.meter = 890;
        System.out.println(obj2.TruckMethod());
        obj2.make = "Maruti Suzuki";
        obj2.model = "NewHoly";
        obj2.converttoString();

    }
}
