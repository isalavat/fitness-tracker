package kg.salavat.finesstracker.saltracker.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kg.salavat.finesstracker.saltracker.domain.TrainingDay;

@Repository
public interface TrainingDayRepository extends JpaRepository<TrainingDay, Long>{
	public List<TrainingDay> findByDateOfTraining (LocalDateTime dateOfTraining);
}
