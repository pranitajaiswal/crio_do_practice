public class vehicles {
    public String transportation_mode;
    public String vehicle_type;

    public vehicles(String transportation_mode, String vehicle_type) {
        this.transportation_mode = transportation_mode;
        this.vehicle_type = vehicle_type;
    }

    public void displayVehicleType() {
        System.out.println("Vehicle type: " + vehicle_type);
        System.out.println("Transporation mode: " + transportation_mode);
    }

}
