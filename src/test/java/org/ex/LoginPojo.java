package org.ex;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{
	
	public LoginPojo()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="email")
	public WebElement Email;
	
	public WebElement getTxtemail() {
		return txtemail;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnlgn() {
		return btnlgn;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLgn() {
		return lgn;
	}

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getNumroom() {
		return numroom;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	@FindBy(id="email")
	private WebElement txtemail;
	
	
	@FindBy(id="pass")
	private WebElement txtpass;
	
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement btnlgn;

	

	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(id="login")
	private WebElement lgn;



	@FindBy(id="location")
	private WebElement loc;
     
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement type;
	
	@FindBy(id="room_nos")
	private WebElement numroom;
	
	@FindBy(id="datepick_in")
	private WebElement checkin;
	
	@FindBy(id="datepick_out")
	private WebElement checkout;
	
	@FindBy(id="adult_room")
	private WebElement adult;
	
	@FindBy(id="child_room")
	private WebElement child;
	
	public WebElement getSearch() {
		return search;
	}

	@FindBy(id="Submit")
	private WebElement search;
	
	
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	
	public WebElement getRadio() {
		return radio;
	}

	public WebElement getSearch2() {
		return search2;
	}

	@FindBy(id="continue")
	private WebElement search2;
	
	public WebElement getName1() {
		return name1;
	}

	public WebElement getName2() {
		return name2;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCrenum() {
		return crenum;
	}

	public WebElement getCretype() {
		return cretype;
	}

	public WebElement getExmon() {
		return exmon;
	}

	public WebElement getExmyr() {
		return exmyr;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public WebElement getBook() {
		return book;
	}

	@FindBy(id="first_name")
	private WebElement name1;
	
	@FindBy(id="last_name")
	private WebElement name2;
	
	@FindBy(id="address")
	private WebElement  address;
	
	@FindBy(id="cc_num")
	private WebElement crenum;
	
	@FindBy(id="cc_type")
	private WebElement cretype;
	
	@FindBy(id="cc_exp_month")
	private WebElement exmon;
	@FindBy(id="cc_exp_year")
	private WebElement exmyr;
	@FindBy(id="cc_cvv")
	private WebElement ccv;	
	
	@FindBy(id="book_now")
	private WebElement book;
	
	public WebElement getOrder() {
		return order;
	}

	@FindBy(xpath="//input[@name='order_no']")
	private WebElement order;
	

}
