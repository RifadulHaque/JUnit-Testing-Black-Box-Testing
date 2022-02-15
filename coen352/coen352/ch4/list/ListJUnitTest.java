package coen352.ch4.list;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


public class ListJUnitTest {

	  private static ADTList<Integer> L1;
	  private static ADTList<Integer> L2;
	  private static ADTList<Object> L3;
	  
	  
	  
	  /**
	   * This method is automatically called once before each test case method,
	   * so that all the variables are cleanly initialized for each test.
	   */
	  @BeforeAll
	  public static void setUp()
	  {
	    L1 = new LList<Integer>();
	    L2 = new AList<Integer>(15);
	    L3 = new DList<Object>();
	  }
	
	  /** @return True if k is in list L, false otherwise */
	
	 @Test
	  public static boolean find(ADTList<Integer> L, int k) {
	  for (L.moveToStart(); L.currPos()<L.length(); L.next())
	    if (k == L.getValue()) return true;    // Found k
	  return false;                            // k not found
	}

	@Test
	public void testRemoveInterfaceECC1(){
	 	//LinkF1, LinkT2
		//tracker for null and empty list check
		boolean nullChecker= false;
		boolean emptyChecker= false;
		//clearing the list and then appending value to the list
		L1.clear();
		L1.append(1);

		//if there is an item in the list and we want to check
		//if we remove the item then the list if null or not.
		if(L1.remove()==null){
			nullChecker=true;
		}
		//if it returns false then the list is not null
		assertEquals(false, nullChecker);

		//adding 2 in the list for checking list empty upon removing the item.
		L1.append(2);
		assertEquals("< | 2 >", L1.toString());
		assertEquals(2, (int)L1.remove());

		//using if statment to check the length and the print statement of the list to determine if the list is empty or not.
		if(L1.toString().equals("< | >") && L1.length()==0){
			emptyChecker=true;
		}
		//expected print of the list
		assertEquals("< | >", L1.toString());
		//statement to check if the list is empty or not
		assertEquals(true, emptyChecker);
	}

	@Test
	public void testRemoveInterfaceECC2(){

		//LinkT1, LinkF2

		//tracker for null and empty list check
		boolean nullChecker= false;
		boolean emptyChecker= false;

		//clearing the list and then appending value to the list
		L1.clear();
		//returns true if the list is null
		assertEquals(true, !nullChecker);

		L1.append(1);
		assertEquals("< | 1 >", L1.toString());

		//checks if the list is empty or not
		if(L1.toString().equals("< | >") && L1.length()==0){
			emptyChecker=true;
		}
		//returns false if the list is not empty
		assertEquals(false, emptyChecker);

	}


	@Test
	public void testRemoveInterfaceECC3(){

		//ArrayF1, ArrayT2

		//tracker for null and empty list check
		boolean nullChecker= false;
		boolean emptyChecker= false;

		//clearing the list and then appending value to the list
		L2.clear();
		L2.append(1);

		//if there is an item in the list and we want to check
		//if we remove the item then the list if null or not.
		if(L2.remove()==null){
			nullChecker=true;
		}
		//if it returns false then the list is not null
		assertEquals(false, nullChecker);

		//adding 2 in the list for checking list empty
		//upon removing the item.
		L2.append(2);
		assertEquals("< | 2 >", L2.toString());
		assertEquals(2, (int)L2.remove());

		//using if statment to check the length and the print
		//statement of the list to determine if the Array is empty or not.
		if(L2.toString().equals("< | >") && L2.length()==0){
			emptyChecker=true;
		}
		//expected print of the Array
		assertEquals("< | >", L2.toString());
		//statement to check if the Array is empty or not
		assertEquals(true, emptyChecker);
	}

	@Test
	public void testRemoveInterfaceECC4(){

		//ArrayT1, ArrayF2

		//tracker for null and empty list check
		boolean nullChecker= false;
		boolean emptyChecker= false;

		//clearing the list and then appending value to the list
		L2.clear();
		//returns true if the list is null
		assertEquals(true, !nullChecker);

		L2.append(1);
		assertEquals("< | 1 >", L2.toString());

		//checks if the list is empty or not
		if(L2.toString().equals("< | >") && L2.length()==0){
			emptyChecker=true;
		}
		//returns false if the list is not empty
		assertEquals(false, emptyChecker);

	}

	@Test
	public void testRemoveInterfaceECC5(){

		//DoubleF1, DoubleT2

		//tracker for null and empty list check
		boolean nullChecker= false;
		boolean emptyChecker= false;

		//clearing the list and then appending value to the list
		L3.clear();
		L3.append(1);

		//if there is an item in the list and we want to check
		//if we remove the item then the list if null or not.
		if(L3.remove()==null){
			nullChecker=true;
		}
		//if it returns false then the list is not null
		assertEquals(false, nullChecker);

		//adding 2 in the list for checking list empty
		//upon removing the item.
		L3.append(2);
		assertEquals("< | 2 >", L3.toString());
		assertEquals(2, (int)L3.remove());

		//using if statment to check the length and the print
		//statement of the list to determine if the list is empty or not.
		if(L3.toString().equals("< | >") && L3.length()==0){
			emptyChecker=true;
		}
		//expected print of the list
		assertEquals("< | >", L3.toString());
		//statement to check if the list is empty or not
		assertEquals(true, emptyChecker);
	}

