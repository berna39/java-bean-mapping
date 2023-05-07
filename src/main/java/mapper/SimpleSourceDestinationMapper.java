package mapper;

import dto.TodoDto;
import model.Todo;
import org.mapstruct.Mapper;

@Mapper
public interface SimpleSourceDestinationMapper {
    Todo sourceToDestination(TodoDto todoDto);
    TodoDto destinationToSource(Todo todo);
}
