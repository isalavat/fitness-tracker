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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="full_exercise")

public class FullExercise {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
						  CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name = "exercise_id")
	private Exercise exercise;
	
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
						  CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name = "training_day_id")
	private TrainingDay trainingDay;
	
	@Column(name = "weight")
	private int weight;
	
	@Column(name = "amount")
	private int amount;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Exercise getExercise() {
		return exercise;
	}
	public void setExercise(Exercise exercise) {
		this.exercise = exercise;
	}
	public TrainingDay getTrainingsDay() {
		return trainingDay;
	}
	public void setTrainingDay(TrainingDay trainingDay) {
		this.trainingDay = trainingDay;
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
	@Override
	public String toString() {
		return "FullExercise [exercise=" + exercise + ", trainingsDay=" + trainingDay + ", weight=" + weight
				+ ", amount=" + amount + "]";
	}
	
}