	@Test
	public void testRemoveInterfaceECC6(){

		//DoubleT1, DoubleF2

		//tracker for null and empty list check
		boolean nullChecker= false;
		boolean emptyChecker= false;

		//clearing the list and then appending value to the list
		L3.clear();
		//returns true if the list is null
		assertEquals(true, !nullChecker);

		L3.append(1);
		assertEquals("< | 1 >", L3.toString());

		//checks if the list is empty or not
		if(L3.toString().equals("< | >") && L3.length()==0){
			emptyChecker=true;
		}
		//returns false if the list is not empty
		assertEquals(false, emptyChecker);

	}

	@Test
	public void testRemoveFunctionalityECC1(){
	 	//(Le0, LT1, LT2)

		boolean lastElementRemoved=false;
		boolean firstElementRemoved=false;

		L1.clear();
		L1.append(1);
		L1.append(2);
		L1.append(3);
		//3 elements inside the list
		assertEquals("< | 1 2 3 >", L1.toString());

		//move to the last element in the list
		L1.moveToPos(L1.length()-1);
		assertEquals("< 1 2 | 3 >", L1.toString());

		//removing last element in the list
		assertEquals(3, (int)L1.remove());
		//checks if the last element is any longer 3 or not
		if(L1.toString().equals("< 1 2 | >")){
			lastElementRemoved=true;
		}
		//last element is removed as the last element was 3
		assertEquals(true, lastElementRemoved);
		//removing first element in the list which is 1
		L1.moveToStart();
		assertEquals(1,L1.remove());
		//checks if the first element is 1 any longer or not and returns true if not, hence first element is removed
		if(L1.toString().equals("< | 2 >")){
			firstElementRemoved=true;
		}
		//the first element is removed
		assertEquals(true, firstElementRemoved);

		L1.remove();
		//checks if there are 0 elements in the list and upon trying to remove 0 elements the length of
		//the list remains 0 hence the test passed.
		assertEquals("< | >",L1.toString());
		assertEquals(0,L1.length());
		assertEquals(null,L1.remove());
		assertEquals(0,L1.length());

	}



	@Test
	public void testRemoveFunctionalityECC2(){
		//(Ae0, AT1, AT2)

		boolean lastElementRemoved=false;
		boolean firstElementRemoved=false;

		L2.clear();
		L2.append(1);
		L2.append(2);
		L2.append(3);
		//3 elements inside the list
		assertEquals("< | 1 2 3 >", L2.toString());

		//move to the last element in the list
		L2.moveToPos(L2.length()-1);
		assertEquals("< 1 2 | 3 >", L2.toString());

		//removing last element in the list
		assertEquals(3, (int)L2.remove());
		//checks if the last element is any longer 3 or not
		if(L2.toString().equals("< 1 2 | >")){
			lastElementRemoved=true;
		}
		//last element is removed as the last element was 3
		assertEquals(true, lastElementRemoved);
		//removing first element in the list which is 1
		L2.moveToStart();
		assertEquals(1,L2.remove());
		//checks if the first element is 1 any longer or not and returns true if not, hence first element is removed
		if(L2.toString().equals("< | 2 >")){
			firstElementRemoved=true;
		}
		//the first element is removed
		assertEquals(true, firstElementRemoved);

		L2.remove();
		//checks if there are 0 elements in the list and upon trying to remove 0 elements the length of
		//the list remains 0 hence the test passed.
		assertEquals("< | >",L2.toString());
		assertEquals(0,L2.length());
		assertEquals(null,L2.remove());
		assertEquals(0,L2.length());

	}

	@Test
	public void testRemoveFunctionalityECC3(){
		//(De0, DT1, DT2)

		boolean lastElementRemoved=false;
		boolean firstElementRemoved=false;

		L3.clear();
		L3.append(1);
		L3.append(2);
		L3.append(3);
		//3 elements inside the list
		assertEquals("< | 1 2 3 >", L3.toString());

		//move to the last element in the list
		L3.moveToPos(L3.length()-1);
		assertEquals("< 1 2 | 3 >", L3.toString());

		//removing last element in the list
		assertEquals(3, (int)L3.remove());
		//checks if the last element is any longer 3 or not
		if(L3.toString().equals("< 1 2 | >")){
			lastElementRemoved=true;
		}
		//last element is removed as the last element was 3
		assertEquals(true, lastElementRemoved);
		//removing first element in the list which is 1
		L3.moveToStart();
		assertEquals(1,L3.remove());
		//checks if the first element is 1 any longer or not and returns true if not, hence first element is removed
		if(L3.toString().equals("< | 2 >")){
			firstElementRemoved=true;
		}
		//the first element is removed
		assertEquals(true, firstElementRemoved);

		L3.remove();
		//checks if there are 0 elements in the list and upon trying to remove 0 elements the length of
		//the list remains 0 hence the test passed.
		assertEquals("< | >",L3.toString());
		assertEquals(0,L3.length());
		assertEquals(null,L3.remove());
		assertEquals(0,L3.length());

	}

