package type.body;

import type.VehicleTypeEnum;

public class WagonType extends VehicleTypeByBodyTypes {
    public WagonType(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.WAGON.name();
    }
}