package kg.salavat.finesstracker.saltracker.service;

import java.util.List;
import java.util.Optional;

import kg.salavat.finesstracker.saltracker.domain.Exercise;

public interface ExerciseService {
	public Optional<Exercise> getById(Long id);
	public List<Exercise> getAll();
	public Exercise save(Exercise exercise);
	public String delete(Exercise exercise);
	public String deleteById(Long id);
}
