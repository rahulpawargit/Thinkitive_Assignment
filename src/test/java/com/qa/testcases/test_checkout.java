package com.qa.testcases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.Checkout_process;
import com.qa.pages.Addtocart;
import com.qa.pages.signup;

public class test_checkout extends TestBase{
	
	Checkout_process ch_process;
	
	Addtocart addtocart;
	public test_checkout()
	{
		super();
	}
	
	@BeforeMethod()
	public void  TestSetup()
	{
		initialization();
		ch_process = new Checkout_process();
	}

//	@Test(priority=1)
//	public void LoginPageTeTitle()
//	{
//		String Title= ch_process.ValidateTitle();
//		Assert.assertEquals(Title, "Amazon.in: Online Shopping India - Buy mobiles, laptops, cameras, books, watches, apparel, shoes and e-Gift Cards. Free Shipping & Cash on Delivery Available.");
//	}
	
	@Test(priority=1)
	public void Logo_ImageTest()
	{
		Boolean tr= ch_process.imagelogo();
		Assert.assertTrue(tr);
	}
	
	@Test(priority=2)
	public void searchItem() throws InterruptedException, IOException
	{
		addtocart= ch_process.browse(prop.getProperty("searchitem"));
	}
		
	
	@AfterMethod()
	public void teardown()
	{
		driver.close();
	}
}
