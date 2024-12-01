package telran.daily.service;

import java.time.LocalDateTime;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import telran.daily.dao.DailyRepository;
import telran.daily.dto.TaskDto;
import telran.daily.model.Task;

@Service
@RequiredArgsConstructor
public class DailyServiceImpl implements DailyService{
	final DailyRepository dailyRepository;
	final ModelMapper modelMapper;
	
	@Override
	public Boolean createTask(TaskDto taskDto) {
		Task task = modelMapper.map(taskDto, Task.class);
//		Task task = new Task(taskDto.getTitle(),taskDto.getDescription(),
//			LocalDateTime.parse(taskDto.getCompletedDate()));
		
		System.out.println(task);
//		task.setId(1L); //TODO 
//		dailyRepository.save(task);
		return true;
	}

}
