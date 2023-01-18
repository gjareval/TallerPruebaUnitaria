package tests;

import junit.framework.TestCase;
import tallerpruebas.Employee;
import tallerpruebas.EmployeeType;

public class EmployeeCSTest extends TestCase{
	
	
	public void testUSDWorker() {
		assertEquals(564.0,Math.floor(new Employee(500.0f,"USD",0.3f,EmployeeType.Worker).cs()));
	}
	
	public void testUSDSupervisor() {
		assertEquals(664.0,Math.floor(new Employee(600.0f,"USD",0.5f,EmployeeType.Supervisor).cs()));
	}
	
	public void testUSDManager() {
		assertEquals(914.0,Math.floor(new Employee(850.0f,"USD",0.9f,EmployeeType.Manager).cs()));
	}
	
	public void testOtherCurrencyWorker() {
		assertEquals(444.0,Math.floor(new Employee(400.0f,"EUR",0.25f,EmployeeType.Worker).cs()));
	}
	
	public void testOtherCurrencySupervisor() {
		assertEquals(682.0,Math.floor(new Employee(650.0f,"MXN",0.6f,EmployeeType.Supervisor).cs()));
	}
	
	public void testOtherCurrencyManager() {
		assertEquals(919.0,Math.floor(new Employee(900.0f,"COP",0.9f,EmployeeType.Manager).cs()));
	}
	
	public void testNullSalary() {
		assertEquals(0.0,Math.floor(new Employee(0.0f,"USD",0.9f,EmployeeType.Manager).cs()));
	}
}