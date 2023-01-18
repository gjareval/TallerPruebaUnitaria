package tests;

import junit.framework.TestCase;
import tallerpruebas.*;


public class EmployeeCalculateYearBonusTest extends TestCase {
	
	public void testUSDWorker() {
		assertEquals(386.0,Math.floor(new Employee(400.0f,"USD",0.2f,EmployeeType.Worker).CalculateYearBonus()));
	}
	
	public void testUSDSupervisor() {
		assertEquals(843.0,Math.floor(new Employee(650.0f,"USD",0.4f,EmployeeType.Supervisor).CalculateYearBonus()));
	}
	
	public void testUSDManager() {
		assertEquals(1216.0,Math.floor(new Employee(830.0f,"USD",0.8f,EmployeeType.Manager).CalculateYearBonus()));
	}
	
	public void testOtherCurrencyWorker() {
		assertEquals(386.0,Math.floor(new Employee(410.0f,"EUR",0.2f,EmployeeType.Worker).CalculateYearBonus()));
	}
	
	public void testOtherCurrencySupervisor() {
		assertEquals(715.0,Math.floor(new Employee(550.0f,"MXN",0.5f,EmployeeType.Supervisor).CalculateYearBonus()));
	}
	
	public void testOtherCurrencyManager() {
		assertEquals(1288.0,Math.floor(new Employee(950.0f,"COP",0.85f,EmployeeType.Manager).CalculateYearBonus()));
	}

}
