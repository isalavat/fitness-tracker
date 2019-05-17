package kg.salavat.finesstracker.saltracker.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kg.salavat.finesstracker.saltracker.domain.FullExercise;
import kg.salavat.finesstracker.saltracker.service.FullExerciseService;

@RestController
@RequestMapping("/saltracker")
public class FullExerciseRestController {
	@Autowired
	FullExerciseService fullExerServ;
	
	@GetMapping("/full-exercises/{trainingDayId}")
	public List<FullExercise> getAllByTrainingDayId(@PathVariable Long trainingDayId) {
		return fullExerServ.getAllByTrainingDayId(trainingDayId);
	}
	
	@GetMapping("/full-exercises/date/{dateOfTraining}")
	public List<FullExercise> getAllByTrainingDayId(@PathVariable String dateOfTraining) {
		return fullExerServ.getAllByDateOfTraining(dateOfTraining);
	}
}
