package service;

import java.util.List;

import pojo.City;

public interface cityServict1 {

	List<City> selectAll();
     void delete(City city);
     void add(City city);
     City fadall(City city);
}