	@Test
	public void testRemoveFunctionalityECC4(){

		boolean lastElementRemoved=false;
		boolean firstElementRemoved=false;

	 	//(Le1, LF1, LF2)
		L1.clear();
		L1.append(1);
		//Test for removing 1 element from the list and checking it.
		assertEquals("< | 1 >",L1.toString());
		assertEquals(1,L1.length());
		assertEquals(1,L1.remove());
		assertEquals(0,L1.length());
		assertEquals("< | >",L1.toString());

		//Test for returning false upon when the first element from the list is not removed
		L1.append(1);
		L1.append(2);
		L1.append(3);
		L1.append(4);
		L1.next();
		assertEquals("< 1 | 2 3 4 >",L1.toString());
		assertEquals(2,L1.remove());
		if(L1.toString().equals("< | 2 3 4 >")){
			firstElementRemoved=true;
		}
		assertEquals(false, firstElementRemoved);

		//Test for returning false when the last element from the list is not removed
		assertEquals(3, L1.remove());
		if(L1.toString().equals("< 1 | 3 >")){
			lastElementRemoved=true;
		}
		assertEquals(false, lastElementRemoved);
	}

	@Test
	public void testRemoveFunctionalityECC5(){

		boolean lastElementRemoved=false;
		boolean firstElementRemoved=false;

		//(Ae1, AF1, AF2)
		L2.clear();
		L2.append(1);
		//Test for removing 1 element from the list and checking it.
		assertEquals("< | 1 >",L2.toString());
		assertEquals(1,L2.length());
		assertEquals(1,L2.remove());
		assertEquals(0,L2.length());
		assertEquals("< | >",L2.toString());

		//Test for returning false upon when the first element from the list is not removed
		L2.append(1);
		L2.append(2);
		L2.append(3);
		L2.append(4);
		L2.next();
		assertEquals("< 1 | 2 3 4 >",L2.toString());
		assertEquals(2,L2.remove());
		if(L2.toString().equals("< | 2 3 4 >")){
			firstElementRemoved=true;
		}
		assertEquals(false, firstElementRemoved);

		//Test for returning false when the last element from the list is not removed
		assertEquals(3, L2.remove());
		if(L2.toString().equals("< 1 | 3 >")){
			lastElementRemoved=true;
		}
		assertEquals(false, lastElementRemoved);
	}

	@Test
	public void testRemoveFunctionalityECC6(){

		boolean lastElementRemoved=false;
		boolean firstElementRemoved=false;

		//(De1, DF1, DF2)
		L3.clear();
		L3.append(1);
		//Test for removing 1 element from the list and checking it.
		assertEquals("< | 1 >",L3.toString());
		assertEquals(1,L3.length());
		assertEquals(1,L3.remove());
		assertEquals(0,L3.length());
		assertEquals("< | >",L3.toString());

		//Test for returning false upon when the first element from the list is not removed
		L3.append(1);
		L3.append(2);
		L3.append(3);
		L3.append(4);
		L3.next();
		assertEquals("< 1 | 2 3 4 >",L3.toString());
		assertEquals(2,L3.remove());
		if(L3.toString().equals("< | 2 3 4 >")){
			firstElementRemoved=true;
		}
		assertEquals(false, firstElementRemoved);

		//Test for returning false when the last element from the list is not removed
		assertEquals(3, L3.remove());
		if(L3.toString().equals("< 1 | 3 >")){
			lastElementRemoved=true;
		}
		assertEquals(false, lastElementRemoved);
	}

	@Test
	public void testRemoveFunctionalityECC7(){
		//(Le2, LT1, LF2)
		boolean lastElementRemoved=false;
		boolean firstElementRemoved=false;

		L1.clear();
		L1.append(1);
		L1.append(2);
		L1.append(3);
		L1.append(4);
		L1.append(5);
		L1.append(6);

		//Test for removing first element in the list
		assertEquals("< | 1 2 3 4 5 6 >",L1.toString());
		assertEquals(1,L1.remove());
		if(L1.toString().equals("< | 2 3 4 5 6 >")){
			firstElementRemoved=true;
		}
		assertEquals("< | 2 3 4 5 6 >", L1.toString());
		assertEquals(true, firstElementRemoved);

		//Test for removing last element from the list
		L1.remove();
		if(L1.toString().equals("< | 2 3 4 5 >")){
			lastElementRemoved=true;
		}
		assertEquals(false, lastElementRemoved);

		//Test for removing more than one element from the list
		assertEquals("< | 3 4 5 6 >", L1.toString());
		assertEquals(3, L1.remove());
		assertEquals(4,L1.remove());
		assertEquals("< | 5 6 >",L1.toString());

	}


