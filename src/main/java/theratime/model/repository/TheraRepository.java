package theratime.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import theratime.model.entity.TheraEntity;

@Repository
public interface TheraRepository extends JpaRepository<TheraEntity, Integer> {
}
