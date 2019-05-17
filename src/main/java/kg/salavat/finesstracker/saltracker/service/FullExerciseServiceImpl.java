package kg.salavat.finesstracker.saltracker.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kg.salavat.finesstracker.saltracker.domain.FullExercise;
import kg.salavat.finesstracker.saltracker.repository.FullExerciseRepository;
import kg.salavat.finesstracker.saltracker.repository.TrainingDayRepository;

@Service
public class FullExerciseServiceImpl implements FullExerciseService{
	@Autowired
	FullExerciseRepository fullExerRepo;
	@Autowired
	TrainingDayRepository trainDayRepo;
	@Override
	public Optional<FullExercise> getById(Long id) {
		return fullExerRepo.findById(id);
	}

	@Override
	public List<FullExercise> getAll() {
		return fullExerRepo.findAll();
	}

	@Override
	public FullExercise save(FullExercise fullExercise) {
		return fullExerRepo.save(fullExercise);
	}

	@Override
	public String deleteById(Long id) {
		fullExerRepo.deleteById(id);
		return "Succecfully deleted";
	}

	@Override
	public List<FullExercise> getAllByTrainingDayId(Long trainDayId) {
		return fullExerRepo.findByTrainingDay_id(trainDayId);
	}

	@Override
	public List<FullExercise> getAllByDateOfTraining(String dateOfTrainStr) {
		
		return fullExerRepo.findByTrainingDay_dateOfTraining(LocalDateTime.parse(dateOfTrainStr));
	}

	
}
