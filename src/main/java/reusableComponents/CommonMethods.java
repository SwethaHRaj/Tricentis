package reusableComponents;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testBase.ObjectsRepo;

public class CommonMethods extends ObjectsRepo{
	
	//Getting list of String from list of WebElements
	public List<String> getListOfDropDown(WebElement dropDown) {
		Select s=new Select(dropDown);
		List<WebElement> allOptions = s.getOptions();
		List<String> dropDownList=new ArrayList<String>();
		for(WebElement we:allOptions)
			dropDownList.add(we.getText());
		return dropDownList;			
	}
	
	//Select option from Dropdown
	public void selectOption(WebElement dropDown, String option) {
		Select s=new Select(dropDown);
		s.selectByValue(option);
	}
	
	//Select checkboxes
	public void selectCheckBoxes(List<WebElement> wes,String hobbies) {
		String[] arrayHobbies = hobbies.split(",");
		for(WebElement we:wes) {
			for(String hobby:arrayHobbies) {
				if(we.getText().equalsIgnoreCase(hobby)) {
					we.click();
					break;
				}
			}
		}
	}
	
	//Select Radiobutton
	
	
}
