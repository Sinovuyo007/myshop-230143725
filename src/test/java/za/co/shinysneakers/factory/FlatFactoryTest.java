package za.co.shinysneakers.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.co.shinysneakers.domain.Flat;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class FlatFactoryTest {

    @Test
    void createFlat() {
        Flat flat = FlatFactory.createFlat((short) 123,"Flat1", (short) 4,"Mew way","Lochnerhof","Strand","Western Cape", (short) 7140);
        assertNotNull(flat);
        System.out.println(flat.toString());
    }
    void createFlatWithInvalidUnitNumber() {
        Flat flat = FlatFactory.createFlat((short) -123,"Flat1", (short) 4,"Mew way","Lochnerhof","Strand","Western Cape", (short) 7140);
        assertNotNull(flat);
        System.out.println(flat.toString());
    }
    void createFlatWithInvalidFlatName() {
        Flat flat = FlatFactory.createFlat((short) 123,"", (short) 4,"Mew way","Lochnerhof","Strand","Western Cape", (short) 7140);
        assertNotNull(flat);
        System.out.println(flat.toString());
    }
    void createFlatWithInvalidStreetNumber() {
        Flat flat = FlatFactory.createFlat((short) 123,"Flat1", (short)-4,"Mew way","Lochnerhof","Strand","Western Cape", (short) 7140);
        assertNotNull(flat);
        System.out.println(flat.toString());
    }
    void createFlatWithInvalidStreetName() {
        Flat flat = FlatFactory.createFlat((short) 123,"Flat1", (short) 4,"","Lochnerhof","Strand","Western Cape", (short) 7140);
        assertNotNull(flat);
        System.out.println(flat.toString());
    }
    void createFlatWithInvalidSuburb() {
        Flat flat = FlatFactory.createFlat((short) 123,"Flat1", (short) 4,"Mew way","","Strand","Western Cape", (short) 7140);
        assertNotNull(flat);
        System.out.println(flat.toString());
    }void createFlatWithInvalidCity() {
        Flat flat = FlatFactory.createFlat((short) 123,"Flat1", (short) 4,"Mew way","Lochnerhof","","Western Cape", (short) 7140);
        assertNotNull(flat);
        System.out.println(flat.toString());
    }
    void createFlatWithInvalidProvince() {
        Flat flat = FlatFactory.createFlat((short) 123,"Flat1", (short) 4,"Mew way","Lochnerhof","Strand","", (short) 7140);
        assertNotNull(flat);
        System.out.println(flat.toString());
    }
    void createFlatWithInvalidPostalCode() {
        Flat flat = FlatFactory.createFlat((short) 123,"Flat1", (short) 4,"Mew way","Lochnerhof","Strand","Western Cape", (short) -7140);
        assertNotNull(flat);
        System.out.println(flat.toString());
    }

}