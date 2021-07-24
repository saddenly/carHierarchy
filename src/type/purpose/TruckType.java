package type.purpose;

import type.VehicleTypeEnum;

public class TruckType extends VehicleTypeByPurpose {
    public TruckType(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.TRUCK.name();
    }
}