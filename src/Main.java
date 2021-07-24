import type.VehicleTypeEnum;
import type.body.BusType;
import type.body.PickupType;
import type.body.SedanType;
import type.fuel.DieselType;
import type.fuel.ElectricType;
import type.fuel.PetrolType;
import type.fuel.VehicleTypeByFuels;
import type.purpose.PassengerType;
import type.purpose.TruckType;
import type.purpose.VehicleTypeByPurpose;

public class Main {
    public static void main(String[] args) {
        AdsService adsService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", 123, new PassengerType(VehicleTypeEnum.PASSENGER.name()),
                new SedanType(VehicleTypeEnum.SEDAN.name()), new PetrolType(VehicleTypeEnum.PETROL.name()));
        VehicleAd kamazAd = new VehicleAd("Kamaz", 45, new TruckType(VehicleTypeEnum.TRUCK.name()),
                new PickupType(VehicleTypeEnum.PICKUP.name()), new DieselType(VehicleTypeEnum.DIESEL.name()));
        VehicleAd teslaAd = new VehicleAd("Tesla", 666, new PassengerType(VehicleTypeEnum.PASSENGER.name()),
                new SedanType(VehicleTypeEnum.SEDAN.name()), new ElectricType(VehicleTypeEnum.ELECTRIC.name()));

        adsService.setAdList(new VehicleAd[]{volvoAd, kamazAd, teslaAd});

        adsService.filterByVehicleTypeFuel(new ElectricType(VehicleTypeEnum.ELECTRIC.name()));

        adsService.filterByVehicleTypeByPurpose(new PassengerType(VehicleTypeEnum.PASSENGER.name()));

        adsService.filterByVehicleBodyType(new PickupType(VehicleTypeEnum.PICKUP.name()));

        adsService.filterByVehicleTypeFuel(new DieselType(VehicleTypeEnum.DIESEL.name()));
    }
}