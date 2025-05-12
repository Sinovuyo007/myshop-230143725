package za.co.shinysneakers.repository;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.co.shinysneakers.domain.Flat;
import za.co.shinysneakers.factory.FlatFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
class FlatRepositoryTest {
   @Autowired
    private FlatRepository repository;

   private  Flat flat = FlatFactory.createFlat(
           (short) 123
           ,"Flat1"
           , (short) 42
           ,"Mew way"
           ,"Lochnerhof"
           ,"Strand"
           ,"Western Cape"
           , (short) 7140);
   

    @Test
    void a_create(){
    Flat createFlat = repository.save(flat);
    assertNotNull(createFlat);
       System.out.println(createFlat);
   }


}