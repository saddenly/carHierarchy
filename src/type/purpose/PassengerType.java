package type.purpose;

import type.VehicleTypeEnum;

public class PassengerType extends VehicleTypeByPurpose {
    public PassengerType(String attribute) {
        super(attribute);
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PASSENGER.name();
    }
}