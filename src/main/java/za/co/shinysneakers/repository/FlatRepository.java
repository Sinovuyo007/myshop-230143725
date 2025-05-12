package za.co.shinysneakers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.shinysneakers.domain.Flat;
@Repository
public interface FlatRepository extends JpaRepository<Flat,Long> {
}
