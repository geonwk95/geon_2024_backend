package day15.Step1;

public class Step1 {

    public static void main(String[] args) {

        // 1. (운전자)객체 생성
        Driver driver = new Driver(); // 1명
        Driver driver1 = new Driver(); // 1명
        //Driver driver2 = new Driver(); // 1명

        // 2.
        Bus bus = new Bus();
        driver1.drive(bus);

        // 3.
        Taxi taxi = new Taxi();
        driver1.drive(taxi);

        // 4.
        Vehicle vehicle = new Vehicle();
        driver.drive(vehicle);


    } // m e

} // c e
