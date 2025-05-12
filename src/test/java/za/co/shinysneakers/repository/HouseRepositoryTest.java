package za.co.shinysneakers.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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
}