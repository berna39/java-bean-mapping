import dto.TeamDto;
import mapper.WithChildBeanMapper;
import model.Country;
import model.Team;
import org.mapstruct.factory.Mappers;

public class ChildBean {

    public static void main(String[] args) {
        WithChildBeanMapper mapper = Mappers.getMapper(WithChildBeanMapper.class);

        Country country = new Country();
        country.setName("England");
        country.setContinent("Europe");

        TeamDto teamDto = new TeamDto();
        teamDto.setName("Arsenal");
        teamDto.setCountry(country);

        Team team = mapper.teamDtoToTeam(teamDto);
        System.out.println(team);
    }
}
