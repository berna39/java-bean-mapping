package mapper;

import dto.TeamDto;
import model.Team;
import org.mapstruct.Mapper;

@Mapper
public interface WithChildBeanMapper {

    Team teamDtoToTeam(TeamDto teamDto);
    TeamDto teamToTeamDto(Team team);
}
