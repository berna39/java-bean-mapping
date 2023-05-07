import dto.TodoDto;
import mapper.SimpleSourceDestinationMapper;
import model.Status;
import model.Todo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

public class Application {

    public static void main(String[] args) {
        SimpleSourceDestinationMapper mapper = Mappers.getMapper(SimpleSourceDestinationMapper.class);

        TodoDto todoDto = new TodoDto();
        todoDto.setTitle("Todo 1");
        todoDto.setDetail("Details for Todo 1");
        todoDto.setStatus(Status.PENDING);

        // creating new instance with mapping from TodoDto
        Todo todo = mapper.sourceToDestination(todoDto);
        System.out.println(todo);
    }
}
