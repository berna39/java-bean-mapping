import dto.CountryDto;
import mapper.DifferentFieldMapper;
import model.Country;
import org.mapstruct.factory.Mappers;

public class DifferentFields {

    public static void main(String[] args) {
        DifferentFieldMapper mapper = Mappers.getMapper(DifferentFieldMapper.class);
        CountryDto countryDto = new CountryDto();

        countryDto.setName("DR Congo");
        countryDto.setRegion("Africa");

        Country country = mapper.countryDtoToCountry(countryDto);
        System.out.println(country);
    }
}
