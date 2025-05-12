package za.co.shinysneakers.factory;

import za.co.shinysneakers.domain.Flat;
import za.co.shinysneakers.util.Helper;

public class FlatFactory {
    public static Flat createFlat(short unitNumber,
                                     String flatName,
                                  short streetNumber,
     String streetName,
     String suburb,
     String city,
     String province,
     short postalCode
                                      ) {
        if (!Helper.isValidUnitNumber(unitNumber)
            || Helper.isNullOrEmpty(flatName)
                ||!Helper.isValidStreetNumber(streetNumber)
        ||Helper.isNullOrEmpty(streetName)
        ||Helper.isNullOrEmpty(suburb)
        ||Helper.isNullOrEmpty(city)
        ||Helper.isNullOrEmpty(province)
        ||!Helper.isValidPostalCode(postalCode)) {
            return null;
        }
        return new Flat.Builder().setUnitNumber(unitNumber)
                .setFlatName(flatName)
                .setStreetNumber(streetNumber)
                .setStreetName(streetName)
                .setSuburb(suburb)
                .setCity(city)
                .setProvince(province)
                .setPostalCode(postalCode)
                .build();
    }
}
