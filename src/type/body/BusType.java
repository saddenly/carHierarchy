package type.body;

import type.VehicleTypeEnum;

public class BusType extends VehicleTypeByBodyTypes {
    public BusType(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}