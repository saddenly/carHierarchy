package type.fuel;

import type.VehicleTypeEnum;

public class PetrolType extends VehicleTypeByFuels {
    public PetrolType(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}