package stub;

import java.util.ArrayList;
import java.util.List;

import service.Salary;

public class SalaryStrub implements Salary {

	public ArrayList<Integer> returnSalaries() {
		// TODO Auto-generated method stub
		ArrayList<Integer> salaries =  new ArrayList<Integer>();
		salaries.add(60000);


		return salaries;
	}

}
