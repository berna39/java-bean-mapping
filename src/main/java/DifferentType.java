import dto.EventDto;
import mapper.DifferentTypeMapper;
import model.Event;
import org.mapstruct.factory.Mappers;

import java.util.Date;

public class DifferentType {

    public static void main(String[] args) {
        DifferentTypeMapper mapper = Mappers.getMapper(DifferentTypeMapper.class);

        EventDto eventDto = new EventDto();
        eventDto.setName("Stromae concert");
        eventDto.setDate(new Date());

        Event event = mapper.eventDtoToEvent(eventDto);
        System.out.println(event);

        // Reverse operation
        event.setName("Youss concert");
        eventDto = mapper.eventToEventDto(event);
        System.out.println(eventDto);
    }
}
