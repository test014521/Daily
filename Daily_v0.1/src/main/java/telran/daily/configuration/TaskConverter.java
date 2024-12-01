package telran.daily.configuration;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;

import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

import telran.daily.dto.TaskDto;
import telran.daily.model.Task;

public class TaskConverter implements Converter<TaskDto, Task>{

	@Override
	public Task convert(MappingContext<TaskDto, Task> context) {
		Task task = new Task(context.getSource().getTitlE(),context.getSource().getDescription(),
				LocalDateTime.parse(context.getSource().getCompletedDate()+"T" + LocalTime.now()));
		int randomInt = new Random().nextInt();
		task.setId((long)randomInt);
		return task;
	}

}
