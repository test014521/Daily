package telran.daily.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
public class TaskDto {
	String titlE;
    String description;
    @JsonProperty("completed date")
    String completedDate;    
}
