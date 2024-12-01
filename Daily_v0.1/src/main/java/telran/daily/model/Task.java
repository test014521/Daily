package telran.daily.model;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "tasks")
@ToString
public class Task implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8945725647185009967L;
	@Id
	Long id;
	private String title;
	String description;
	LocalDateTime completedDate;
	LocalDateTime createdDateTime;
	LocalDateTime updatedDateTime;
	
	public Task(String title, String description, LocalDateTime completedDate) {
		super();
		this.title = title;
		this.description = description;
		this.completedDate = completedDate;
//		Instant nowUtc = Instant.now();
//		createdDateTime = LocalDateTime.ofInstant(nowUtc, ZoneId.of("UTC"));
		createdDateTime = LocalDateTime.now(ZoneId.of("UTC"));
		updatedDateTime = LocalDateTime.now(ZoneId.of("UTC"));
	}
	
	

}
