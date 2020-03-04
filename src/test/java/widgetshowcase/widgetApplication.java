package widgetshowcase;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.selectsObjects;
import resources.base;

public class widgetApplication extends base {

	@Test
	public void selectTab() throws IOException {
		driver = initializeDriver();
		selectsObjects sobj = new selectsObjects(driver);
		sobj.selecttabLink().click();
		String pageheadertext = sobj.pageHeader().getText();
		//verifying Page Header is “Select Widgets”
		Assert.assertEquals("Select Widgets", pageheadertext);
		sobj.arrayTextbox().click();
		sobj.bazOption().click();
		String selectedoption = sobj.arrayTextbox().getText();
		//verifying selected value is updated in the simple array text box
		Assert.assertEquals("baz",selectedoption);
		tearDown();
	}
}
