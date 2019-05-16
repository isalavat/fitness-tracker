package kg.salavat.finesstracker.saltracker.service;

import java.util.List;
import java.util.Optional;

import kg.salavat.finesstracker.saltracker.domain.TrainingDay;

public interface TrainingDayService {
	public Optional<TrainingDay> getById(Long id);
	public List<TrainingDay> getAll();
	public TrainingDay save(TrainingDay trainDay);
	public String deleteById(Long id);
}
