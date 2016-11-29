package dolphin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dolphin.dao.CountryDao;
import dolphin.mode.Country;
import dolphin.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService{

	@Autowired
	private CountryDao countryDao;	
	
	public Country getCountyById(int id) {
		return countryDao.getCountry(id);
	}
}
