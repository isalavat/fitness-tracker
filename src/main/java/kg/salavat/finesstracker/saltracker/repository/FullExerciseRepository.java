package kg.salavat.finesstracker.saltracker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import kg.salavat.finesstracker.saltracker.domain.FullExercise;
import kg.salavat.finesstracker.saltracker.domain.TrainingDay;

@Repository
public interface FullExerciseRepository extends JpaRepository<FullExercise, Long> {
	
	List<FullExercise> findByTrainingDay(TrainingDay td);
}
