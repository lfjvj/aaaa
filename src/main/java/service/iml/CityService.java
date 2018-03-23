package service.iml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.iml.CityDao1;
import pojo.City;
import service.cityServict1;
@Service
@Transactional
public class CityService implements cityServict1 {
@Autowired
private CityDao1 cd;
	
	@Override
	public List<City> selectAll() {
	List<City> seleteAll = cd.seleteAll();
		
		return seleteAll;
	}

	@Override
	public void delete(City city) {
		
		cd.delete(city);
	}

	@Override
	public void add(City city) {
		cd.add(city);
	}

	@Override
	public City fadall(City city) {
		City fadall = cd.fadall(city);
		return fadall;
	}

}