	@Test
	public void testRemoveFunctionalityECC8(){
		//(Ae2, AT1, AF2)
		boolean lastElementRemoved=false;
		boolean firstElementRemoved=false;

		L2.clear();
		L2.append(1);
		L2.append(2);
		L2.append(3);
		L2.append(4);
		L2.append(5);
		L2.append(6);

		//Test for removing first element in the list
		assertEquals("< | 1 2 3 4 5 6 >",L2.toString());
		assertEquals(1,L2.remove());
		if(L2.toString().equals("< | 2 3 4 5 6 >")){
			firstElementRemoved=true;
		}
		assertEquals("< | 2 3 4 5 6 >", L2.toString());
		assertEquals(true, firstElementRemoved);

		//Test for removing last element from the list
		L2.remove();
		if(L2.toString().equals("< | 2 3 4 5 >")){
			lastElementRemoved=true;
		}
		assertEquals(false, lastElementRemoved);

		//Test for removing more than one element from the list
		assertEquals("< | 3 4 5 6 >", L2.toString());
		assertEquals(3, L2.remove());
		assertEquals(4,L2.remove());
		assertEquals("< | 5 6 >",L2.toString());

	}

	@Test
	public void testRemoveFunctionalityECC9(){
		//(De2, DT1, DF2)
		boolean lastElementRemoved=false;
		boolean firstElementRemoved=false;

		L3.clear();
		L3.append(1);
		L3.append(2);
		L3.append(3);
		L3.append(4);
		L3.append(5);
		L3.append(6);

		//Test for removing first element in the list
		assertEquals("< | 1 2 3 4 5 6 >",L3.toString());
		assertEquals(1,L3.remove());
		if(L3.toString().equals("< | 2 3 4 5 6 >")){
			firstElementRemoved=true;
		}
		assertEquals("< | 2 3 4 5 6 >", L3.toString());
		assertEquals(true, firstElementRemoved);

		//Test for removing last element from the list
		L3.remove();
		if(L3.toString().equals("< | 2 3 4 5 >")){
			lastElementRemoved=true;
		}
		assertEquals(false, lastElementRemoved);

		//Test for removing more than one element from the list
		assertEquals("< | 3 4 5 6 >", L3.toString());
		assertEquals(3, L3.remove());
		assertEquals(4,L3.remove());
		assertEquals("< | 5 6 >",L3.toString());

	}

	@Test
	public void testRemoveFunctionalityBCCLinkChoice(){
	 	//(Le0, LT1, LT2)
		boolean firstElementRemoved=false;
		boolean lastElementRemoved=false;
		L1.append(1);
		L1.remove();
		//checks if there are 0 elements in the list and upon trying to remove 0 elements the length of
		//the list remains 0 hence the test passed.
		assertEquals("< | >",L1.toString());
		assertEquals(0,L1.length());
		assertEquals(null,L1.remove());
		assertEquals(0,L1.length());

		//test to return true of the first element is removed
		L1.append(1);
		L1.append(2);
		L1.append(3);
		L1.append(4);
		assertEquals(1,L1.remove());
		//hence it is proved that the first element is removed
		if(L1.toString().equals("< | 2 3 4 >")){
			firstElementRemoved=true;
		}
		assertEquals(true, firstElementRemoved);

		//test to remove last element in the list
		L1.moveToPos(L1.length()-1);
		assertEquals(4, L1.remove());
		if(L1.toString().equals("< 2 3 | >")){
			lastElementRemoved=true;
		}
		assertEquals(true, lastElementRemoved);
	}

	@Test
	public void testRemoveFunctionalityBCCArrayChoice(){
		//(Ae0, AT1, AT2)
		boolean firstElementRemoved=false;
		boolean lastElementRemoved=false;
		L2.append(1);
		L2.remove();
		//checks if there are 0 elements in the list and upon trying to remove 0 elements the length of
		//the list remains 0 hence the test passed.
		assertEquals("< | >",L2.toString());
		assertEquals(0,L2.length());
		assertEquals(null,L2.remove());
		assertEquals(0,L2.length());

		//test to return true of the first element is removed
		L2.append(1);
		L2.append(2);
		L2.append(3);
		L2.append(4);
		assertEquals(1,L2.remove());
		//hence it is proved that the first element is removed
		if(L2.toString().equals("< | 2 3 4 >")){
			firstElementRemoved=true;
		}
		assertEquals(true, firstElementRemoved);

		//test to remove last element in the list
		L2.moveToPos(L2.length()-1);
		assertEquals(4, L2.remove());
		if(L2.toString().equals("< 2 3 | >")){
			lastElementRemoved=true;
		}
		assertEquals(true, lastElementRemoved);
	}

