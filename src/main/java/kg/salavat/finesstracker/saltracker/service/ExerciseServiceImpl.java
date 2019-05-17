package kg.salavat.finesstracker.saltracker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kg.salavat.finesstracker.saltracker.domain.Exercise;
import kg.salavat.finesstracker.saltracker.repository.ExerciseRepository;

@Service
public class ExerciseServiceImpl implements ExerciseService {
	@Autowired
	ExerciseRepository exerRepo;
	
	@Override
	public Optional<Exercise> getById(Long id) {
		return exerRepo.findById(id);
	}

	@Override
	public List<Exercise> getAll() {
		return exerRepo.findAll();
	}

	@Override
	public Exercise save(Exercise exercise) {
		return exerRepo.save(exercise);
	}

	@Override
	public String delete(Exercise exercise) {
		exerRepo.delete(exercise);
		return "Successfully deleted";
	}
	
	@Override
	public String deleteById(Long id) {
		exerRepo.deleteById(id);
		return "Successfully deleted";
	}

}
