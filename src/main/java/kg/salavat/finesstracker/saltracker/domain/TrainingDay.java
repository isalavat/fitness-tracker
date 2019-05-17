package kg.salavat.finesstracker.saltracker.domain;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * describes the date of the exercise
 * @author salavat
 *
 */
@Entity
@Table(name="training_day")
public class TrainingDay {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="date_of_training")
	private LocalDateTime dateOfTraining;
	
	@JsonIgnore
	@OneToMany(mappedBy = "trainingDay", cascade = CascadeType.ALL)
	private List<FullExercise> fullExercises;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getDateOfTraining() {
		return dateOfTraining;
	}
	public void setDateOfTraining(LocalDateTime dateOfTraining) {
		this.dateOfTraining = dateOfTraining;
	}
	public List<FullExercise> getFullExercises() {
		return fullExercises;
	}
	public void setFullExercises(List<FullExercise> fullExercises) {
		this.fullExercises = fullExercises;
	}
	@Override
	public String toString() {
		return "TrainingDay [id=" + id + ", dateOfTraining=" + dateOfTraining + ", fullExercises=" + fullExercises
				+ "]";
	}
}
