package tallerpruebas;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	
	@Test 
	public void testJanuaryWorker() { 

		Employee employee = new Employee(100.0f, "USD", 0.0f, EmployeeType.Worker);
		
		System.out.println("JanuarySupervisor");
		System.out.println(employee.cs());
		System.out.println(employee.CalculateYearBonus());
	
		assertEquals(164.33334f, employee.cs());
		
		assertEquals(386.0f, employee.CalculateYearBonus()); 

	} 
	
	@Test
	public void testFebruaryWorker() { 
		LocalDate mockedDate = LocalDate.of(2022, 1, 1);

		Employee employee = new Employee(100.0f, "USD", 0.0f, EmployeeType.Worker); 
	
		System.out.println("FebruaryWorker");
		System.out.println(employee.cs());
		System.out.println(employee.CalculateYearBonus());
		
		assertEquals(100.0d, employee.cs()); 
	
		assertEquals(386.0d, employee.CalculateYearBonus()); 

	} 

	 

	@Test
	public void testJanuarySupervisor() { 

		Employee employee = new Employee(500.0f, "YUAN", 0.5f, EmployeeType.Supervisor); 
	
		System.out.println("JanuarySupervisor");
		System.out.println(employee.cs());
		System.out.println(employee.CalculateYearBonus());
		
		assertEquals(540.183f, employee.cs()); 
	
		assertEquals(668.0f, employee.CalculateYearBonus()); 

	} 

	 

	@Test 
	public void testFebruarySupervisor() { 

		Employee employee = new Employee(500.0f, "USD", 0.5f, EmployeeType.Supervisor); 
	
		System.out.println("FebruarySupervisor");
		System.out.println(employee.cs());
		System.out.println(employee.CalculateYearBonus());
		
		assertEquals(500.175f, employee.cs()); 
	
		assertEquals(693.0f, employee.CalculateYearBonus()); 

	} 

	 

	@Test 
	public void testFebruaryManager() { 

		Employee employee = new Employee(400.0f, "USD", 0.5f, EmployeeType.Manager); 
	
		System.out.println("FebruaryManager");
		System.out.println(employee.cs());
		System.out.println(employee.CalculateYearBonus());
		
		assertEquals(400.35f, employee.cs()); 
	
		assertEquals(786.0f, employee.CalculateYearBonus()); 

	}

}
