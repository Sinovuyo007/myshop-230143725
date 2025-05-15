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
   @Test
    void b_read(){
        Flat read = repository.findById(flat.getAddressID()).orElse(null);
        assertNotNull(read);
       System.out.println(read);
   }
    @Test
    void c_update(){
        Flat newFlat =new Flat.Builder().copy(flat).setFlatName("Kings Flat").build();
        Flat updated = repository.save(newFlat);
        System.out.println(updated);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    void d_delete(){
        repository.deleteById(flat.getAddressID());
        System.out.println("Deleted: "+flat.getAddressID());
    }
    @Test
    void e_getAll(){
        System.out.println("All Flats:");
        for(Flat flat:repository.findAll()){
            System.out.println(flat);
        }
}

}