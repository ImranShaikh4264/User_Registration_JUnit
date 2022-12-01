package com.bridgelab.user_registration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
// UC-10 - JUnit test to validiate user information.
public class UserTest {
	
	//happy test case for first name.
	@Test
	public void testFirstNameReturnTrue() {

		boolean result = UserRegistration.firstName("Imran");
		assertEquals(true, result);

	}
	
	//Sad test case for first name.
	@Test
	public void testFirstNameReturnFalse() {

		boolean result = UserRegistration.firstName("imran");
		assertEquals(true, result);

	}
	
	//happy test case for last name.
	@Test
	public void testLastNameReturnTrue() {

		boolean result = UserRegistration.lastName("Shaikh");
		assertEquals(true, result);

	}
	//Sad test case for last name.
	@Test
	public void testLastNameReturnFalse() {

		boolean result = UserRegistration.lastName("shaikh");
		assertEquals(true, result);

	}
	//happy test case for email .
	@Test
	public void testEmailReturnTrue() {

		boolean result = UserRegistration.email("shaikhimrana56@gmail.com");
		assertEquals(true, result);

	}
	//sad test case for email.
	@Test
	public void testEmailReturnFalse() {

		boolean result = UserRegistration.email("shaikh@imrana56@gmail.com");
		assertEquals(true, result);

	}
	
	//happy test case for mobile number.
	@Test
	public void testMobileNumberReturnTrue() {

		boolean result = UserRegistration.mobileNumber("918806772186");
		assertEquals(true, result);

	}
	
	//sad  test case for mobile number.
	@Test
	public void testMobileNumberReturnFalse() {

		boolean result = UserRegistration.mobileNumber("91880677218");
		assertEquals(true, result);

	}
	
	//happy test case for password.
	@Test
	public void testPasswordReturnTrue() {

		boolean result = UserRegistration.password("Imran$Sh123");
		assertEquals(true, result);

	}
	
	//sad test case for pasword.
	@Test
	public void testPasswordReturnFalse() {

		boolean result = UserRegistration.password("Imransh123");
		assertEquals(true, result);

	}
}
