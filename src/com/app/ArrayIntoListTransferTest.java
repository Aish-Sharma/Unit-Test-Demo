package com.app;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayIntoListTransferTest {
	Integer[] input=null;
	List<Integer> expectedOutput=null;
	ArrayIntoListTransfer alt=null;
	
	@Before
	public void startup()
	{
		input=new Integer[] {12,15,0,1,2,12,3};
		expectedOutput =new ArrayList<>();
		for (Integer i:input)
		{
		expectedOutput.add(i);	
		}
		alt=new ArrayIntoListTransfer();
	}
	@Test
	public void transferTest()
	{
		Assert.assertEquals(expectedOutput,alt.transfer(input));
		System.out.println(expectedOutput);
	}
	
	

}
