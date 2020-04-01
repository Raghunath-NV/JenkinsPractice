package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	WebDriver driver;

	@FindBy(xpath = "//*[@id='input-firstname']")
	WebElement FirstName;

	@FindBy(xpath = "//*[@id='input-lastname']")
	WebElement LastName;

	@FindBy(xpath = "//*[@id='input-email']")
	WebElement Email;

	@FindBy(xpath = "//*[@id='input-telephone']")
	WebElement Telephone;

	@FindBy(xpath = "//*[@id='input-password']")
	WebElement Password;
	
	@FindBy(xpath = "//*[@id='input-confirm']")
	WebElement ConfirmPassword;

	@FindBy(xpath = "//*[@id='content']/form/fieldset[3]/div/div/label[1]/input")
	WebElement RadioBtnYes;

	@FindBy(xpath = "//*[@id='content']/form/fieldset[3]/div/div/label[2]/input")
	WebElement RadioBtnNo;

	@FindBy(xpath = "//*[@id='content']/form/div/div/input[1]")
	WebElement AgreeCheckBox;

	@FindBy(xpath = "//*[@id='content']/form/div/div/input[2]")
	WebElement ContinueBtn;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setPassword(String password) {
		Password.sendKeys(password);
	}
	
	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword.sendKeys(confirmPassword);
	}

	public void setFirstName(String firstName) {
		FirstName.sendKeys(firstName);
	}

	public void setLastName(String lastName) {
		LastName.sendKeys(lastName);
	}

	public void setEmail(String email) {
		Email.sendKeys(email);
	}

	public void setTelephone(String telephone) {
		Telephone.sendKeys(telephone);
	}

	public void setRadioBtn(boolean radioBtn) {
		if (radioBtn)
			RadioBtnYes.click();
		else
			RadioBtnNo.click();
	}

	public void setAgreeCheckBox() {
		AgreeCheckBox.click();
	}

	public void clickContinueBtn() {
		ContinueBtn.click();
	}

}