	@Test
	public void testRemoveFunctionalityBCCDoubleChoice(){
		//(De0, DT1, DT2)
		boolean firstElementRemoved=false;
		boolean lastElementRemoved=false;
		L3.append(1);
		L3.remove();
		//checks if there are 0 elements in the list and upon trying to remove 0 elements the length of
		//the list remains 0 hence the test passed.
		assertEquals("< | >",L3.toString());
		assertEquals(0,L3.length());
		assertEquals(null,L3.remove());
		assertEquals(0,L3.length());

		//test to return true of the first element is removed
		L3.append(1);
		L3.append(2);
		L3.append(3);
		L3.append(4);
		assertEquals(1,L3.remove());
		//hence it is proved that the first element is removed
		if(L3.toString().equals("< | 2 3 4 >")){
			firstElementRemoved=true;
		}
		assertEquals(true, firstElementRemoved);

		//test to remove last element in the list
		L3.moveToPos(L3.length()-1);
		assertEquals(4, L3.remove());
		if(L3.toString().equals("< 2 3 | >")){
			lastElementRemoved=true;
		}
		assertEquals(true, lastElementRemoved);
	}

	@Test
	public void testRemoveFunctionalityBCC1(){
	 	boolean firstElementRemoved=false;
	 	boolean lastElementRemoved=false;
	 	//(Le0, LT1, LF2)

		//test to remove 0 elements in the list
		L1.clear();
		assertEquals(null,L1.remove());
		assertEquals(0,L1.length());

		//test to remove first element from the list
		L1.append(1);
		L1.append(2);
		L1.append(3);
		if(L1.remove()==1){
			firstElementRemoved=true;
		}
		assertEquals(true, firstElementRemoved);

		//test to remove last element from the list
		if(L1.remove()==3){
			lastElementRemoved=true;
		}
		assertEquals(false, lastElementRemoved);
	}

	@Test
	public void testRemoveFunctionalityBCC2(){
	 	boolean firstElementRemoved=false;
	 	boolean lastElementRemoved=false;
	 	//(Le1, LT1, LT2)

		//test to remove 1 item from the list and remove the first element from the list
		L1.clear();
		L1.append(1);
		L1.append(2);
		L1.append(3);
		if(L1.remove()==1){
			firstElementRemoved=true;
		}
		assertEquals("< | 2 3 >",L1.toString());
		assertEquals(true, firstElementRemoved);

		//test to remove last element in the list
		L1.moveToPos(L1.length()-1);
		if(L1.remove()==3){
			lastElementRemoved=true;
		}
		assertEquals("< 2 | >",L1.toString());
		assertEquals(true, lastElementRemoved);
	}

	@Test
	public void testRemoveFunctionalityBCC3(){
	 	boolean firsElementRemoved=false;
	 	boolean lastElementRemoved=false;
	 	//(Le0, LF1, LT2)
		//test to remove 0 elements from the list
		L1.clear();
		assertEquals(null,L1.remove());

		//test to remove first element from the list
		L1.append(1);
		L1.append(2);
		L1.append(3);
		L1.append(4);
		L1.next();
		if(L1.remove()==1){
			firsElementRemoved=true;
		}
		assertEquals(false,firsElementRemoved);
		assertEquals("< 1 | 3 4 >",L1.toString());

		//test to remove last element in the list
		L1.moveToPos(L1.length()-1);
		if(L1.remove()==4){
			lastElementRemoved=true;
		}
		assertEquals(true, lastElementRemoved);
	}

	@Test
	public void testRemoveFunctionalityBBC4(){
		boolean firstElementRemoved=false;
		boolean lastElementRemoved=false;

		//(Le2, LT1, LT2)
		L1.clear();

		//test to remove element from the first and last and remove more than 1 element from the list
		L1.append(1);
		L1.append(2);
		L1.append(3);

		if(L1.remove()==1){
			firstElementRemoved=true;
		}
		assertEquals(true,firstElementRemoved);
		L1.moveToPos(L1.length()-1);
		if(L1.remove()==3){
			lastElementRemoved=true;
		}
		assertEquals(true, lastElementRemoved);

		//hence more than one element is removed from the list
	}

	@Test
	public void testRemoveFunctionalityBCC5(){
		boolean firstElementRemoved=false;
		boolean lastElementRemoved=false;
		//(Ae0, AT1, AF2)

		//test to remove 0 elements in the list
		L2.clear();
		assertEquals(null,L2.remove());
		assertEquals(0,L2.length());

		//test to remove first element from the list
		L2.append(1);
		L2.append(2);
		L2.append(3);
		if(L2.remove()==1){
			firstElementRemoved=true;
		}
		assertEquals(true, firstElementRemoved);

		//test to remove last element from the list
		if(L2.remove()==3){
			lastElementRemoved=true;
		}
		assertEquals(false, lastElementRemoved);
	}

