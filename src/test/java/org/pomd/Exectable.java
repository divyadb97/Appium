package org.pomd;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Exectable extends BaseClass{
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=launch();
	
	LoginPojo l=new LoginPojo();
	url(" http://www.greenstechnologys.com/");
	big();
	navi("http://greenstech.in/selenium-course-content.html");
	Thread.sleep(2000);
	
	down(l.getDwn());
	Print(l.getDwn());
	naviback();
	up(l.getUp());
	Print(l.getUp());
	click(l.getCerti());
	click(l.getCoursecont());
	Thread.sleep(2000);
	Print(l.getPara());
	Thread.sleep(2000);
	naviback();
	Thread.sleep(1000);
	Print(l.getSele());
	Thread.sleep(1000);
	mouse(l.getCourse());
	mouse(l.getJavatrain());
	mouse(l.getCorejava());
	click(l.getCorejava());
	
	Thread.sleep(2000);
	down(l.getAnitha());
	Print(l.getAnitha());
	
	up(l.getCareer());
	
	click(l.getCareer());
	Thread.sleep(1000);
	
	down(l.getEmail());
	
	Print(l.getEmail());
	
	up(l.getTest());
	click(l.getTest());
Thread.sleep(2000);

down(l.getPhno());
Print(l.getPhno());
Thread.sleep(1000);

navi("http://greenstech.in/selenium-course-content.html");

Thread.sleep(2000);
click(l.getTst());

down(l.getThank());
Print(l.getThank());

Thread.sleep(1000);
up(l.getCont());

click(l.getCont());

navi("http://greenstech.in/careers.html");
Thread.sleep(2000);

down(l.getCopy());

Print(l.getCopy());

	
	



}}
