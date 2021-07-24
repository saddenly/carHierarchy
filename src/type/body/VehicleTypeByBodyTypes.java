package type.body;

import type.VehicleType;

public class VehicleTypeByBodyTypes extends VehicleType {
    public VehicleTypeByBodyTypes(String attribute) {
        super(attribute);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        VehicleTypeByBodyTypes that = (VehicleTypeByBodyTypes) object;
        return attribute != null && attribute.equals(that.attribute);
    }
}