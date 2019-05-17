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

import kg.salavat.finesstracker.saltracker.domain.Exercise;
import kg.salavat.finesstracker.saltracker.service.ExerciseService;

@RestController
@RequestMapping("/saltracker")
public class ExerciseRestController {
	@Autowired
	ExerciseService exerServ;
	
	@GetMapping("/exercises/{id}")
	public Exercise getById(@PathVariable Long id) {
		return exerServ.getById(id).get();
	}
	
	@GetMapping("/exercises")
	public List<Exercise> getAll() {
		return exerServ.getAll();
	}
	
	@DeleteMapping("/exercises/{id}")
	public String deleteById(@PathVariable Long id) {
		return exerServ.deleteById(id);
	}
	
	@PostMapping("/exercises")
	public Exercise save(@RequestBody Exercise exercise) {
		return exerServ.save(exercise);
	}
	
}
