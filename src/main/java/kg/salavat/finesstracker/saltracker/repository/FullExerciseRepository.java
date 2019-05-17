package kg.salavat.finesstracker.saltracker.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kg.salavat.finesstracker.saltracker.domain.FullExercise;

@Repository
public interface FullExerciseRepository extends JpaRepository<FullExercise, Long> {
	
	List<FullExercise> findByTrainingDay_dateOfTraining(LocalDateTime date);
	List<FullExercise> findByTrainingDay_id(Long id);
}