	@Test
	public void testRemoveFunctionalityBCC6(){
		boolean firstElementRemoved=false;
		boolean lastElementRemoved=false;
		//(Ae1, AT1, AT2)

		//test to remove 1 item from the list and remove the first element from the list
		L2.clear();
		L2.append(1);
		L2.append(2);
		L2.append(3);
		if(L2.remove()==1){
			firstElementRemoved=true;
		}
		assertEquals("< | 2 3 >",L2.toString());
		assertEquals(true, firstElementRemoved);

		//test to remove last element in the list
		L2.moveToPos(L2.length()-1);
		if(L2.remove()==3){
			lastElementRemoved=true;
		}
		assertEquals("< 2 | >",L2.toString());
		assertEquals(true, lastElementRemoved);
	}

	@Test
	public void testRemoveFunctionalityBCC7(){
		boolean firsElementRemoved=false;
		boolean lastElementRemoved=false;
		//(Ae0, AF1, AT2)
		//test to remove 0 elements from the list
		L2.clear();
		assertEquals(null,L2.remove());

		//test to remove first element from the list
		L2.append(1);
		L2.append(2);
		L2.append(3);
		L2.append(4);
		L2.next();
		if(L2.remove()==1){
			firsElementRemoved=true;
		}
		assertEquals(false,firsElementRemoved);
		assertEquals("< 1 | 3 4 >",L2.toString());

		//test to remove last element in the list
		L2.moveToPos(L2.length()-1);
		if(L2.remove()==4){
			lastElementRemoved=true;
		}
		assertEquals(true, lastElementRemoved);
	}

	@Test
	public void testRemoveFunctionalityBBC8(){
	 	boolean firstElementRemoved=false;
	 	boolean lastElementRemoved=false;

		//(Ae2, AT1, AT2)
		L2.clear();

		//test to remove element from the first and last and remove more than 1 element from the list
		L2.append(1);
		L2.append(2);
		L2.append(3);

		if(L2.remove()==1){
			firstElementRemoved=true;
		}
		assertEquals(true,firstElementRemoved);
		L2.moveToPos(L2.length()-1);
		if(L2.remove()==3){
			lastElementRemoved=true;
		}
		assertEquals(true, lastElementRemoved);

		//hence more than one element is removed from the list
	}

	@Test
	public void testRemoveFunctionalityBCC9(){
		boolean firstElementRemoved=false;
		boolean lastElementRemoved=false;
		//(De0, DT1, DF2)

		//test to remove 0 elements in the list
		L3.clear();
		assertEquals(null,L3.remove());
		assertEquals(0,L3.length());

		//test to remove first element from the list
		L3.append(1);
		L3.append(2);
		L3.append(3);
		if(L3.remove().equals(1)){
			firstElementRemoved=true;
		}
		assertEquals(true, firstElementRemoved);

		//test to remove last element from the list
		if(L3.remove().equals(3)){
			lastElementRemoved=true;
		}
		assertEquals(false, lastElementRemoved);

	}

	@Test
	public void testRemoveFunctionalityBCC10(){
		boolean firstElementRemoved=false;
		boolean lastElementRemoved=false;
		//(Le1, LT1, LT2)

		//test to remove 1 item from the list and remove the first element from the list
		L3.clear();
		L3.append(1);
		L3.append(2);
		L3.append(3);
		if(L3.remove().equals(1)){
			firstElementRemoved=true;
		}
		assertEquals("< | 2 3 >",L3.toString());
		assertEquals(true, firstElementRemoved);

		//test to remove last element in the list
		L3.moveToPos(L3.length()-1);
		if(L3.remove().equals(3)){
			lastElementRemoved=true;
		}
		assertEquals("< 2 | >",L3.toString());
		assertEquals(true, lastElementRemoved);
	}

	@Test
	public void testRemoveFunctionalityBCC11(){
		boolean firsElementRemoved=false;
		boolean lastElementRemoved=false;
		//(De0, DF1, DT2)
		//test to remove 0 elements from the list
		L3.clear();
		assertEquals(null,L3.remove());

		//test to remove first element from the list
		L3.append(1);
		L3.append(2);
		L3.append(3);
		L3.append(4);
		L3.next();
		if(L3.remove().equals(1)){
			firsElementRemoved=true;
		}
		assertEquals(false,firsElementRemoved);
		assertEquals("< 1 | 3 4 >",L3.toString());

		//test to remove last element in the list
		L3.moveToPos(L3.length()-1);
		if(L3.remove().equals(4)){
			lastElementRemoved=true;
		}
		assertEquals(true, lastElementRemoved);
	}

	@Test
	public void testRemoveFunctionalityBBC12(){
		boolean firstElementRemoved=false;
		boolean lastElementRemoved=false;

		//(De2, DT1, DT2)
		L3.clear();

		//test to remove element from the first and last and remove more than 1 element from the list
		L3.append(1);
		L3.append(2);
		L3.append(3);

		if(L3.remove().equals(1)){
			firstElementRemoved=true;
		}
		assertEquals(true,firstElementRemoved);
		L3.moveToPos(L3.length()-1);
		if(L3.remove().equals(3)){
			lastElementRemoved=true;
		}
		assertEquals(true, lastElementRemoved);

		//hence more than one element is removed from the list
	}

