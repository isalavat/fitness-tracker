package kg.salavat.finesstracker.saltracker.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kg.salavat.finesstracker.saltracker.domain.FullExercise;
import kg.salavat.finesstracker.saltracker.service.FullExerciseService;

@RestController
@RequestMapping("/saltracker")
public class FullExerciseRestController {
	@Autowired
	FullExerciseService fullExerServ;
	
	@GetMapping("/full-exercises/{id}")
	public FullExercise getById(@PathVariable Long id) {
		return fullExerServ.getById(id);
	}
	
	@GetMapping("/full-exercises")
	public List<FullExercise> getAll() {
		return fullExerServ.getAll();
	}
	
	@GetMapping("/full-exercises/training-day-id/{trainingDayId}")
	public List<FullExercise> getAllByTrainingDayId(@PathVariable Long trainingDayId) {
		return fullExerServ.getAllByTrainingDayId(trainingDayId);
	}
	
	@GetMapping("/full-exercises/training-date/{dateOfTraining}")
	public List<FullExercise> getAllByTrainingDayId(@PathVariable String dateOfTraining) {
		return fullExerServ.getAllByDateOfTraining(dateOfTraining);
	}
	
	@PostMapping("/full-exercises")
	public FullExercise save(@RequestBody FullExercise fullExercise) {
		return fullExerServ.save(fullExercise);
	}
	
	@DeleteMapping("/full-exercises/{id}")
	public String deleteById(@PathVariable Long id) {
		return fullExerServ.deleteById(id);
	}
}
