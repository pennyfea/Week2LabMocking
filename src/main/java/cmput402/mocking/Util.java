package cmput402.mocking;

import java.util.ArrayList;
import java.util.List;

import service.City;
import service.Salary;

public class Util {
	
	public int filterEdmonton(City city){
		int count = 0;
		List<String> cities = new ArrayList <String>();
		cities = city.listCities();
		for(String acity: cities){
			if(acity.equals("Edmonton"))
				count++;
		}
		
		return count;
	}
	
	public int filterSalariesOver50k(Salary salary){
		int count = 0;
		ArrayList<Integer> salaries =  new ArrayList<Integer>();
		salaries = salary.returnSalaries();
		for(Integer asalary: salaries){
			if(salaries.contains(asalary > 50000)) {
				count++;
			}
		}
		
		return count;
	}

}
