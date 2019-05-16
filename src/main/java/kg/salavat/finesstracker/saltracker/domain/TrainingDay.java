package kg.salavat.finesstracker.saltracker.domain;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="training_day")
public class TrainingDay {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="date_of_training")
	private Date dateOfTraining;
	
	@JsonIgnore
	@OneToMany(mappedBy = "trainingDay", cascade = CascadeType.ALL)
	private List<FullExercise> fullExercises;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateOfTraining() {
		return dateOfTraining;
	}
	public void setDateOfTraining(Date dateOfTraining) {
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
		return "TrainingsDay [id=" + id + ", dateOfTraining=" + dateOfTraining + ", fullExercises=" 
				+ "]";
	}
	
}
