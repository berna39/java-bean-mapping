import dto.TodoDto;
import mapper.SimpleSourceDestinationMapper;
import model.Status;
import model.Todo;
import org.mapstruct.factory.Mappers;

public class SimpleExample {

    public static void main(String[] args) {
        SimpleSourceDestinationMapper mapper = Mappers.getMapper(SimpleSourceDestinationMapper.class);

        TodoDto todoDto = new TodoDto();
        todoDto.setTitle("Todo 1");
        todoDto.setDetail("Details for Todo 1");
        todoDto.setStatus(Status.PENDING);

        // creating new instance with mapping from TodoDto
        Todo todo = mapper.sourceToDestination(todoDto);
        System.out.println(todo);

        // Destination to source
        todo.setTitle("Todo 1 updated");
        TodoDto todoDto1 = mapper.destinationToSource(todo);
        System.out.println(todoDto1);
    }
}
