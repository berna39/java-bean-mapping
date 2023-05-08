import dto.CountryDto;
import mapper.CountryMapper;
import model.Country;
import org.mapstruct.factory.Mappers;

public class DifferentFields {

    public static void main(String[] args) {
        CountryMapper mapper = Mappers.getMapper(CountryMapper.class);
        CountryDto countryDto = new CountryDto();

        countryDto.setName("DR Congo");
        countryDto.setRegion("Africa");

        Country country = mapper.countryDtoToCountry(countryDto);
        System.out.println(country);
    }
}
