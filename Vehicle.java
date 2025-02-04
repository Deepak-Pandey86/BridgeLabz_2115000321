class Vehicle {
    private static double registrationFee = 500.0;
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        }
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: $" + registrationFee);
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("John Doe", "Car", "ABC123");
        Vehicle v2 = new Vehicle("Jane Smith", "Motorcycle", "XYZ789");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(600.0);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
