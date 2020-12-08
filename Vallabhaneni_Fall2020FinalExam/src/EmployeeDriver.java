
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Praneeth Vallabhaneni
 */
public class EmployeeDriver
{
	public static void main(String[] args)
	{
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("44", "John", 10000.0));
		employeeList.add(new Employee("11", "William", 20000.0));
		employeeList.add(new Employee("55", "Philip", 5000.0));
		employeeList.add(new Employee("22", "Charles", 8000.0));
		employeeList.add(new Employee("33", "Chris", 15000.0));
		
		System.out.println("Employees original list: ");
		for(Employee e : employeeList)
		{
			System.out.println(e);
		}
		System.out.println();
		
	
		Collections.sort(employeeList);
		System.out.println("Printing the list again");
		for(Employee e : employeeList)
		{
			System.out.println(e);
		}
		System.out.println();
		
		
		Collections.sort(employeeList, new Comparator<Employee>()
      		{

                                        @Override
					public int compare(Employee e1, Employee e2)
					{
						if(e1.getEmpSalary() < e2.getEmpSalary())
							return -1;
						else if (e1.getEmpSalary() == e2.getEmpSalary())
							return 0;
						else
							return +1;
					}
      		});
		System.out.println("Employees sorting by Salary");
		for(Employee e : employeeList)
		{
			System.out.println(e);
		}
		System.out.println();
		
	
		Collections.sort(employeeList, new Comparator<Employee>()
      		{
					public int compare(Employee e1, Employee e2)
					{
							return (e1.getEmpName()).compareTo(e2.getEmpName());

}
      		});
		System.out.println("Employees sorting by name");
		for(Employee e : employeeList)
		{
			System.out.println(e);
		}
		System.out.println();


	}

}
