package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class GuestListTest {
	@Test
	public void testGetCount1() {
		// Arrange
		GuestList gl = new GuestList();
		gl.add("David", 33, true);
		// Act
		int actual = gl.getCount();
		// Assert
		int expected = 1;
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCount2() {
		// Arrange
		GuestList gl = new GuestList();
		gl.add("Tim", 103, false);
		// Act
		int actual = gl.getCount();
		// Assert
		int expected = 1;
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCount3() {
		// Arrange
		GuestList gl = new GuestList();
		gl.add("Pops", -13, true);
		// Act
		int actual = gl.getCount();
		// Assert
		int expected = 1;
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCount4() {
		// Arrange
		GuestList gl = new GuestList();
		gl.add("Tim", 103, false);
		gl.add("David", 20, true);
		// Act
		int actual = gl.getCount();
		// Assert
		int expected = 2;
		assertEquals(expected, actual);
	}
	@Test
	public void testGetMemberCount1() {
		// Arrange
		GuestList gl = new GuestList();
		gl.add("David", 47, true);
		// Act
		int actual = gl.getMemberCount();
		// Assert
		int expected = 1;
		assertEquals(expected, actual);
	}
	@Test
	public void testGetMemberCount2() {
		// Arrange
		GuestList gl = new GuestList();
		gl.add("Tim", 27, false);
		// Act
		int actual = gl.getMemberCount();
		// Assert
		int expected = 0;
		assertEquals(expected, actual);
	}
	@Test
	public void testGetMemberCount3() {
		// Arrange
		GuestList gl = new GuestList();
		gl.add("Tim", 27, false);
		gl.add("David", 47, true);
		// Act
		int actual = gl.getMemberCount();
		// Assert
		int expected = 1;
		assertEquals(expected, actual);
	}
	@Test
	public void testGetMemberCount4() {
		// Arrange
		GuestList gl = new GuestList();
		gl.add("Tim", 27, true);
		gl.add("David", 47, true);
		// Act
		int actual = gl.getMemberCount();
		// Assert
		int expected = 2;
		assertEquals(expected, actual);
	}
	@Test
	public void testGetMemberAgeSum1() {
		//Arrange
		GuestList gl = new GuestList();
		gl.add("Brian", 27, true);
		// Act 
		int actual = gl.getSum();
		// Assert 
		int expected = 27;
		assertEquals(expected, actual);
	}
	@Test
	public void testGetMemberAgeSum2() {
		//Arrange
		GuestList gl = new GuestList();
		gl.add("Brian", 27, true);
		gl.add("Roxy", 10, false);
		// Act 
		int actual = gl.getSum();
		// Assert 
		int expected = 37;
		assertEquals(expected, actual);
	}
	@Test
	public void testGetMemberAgeSum3() {
		//Arrange
		GuestList gl = new GuestList();
		gl.add("Brian", 27, true);
		gl.add("Roxy", 10, false);
		gl.add("Fetus", -1, false);
		// Act 
		int actual = gl.getSum();
		// Assert 
		int expected = 36;
		assertEquals(expected, actual);
	}
	
	


}

