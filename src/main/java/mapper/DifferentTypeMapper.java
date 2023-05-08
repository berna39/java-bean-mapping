package mapper;

import dto.EventDto;
import model.Event;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface DifferentTypeMapper {

    @Mapping(target="date", source = "eventDto.date", dateFormat = "dd-MM-yyyy HH:mm:ss")
    Event eventDtoToEvent(EventDto eventDto);
    @Mapping(target="date", source = "event.date", dateFormat = "dd-MM-yyyy HH:mm:ss")
    EventDto eventToEventDto(Event event);
}
