package type.fuel;

import type.VehicleTypeEnum;

public class DieselType extends VehicleTypeByFuels {
    public DieselType(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.DIESEL.name();
    }
}