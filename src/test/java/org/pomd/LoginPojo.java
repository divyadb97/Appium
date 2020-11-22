package org.pomd;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	
	public LoginPojo()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getDwn() {
		return dwn;
	}


	@FindBy(xpath="//h2[text()='Greens Technologys Overall Reviews']")
	private WebElement dwn;
	
	
	@FindBy(xpath="//h1[text()='No 1 Software Training Institutes in Chennai with Placements']")
	private WebElement Up;


	public WebElement getUp() {
		return Up;
	}
	
	
	@FindBy(xpath="//a[text()='Certifications']")
     private WebElement certi;


	public WebElement getCerti() {
		return certi;
	}	
 public WebElement getCoursecont() {
		return coursecont;
	}


@FindBy(xpath="(//a[text()='Course Content'])[29]")
 private  WebElement	coursecont;

@FindBy(xpath="//p[contains(text(),'HI, I have taken Selenium trai')]")
private WebElement para;


public WebElement getPara() {
	return para;
}

@FindBy(xpath="(//h1[text()='SELENIUM'])[1]")
private WebElement sele;


public WebElement getSele() {
	return sele;
}
@FindBy(xpath="//a[text()='COURSES']")
private WebElement course;

public WebElement getCourse() {
	return course;
}


public WebElement getJavatrain() {
	return javatrain;
}


public WebElement getCorejava() {
	return corejava;
}


@FindBy(xpath="//span[text()='Java Training ']")
private WebElement javatrain;

@FindBy(xpath="//span[text()='Core Java Training']")
private WebElement corejava;
	
@FindBy(xpath="//h2[text()='Java training Reviews from Anitha']")
private WebElement anitha;


public WebElement getAnitha() {
	return anitha;
}	

@FindBy(xpath="//a[text()='CAREERS']")
private WebElement career;


public WebElement getCareer() {
	return career;
}	

@FindBy(xpath="//a[text()='contact@greenstechnologys.com']")
private WebElement email;


public WebElement getEmail() {
	return email;
}	

@FindBy(xpath="//a[text()='TESTIMONIALS']")
private WebElement test;


public WebElement getTest() {
	return test;
}

public WebElement getPhno() {
	return phno;
}


@FindBy(xpath="(//li[text()='+91 8939 915 577 /'])[1]")
private WebElement phno;

@FindBy(xpath="//a[text()='TESTIMONIALS']")
private WebElement tst;


public WebElement getTst() {
	return tst;
}
@FindBy(xpath="//p[contains(text(),' Hi My name is Madhulatha .I am very happy ')]")
private WebElement thank;


public WebElement getThank() {
	return thank;}

	
	@FindBy(xpath="//a[text()='CONTACT US']")
	private WebElement cont;


	public WebElement getCont() {
		return cont;
	}
	@FindBy(xpath="//div[text()='Copyright © 2013 greenstech.in. All Rights Reserved.']")
     private WebElement copy;


	public WebElement getCopy() {
		return copy;
	}
	
}

