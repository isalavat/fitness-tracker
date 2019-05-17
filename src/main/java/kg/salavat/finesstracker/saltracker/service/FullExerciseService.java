package kg.salavat.finesstracker.saltracker.service;

import java.util.List;
import java.util.Optional;

import kg.salavat.finesstracker.saltracker.domain.FullExercise;

public interface FullExerciseService {
	public Optional<FullExercise> getById(Long id);
	public List<FullExercise> getAll();
	public FullExercise save(FullExercise fullExercise);
	public String deleteById(Long id);
	public List<FullExercise> getAllByTrainingDayId(Long trainDayId);
	public List<FullExercise> getAllByDateOfTraining(String dateOfTrainStr);
}
