import type.body.VehicleTypeByBodyTypes;
import type.fuel.VehicleTypeByFuels;
import type.purpose.VehicleTypeByPurpose;

public class AdsService {
    private VehicleAd[] adList;

    public void setAdList(VehicleAd[] adList) {
        this.adList = adList;
    }

    public void filterByVehicleTypeByPurpose(VehicleTypeByPurpose vehicleType) {
        for (VehicleAd ad : adList) {
            if (ad.getVehicleTypeByPurpose().equals(vehicleType)) {
                System.out.format("Объявление №%d подходит под данный фильтр с атрибутом: тип авто - %s" +
                        ", атрибут фильтра %s \n", ad.getId(), vehicleType.getTypeName(), vehicleType.getAttribute());
            } else {
                System.out.format("Объявление №%d не прошло фильтр: тип авто - %s, критерий - %s, так как имеет тип авто %s \n",
                        ad.getId(), vehicleType.getTypeName(), vehicleType.getAttribute(), ad.getVehicleTypeByPurpose().getTypeName());
            }
        }
    }

    public void filterByVehicleBodyType(VehicleTypeByBodyTypes vehicleType) {
        for (VehicleAd ad : adList) {
            if (ad.getVehicleTypeByBodyTypes().equals(vehicleType)) {
                System.out.format("Объявление №%d подходит под данный фильтр с атрибутом: тип кузова - %s" +
                        ", атрибут фильтра %s\n", ad.getId(), vehicleType.getTypeName(), vehicleType.getAttribute());
            } else {
                System.out.format("Объявление № %d не прошло фильтр: тип авто - %s , критерий - %s , так как имеет тип кузова %s\n",
                        ad.getId(), vehicleType.getTypeName(), vehicleType.getAttribute(), ad.getVehicleTypeByBodyTypes().getTypeName());
            }
        }
    }

    public void filterByVehicleTypeFuel(VehicleTypeByFuels vehicleType) {
        for (VehicleAd ad : adList) {
            if (ad.getVehicleTypeByFuels().equals(vehicleType)) {
                System.out.format("Объявление №%d подходит под данный фильтр с атрибутом: тип топлива - %s" +
                        ", атрибут фильтра %s \n", ad.getId(), vehicleType.getTypeName(), vehicleType.getAttribute());
            } else {
                System.out.format("Объявление №%d не прошло фильтр: тип авто - %s, критерий - %s, так как имеет тип топлива %s \n",
                        ad.getId(), vehicleType.getTypeName(), vehicleType.getAttribute(), ad.getVehicleTypeByFuels().getTypeName());
            }
        }
    }
}