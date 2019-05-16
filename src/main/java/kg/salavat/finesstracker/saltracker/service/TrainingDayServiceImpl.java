package kg.salavat.finesstracker.saltracker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kg.salavat.finesstracker.saltracker.domain.TrainingDay;
import kg.salavat.finesstracker.saltracker.repository.TrainingDayRepository;

@Service
public class TrainingDayServiceImpl implements TrainingDayService {
	@Autowired
	TrainingDayRepository trainDayRepo;
	
	@Override
	public Optional<TrainingDay> getById(Long id) {
		return trainDayRepo.findById(id);
	}

	@Override
	public List<TrainingDay> getAll() {
		return trainDayRepo.findAll();
	}

	@Override
	public TrainingDay save(TrainingDay trainDay) {
		return trainDayRepo.save(trainDay);
	}

	@Override
	public String deleteById(Long id) {
		trainDayRepo.deleteById(id);
		return "Sucessfully deleted";
	}

}
