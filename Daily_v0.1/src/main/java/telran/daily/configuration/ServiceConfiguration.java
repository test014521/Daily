package telran.daily.configuration;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration.AccessLevel;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import telran.daily.dto.TaskDto;
import telran.daily.model.Task;

@Configuration
public class ServiceConfiguration {
    @Bean
    ModelMapper getModelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		
		modelMapper.getConfiguration()
						.setFieldMatchingEnabled(true)		
						.setFieldAccessLevel(AccessLevel.PRIVATE)
						.setMatchingStrategy(MatchingStrategies.LOOSE);
		
		TaskConverter converterTask = new TaskConverter();
		modelMapper.addConverter(converterTask);
		
		return modelMapper;
	}
	
}
