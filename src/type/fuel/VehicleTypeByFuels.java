package type.fuel;

import type.VehicleType;

public class VehicleTypeByFuels extends VehicleType {
    public VehicleTypeByFuels(String attribute) {
        super(attribute);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        VehicleTypeByFuels that = (VehicleTypeByFuels) object;
        return attribute != null && attribute.equals(that.attribute);
    }
}