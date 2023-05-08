package mapper;

import dto.CountryDto;
import model.Country;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface DifferentFieldMapper {

    // Mapping with different field name

    @Mapping(target = "continent", source = "countryDto.region")
    Country countryDtoToCountry(CountryDto countryDto);

    @Mapping(target = "region", source = "country.continent")
    CountryDto countryDtoToCountry(Country country);
}