	@Test
	public void testRemoveCharacteristicsBCCLinkedListChoice(){
	 	//(LinkT1, LinkT2)

		boolean listEmpty=false;
		boolean listNull=false;

		//list is empty test
		L1.clear();
		L1.append(1);
		L1.remove();
		if(L1.toString().equals("< | >")){
			listEmpty=true;
		}
		assertEquals(true,listEmpty);

		//test for null
		if(L1.remove()==null){
			listNull=true;
		}
		assertEquals(true,listNull);
	}

	@Test
	public void testRemoveCharacteristicsBCCArrayListChoice(){
		//(ArrayT1, ArrayT2)

		boolean listEmpty=false;
		boolean listNull=false;

		//list is empty test
		L2.clear();
		L2.append(1);
		L2.remove();
		if(L2.toString().equals("< | >")){
			listEmpty=true;
		}
		assertEquals(true,listEmpty);

		//test for null
		if(L2.remove()==null){
			listNull=true;
		}
		assertEquals(true,listNull);
	}

	@Test
	public void testRemoveCharacteristicsBCCDoubleListChoice(){
		//(DoubleT1, DoubleT2)

		boolean listEmpty=false;
		boolean listNull=false;

		//list is empty test
		L3.clear();
		L3.append(1);
		L3.remove();
		if(L3.toString().equals("< | >")){
			listEmpty=true;
		}
		assertEquals(true,listEmpty);

		//test for null
		if(L3.remove()==null){
			listNull=true;
		}
		assertEquals(true,listNull);
	}

	@Test
	public void testRemoveCharacteristicsBCC1(){
	 	//(LinkT1, LinkF2)
		boolean emptyList=false;
		boolean nullList=false;

		L1.clear();
		//null list check
		if(L1.remove()==null){
			nullList=true;
		}
		assertEquals(true,nullList);

		//empty list check
		L1.append(1);
		if(L1.length()==0){
			emptyList=true;
		}
		assertEquals(1,L1.length());
		assertEquals(false, emptyList);
	}

	@Test
	public void testRemoveCharacteristicsBCC2(){
	 	boolean emptyCheck=false;
	 	boolean nullCheck=false;

	 	//(LinkF1, LinkT2)

		//list is null test
	 	L1.clear();
		L1.append(1);
		L1.append(2);
		if(L1.remove()==null){
			nullCheck=true;
		}
		assertEquals(false, nullCheck);

		//list is empty
		L1.remove();
		if(L1.toString().equals("< | >")){
			emptyCheck=true;
		}
		assertEquals(true, emptyCheck);

	}

	@Test
	public void testRemoveCharacteristicsBCC3(){
		//(ArrayT1, ArrayF2)
		boolean emptyList=false;
		boolean nullList=false;

		L2.clear();
		//null list check
		if(L2.remove()==null){
			nullList=true;
		}
		assertEquals(true,nullList);

		//empty list check
		L2.append(1);
		if(L2.length()==0){
			emptyList=true;
		}
		assertEquals(1,L2.length());
		assertEquals(false, emptyList);
	}

	@Test
	public void testRemoveCharacteristicsBCC4(){
		boolean emptyCheck=false;
		boolean nullCheck=false;

		//(ArrayF1, ArrayT2)

		//list is null test
		L2.clear();
		L2.append(1);
		L2.append(2);
		if(L2.remove()==null){
			nullCheck=true;
		}
		assertEquals(false, nullCheck);

		//list is empty
		L2.remove();
		if(L2.toString().equals("< | >")){
			emptyCheck=true;
		}
		assertEquals(true, emptyCheck);

	}

	@Test
	public void testRemoveCharacteristicsBCC5(){
		//(DoubleT1, DoubleF2)
		boolean emptyList=false;
		boolean nullList=false;

		L3.clear();
		//null list check
		if(L3.remove()==null){
			nullList=true;
		}
		assertEquals(true,nullList);

		//empty list check
		L3.append(1);
		if(L3.length()==0){
			emptyList=true;
		}
		assertEquals(1,L3.length());
		assertEquals(false, emptyList);
	}

	@Test
	public void testRemoveCharacteristicsBCC6(){
		boolean emptyCheck=false;
		boolean nullCheck=false;

		//(DoubleF1, DoubleT2)

		//list is null test
		L3.clear();
		L3.append(1);
		L3.append(2);
		if(L3.remove()==null){
			nullCheck=true;
		}
		assertEquals(false, nullCheck);

		//list is empty
		L3.remove();
		if(L3.toString().equals("< | >")){
			emptyCheck=true;
		}
		assertEquals(true, emptyCheck);

	}





