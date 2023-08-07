package com.orangehrm.pages;

import static com.orangehrm.enums.LeftMenuComponentType.*;
import com.orangehrm.pagecomponents.LeftMenuComponent;

public class HomePage {
	
	private final LeftMenuComponent leftMenuComponent;
	
	public HomePage() {
		this.leftMenuComponent= new LeftMenuComponent();
	}

	public LeftMenuComponent getLeftMenuComponent() {
		return leftMenuComponent;
	}

	public AddAminPage navigateToAddAdminPage(){
		this.leftMenuComponent.selectAMenuFromLeftMenuBar(ADMIN);
		return new AddAminPage();
	}
	public AddEmployeePage navigateToAddEmployeePage() {
	    this.leftMenuComponent.selectAMenuFromLeftMenuBar(PIM);
	    return new AddEmployeePage();
	  }
}
