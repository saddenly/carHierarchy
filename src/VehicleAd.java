import type.body.VehicleTypeByBodyTypes;
import type.fuel.VehicleTypeByFuels;
import type.purpose.VehicleTypeByPurpose;

public class VehicleAd {
    private String model;
    private int id;
    private VehicleTypeByPurpose vehicleTypeByPurpose;
    private VehicleTypeByBodyTypes vehicleTypeByBodyTypes;
    private VehicleTypeByFuels vehicleTypeByFuels;

    public VehicleAd(String model, int id, VehicleTypeByPurpose vehicleTypeByPurpose,
                     VehicleTypeByBodyTypes vehicleTypeByBodyTypes, VehicleTypeByFuels vehicleTypeByFuels) {
        this.model = model;
        this.id = id;
        this.vehicleTypeByPurpose = vehicleTypeByPurpose;
        this.vehicleTypeByBodyTypes = vehicleTypeByBodyTypes;
        this.vehicleTypeByFuels = vehicleTypeByFuels;
    }

    public VehicleAd(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public int getId() {
        return id;
    }

    public VehicleTypeByPurpose getVehicleTypeByPurpose() {
        return vehicleTypeByPurpose;
    }

    public VehicleTypeByBodyTypes getVehicleTypeByBodyTypes() {
        return vehicleTypeByBodyTypes;
    }

    public VehicleTypeByFuels getVehicleTypeByFuels() {
        return vehicleTypeByFuels;
    }

    @Override
    public String toString() {
        return this.model;
    }
}