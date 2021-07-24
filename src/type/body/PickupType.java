package type.body;

import type.VehicleTypeEnum;

public class PickupType extends VehicleTypeByBodyTypes {
    public PickupType(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}