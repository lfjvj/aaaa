package dao.iml;

import java.util.List;

import pojo.City;

public interface CityDao1 {

	List<City> seleteAll();
	void delete(City city);
	void add(City city);
	City fadall(City city);
        
}
