package za.co.shinysneakers.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.co.shinysneakers.domain.House;
import za.co.shinysneakers.domain.House;
import za.co.shinysneakers.factory.HouseFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class HouseRepositoryTest {
    @Autowired
    private HouseRepository repository;

    private static House house = HouseFactory.createHouse((short) 123,
            (short) 4,
            "Mew way",
            "Lochnerhof",
            "Strand",
            "Western Cape",
            (short) 7140);
    @Test
    void create(){
        House createHouse = repository.save(house);
        assertNotNull(createHouse);
        System.out.println(createHouse);
    }
    @Test
    void b_read(){
        House read = repository.findById(house.getAddressID()).orElse(null);
        assertNotNull(read);
        System.out.println(read);
    }
    @Test
    void c_update(){
        House newHouse =new House.Builder().copy(house).setSuburb("Surbubia").build();
        House updated = repository.save(newHouse);
        System.out.println(updated);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    void d_delete(){
        repository.deleteById(house.getAddressID());
        System.out.println("Deleted: "+house.getAddressID());
    }
    @Test
    void e_getAll(){
        System.out.println("All Houses:");
        for(House house:repository.findAll()){
            System.out.println(house);
        }
    }
}