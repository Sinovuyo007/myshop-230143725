package za.co.shinysneakers.factory;

import org.junit.jupiter.api.Test;
import za.co.shinysneakers.domain.House;

import static org.junit.jupiter.api.Assertions.*;

class HouseFactoryTest {

    @Test
    void createHouse() {
        House house = HouseFactory.createHouse(124,
                (short)123
                ,"Mew way"
                ,"Lochnerhof"
                ,"Strand"
                ,"Western Cape"
                ,(short)7140);//HouseFactory.createHouse( 123, (short) 4,"Mew way","Lochnerhof","Strand","Western Cape", (short) 7140);
        assertNotNull(house);
        System.out.println(house.toString());
    }
    void createHouseWithInvalidErfNumber() {
        House house = HouseFactory.createHouse((short) -123, (short) 4,"Mew way","Lochnerhof","Strand","Western Cape", (short) 7140);
        assertNotNull(house);
        System.out.println(house.toString());
    }
    void createHouseWithInvalidHouseName() {
        House house = HouseFactory.createHouse((short) 123, (short) 4,"Mew way","Lochnerhof","Strand","Western Cape", (short) 7140);
        assertNotNull(house);
        System.out.println(house.toString());
    }
    void createHouseWithInvalidStreetNumber() {
        House house = HouseFactory.createHouse((short) 123, (short)-4,"Mew way","Lochnerhof","Strand","Western Cape", (short) 7140);
        assertNotNull(house);
        System.out.println(house.toString());
    }
    void createHouseWithInvalidStreetName() {
        House house = HouseFactory.createHouse((short) 123, (short) 4,"","Lochnerhof","Strand","Western Cape", (short) 7140);
        assertNotNull(house);
        System.out.println(house.toString());
    }
    void createHouseWithInvalidSuburb() {
        House house = HouseFactory.createHouse((short) 123, (short) 4,"Mew way","","Strand","Western Cape", (short) 7140);
        assertNotNull(house);
        System.out.println(house.toString());
    }void createHouseWithInvalidCity() {
        House house = HouseFactory.createHouse((short) 123, (short) 4,"Mew way","Lochnerhof","","Western Cape", (short) 7140);
        assertNotNull(house);
        System.out.println(house.toString());
    }
    void createHouseWithInvalidProvince() {
        House house = HouseFactory.createHouse((short) 123, (short) 4,"Mew way","Lochnerhof","Strand","", (short) 7140);
        assertNotNull(house);
        System.out.println(house.toString());
    }
    void createHouseWithInvalidPostalCode() {
        House house = HouseFactory.createHouse((short) 123, (short) 4,"Mew way","Lochnerhof","Strand","Western Cape", (short) -7140);
        assertNotNull(house);
        System.out.println(house.toString());
    }
}