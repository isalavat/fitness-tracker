package kg.salavat.finesstracker.saltracker.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kg.salavat.finesstracker.saltracker.domain.TrainingDay;
import kg.salavat.finesstracker.saltracker.service.TrainingDayService;

@RestController
@RequestMapping("/saltracker")
public class TrainingDayRestController {
	@Autowired
	TrainingDayService trainDayServ;
	
	@GetMapping("/trainingdays/{id}") 
	public TrainingDay getById(@PathVariable Long id){
		return trainDayServ.getById(id).get();
	}
}
