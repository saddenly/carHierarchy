package type.purpose;

import type.VehicleType;

public class VehicleTypeByPurpose extends VehicleType {
    public VehicleTypeByPurpose(String attribute) {
        super(attribute);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        VehicleTypeByPurpose that = (VehicleTypeByPurpose) object;
        return attribute != null && attribute.equals(that.attribute);
    }
}