package Level1;

public class Vehicle {
    static String rto = "UP Transport Dept";
    private final String regNo;
    private String model;

    public Vehicle(String regNo, String model) {
        this.regNo = regNo;
        this.model = model;
    }

    public void show() {
        if (this instanceof Vehicle) {
            System.out.println("Reg: " + regNo + ", Model: " + model + ", RTO: " + rto);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("UP32AB1234", "Honda City");
        Vehicle v2 = new Vehicle("UP14XY5678", "Suzuki Swift");

        v1.show();
        v2.show();
    }
}
