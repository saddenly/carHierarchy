package type.fuel;

import type.VehicleTypeEnum;

public class HybridType extends VehicleTypeByFuels {
    public HybridType(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.HYBRID.name();
    }
}