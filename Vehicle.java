public class Vehicle {

    public void run() {
        System.out.println("El vehiculo esta arrancando...");
    }
}

class Bike extends Vehicle {
    @Override
    public void run() {	
        System.out.println("El bicicleta esta arrancando...");
    }
}

class Test {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.run();

        Vehicle v2 = new Vehicle();
        v2.run();
    }
}

