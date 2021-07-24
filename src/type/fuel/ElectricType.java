package type.fuel;

import type.VehicleTypeEnum;

public class ElectricType extends VehicleTypeByFuels {
    public ElectricType(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.ELECTRIC.name();
    }
}