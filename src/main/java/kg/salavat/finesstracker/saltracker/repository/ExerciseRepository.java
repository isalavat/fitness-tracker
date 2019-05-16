package kg.salavat.finesstracker.saltracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kg.salavat.finesstracker.saltracker.domain.Exercise;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Long>{

}