	@Test
	  public void testRemove()
	  {
	  	//test for null and empty for the Array list

//		  boolean emptyCheck= false;
//		  boolean nullCheck=false;
//
//		  L2.clear();
//		  L2.append(1);
//
//
//		  L2.remove();
//
//		  if(L2.toString().equals("< | >")){
//		  	emptyCheck = true;
//		  }
//		  if(L2.remove()==null){
//		  	nullCheck=true;
//		  }

//		  assertEquals(true , emptyCheck );
//		  assertEquals(true , nullCheck );

		L2.clear();
		  L2.append(1);
	    assertEquals("< | 1 >", L2.toString());
	    assertEquals(1, (int)L2.remove());
	    assertEquals("< | >", L2.toString());
	    assertEquals(null, L2.remove());


	    //test for null and empty for the  Linked-List
		  L1.clear();
		  L1.append(2);
		  assertEquals("< | 2 >", L1.toString());
		  assertEquals(2, (int)L1.remove());
		  assertEquals("< | >", L1.toString());
		  assertEquals(null, L1.remove());

		  //test for null and empty for the Double-Linked-List
		  L3.clear();
		  L3.append(4);
		  assertEquals("< | 4 >", L3.toString());
		  assertEquals(4, (int)L3.remove());
		  assertEquals("< | >", L3.toString());
		  assertEquals(null, L3.remove());

	  }

	  @Test
	  public void testRemoveForFunctionality(){

	 		//Testing for Array List

	 	  //removing 1 element from the list and removing element from the front of the list
		  L2.clear();
		  L2.append(1);
		  assertEquals("< | 1 >", L2.toString());
		  assertEquals(1, (int)L2.remove());

		  //remove 2 elements from the list
		  L2.append(1);
		  L2.append(2);
		  assertEquals("< | 1 2 >", L2.toString());
		  assertEquals(1, (int)L2.remove());
		  assertEquals(2, (int)L2.remove());

		  //remove 0 elements from the list
		  assertEquals("< | >", L2.toString());
		  assertEquals(null, L2.remove());


		  //Testing for Double-Linked list

		  //removing 1 element from the list and removing element from the front of the list
		  L3.clear();
		  L3.append(1);
		  assertEquals("< | 1 >", L3.toString());
		  assertEquals(1, (int)L3.remove());

		  //remove 2 elements from the list
		  L3.append(1);
		  L3.append(2);
		  assertEquals("< | 1 2 >", L3.toString());
		  assertEquals(1, (int)L3.remove());
		  assertEquals(2, (int)L3.remove());

		  //remove 0 elements from the list
		  assertEquals("< | >", L3.toString());
		  assertEquals(null, L3.remove());



		  //Testing for Linked list

		  //removing 1 element from the list and removing element from the front of the list
		  L1.clear();
		  L1.append(1);
		  assertEquals("< | 1 >", L1.toString());
		  assertEquals(1, (int)L1.remove());

		  //remove 2 elements from the list
		  L1.append(1);
		  L1.append(2);
		  assertEquals("< | 1 2 >", L1.toString());
		  assertEquals(1, (int)L1.remove());
		  assertEquals(2, (int)L1.remove());


		  //remove 0 elements from the list
		  assertEquals("< | >", L1.toString());
		  assertEquals(null, L1.remove());


	  }







	 
	 @Test
	  public void testAppend()
	  {
		L2.clear(); 
		L2.append(10);
	    assertEquals("< | 10 >", L2.toString());
	    L2.append(20);
	    L2.append(15);
	    assertEquals("< | 10 20 15 >", L2.toString());
	  }

	 @Test
	  public void testFind()
	  {
	    L1.moveToStart();
	    L1.insert(39);
	    L1.next();
	    L1.insert(9);
	    L1.insert(5);
	    L1.append(4);
	    L1.append(3);
	    L1.append(2);
	    L1.append(1);
	    assertEquals("< 39 | 5 9 1 4 3 2 1 >", L1.toString());
	    assertEquals(8, L1.length());

	    assertEquals(true, find(L1, 3));
	    assertEquals(false, find(L1, 29));
	    assertEquals(true, find(L1, 5));
	    L1.clear();
	  }

	 @Test
	  public void testListOfObjects()
	  {
	    assertEquals("< | 1 >", L3.toString());
	    L3.insert(3);
	    assertEquals("< | 3 1 >", L3.toString());
	    L3.insert("Hello");
	    assertEquals("< | Hello 3 1 >", L3.toString());
	  }

	 @Test
	  public void testNext() {
	    L2.append(10);
	    L2.append(20);
	    L2.append(15);
	    L2.moveToStart();
	    L2.next();
	    assertEquals(20, (int)L2.getValue());
	  }

	 @Test
	  public void testMore() {
	    L2.clear();
	    L2.moveToStart();
	    L2.insert(1);
	    L2.insert(2);
	    L2.moveToPos(2);
	    L2.insert(3);
	    L2.clear();
	    assertEquals("< | >", L2.toString());
	  }

}
