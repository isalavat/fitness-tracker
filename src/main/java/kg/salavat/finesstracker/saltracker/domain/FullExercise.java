package kg.salavat.finesstracker.saltracker.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * Describes the full exercise, i.e. amount and weight in kilogram, 
 * and also has information on what date it was made 
 * @author salavat
 */
@Entity
@Table(name="full_exercise")
public class FullExercise {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "weight")
	private int weight;
	
	@Column(name = "amount")
	private int amount;
	
	@ManyToOne(cascade = { CascadeType.MERGE,
						  CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name = "exercise_id")
	private Exercise exercise;
	
	
	@ManyToOne(cascade = { CascadeType.MERGE,
						  CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name = "training_day_id")
	private TrainingDay trainingDay;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public Exercise getExercise() {
		return exercise;
	}
	public void setExercise(Exercise exercise) {
		this.exercise = exercise;
	}
	public TrainingDay getTrainingDay() {
		return trainingDay;
	}
	public void setTrainingDay(TrainingDay trainingDay) {
		this.trainingDay = trainingDay;
	}
	
	@Override
	public String toString() {
		return "FullExercise [id=" + id + ", exercise=" + exercise + ", trainingDay=" + trainingDay + ", weight="
				+ weight + ", amount=" + amount + "]";
	}
	
	
}
