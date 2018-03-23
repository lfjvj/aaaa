package dao;

import java.util.List;

import javax.persistence.Id;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.iml.CityDao1;
import pojo.City;

@Repository
public class CityDao implements CityDao1 {
@Autowired
private SessionFactory sf;
@Override
public List<City> seleteAll(){
	Session session = sf.getCurrentSession();
	SQLQuery query = session.createSQLQuery("select * from city").addEntity(City.class);
      List list = query.list();
	return list;
	
}	@Override
public void delete(City city) {
Session session = sf.getCurrentSession();
session.delete(city);
}
@Override
public void add(City city) {
Session session = sf.getCurrentSession();	
session.saveOrUpdate(city);
}
@Override
public City fadall(City city) {
     Session session = sf.getCurrentSession();
     city=session.get(City.class, city.getId());
	return city;
}


}
