package za.co.shinysneakers.factory;

import za.co.shinysneakers.domain.House;
import za.co.shinysneakers.util.Helper;

public class HouseFactory {
    public static House createHouse(int erfNumber,
                                  short streetNumber,
                                  String streetName,
                                  String suburb,
                                  String city,
                                  String province,
                                  short postalCode
    ) {
        if (!Helper.isValidErfNumber(erfNumber)
                ||!Helper.isValidStreetNumber(streetNumber)
                ||Helper.isNullOrEmpty(streetName)
                ||Helper.isNullOrEmpty(suburb)
                ||Helper.isNullOrEmpty(city)
                ||Helper.isNullOrEmpty(province)
                ||!Helper.isValidPostalCode(postalCode)) {
            return null;
        }
        return new House.Builder().setErfNumber(erfNumber)
                .setStreetNumber(streetNumber)
                .setStreetName(streetName)
                .setSuburb(suburb)
                .setCity(city)
                .setProvince(province)
                .setPostalCode(postalCode)
                .build();
    }
}
