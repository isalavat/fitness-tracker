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

import kg.salavat.finesstracker.saltracker.domain.TrainingDay;
import kg.salavat.finesstracker.saltracker.service.TrainingDayService;

@RestController
@RequestMapping("/saltracker")
public class TrainingDayRestController {
	@Autowired
	TrainingDayService trainDayServ;
	
	@GetMapping("/training-days/{id}") 
	public TrainingDay getById(@PathVariable Long id){
		return trainDayServ.getById(id).get();
	}
	
	@GetMapping("/training-days") 
	public List<TrainingDay> getAll(){
		return trainDayServ.getAll();
	}
	
	@GetMapping("/training-days/date/{date}") 
	public List<TrainingDay> getByDate(@PathVariable String date){
		return trainDayServ.getByDateOfTraining(date);
	}
	
	@PostMapping("/training-days")
	public TrainingDay save(@RequestBody TrainingDay trainingDay) {
		return trainDayServ.save(trainingDay);
	}
	
	@DeleteMapping("/training-days/{id}")
	public String deleteById(@PathVariable Long id) {
		return trainDayServ.deleteById(id);
	} 
}
