package web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.City;
import service.cityServict1;

@Controller
public class CityController {

	@Autowired
	private cityServict1 cs;
	@RequestMapping("/list")
	public String fn(ModelMap map,City city){
		List<City> dl = cs.selectAll();
		map.put("dl", dl);
		return "City";
		
	}
	@RequestMapping("/delete")
	public String fn1(City city){
		cs.delete(city);
		return "redirect:list";
		
	}
	@RequestMapping("/xg")
	public String fn2(ModelMap map,City city){
		City fadall = cs.fadall(city);
		List<City> selectAll = cs.selectAll();
		map.put("fadall", fadall);
		map.put("selectAll", selectAll);
		return "xgg";
		
		
	}
	@RequestMapping("/add")
	public String fn3(City city){
		
		cs.add(city);
		return "redirect:list";
		
	}
}
