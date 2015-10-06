package com.epam.jdi_tests.page_objects.pages;

import org.openqa.selenium.support.FindBy;

import com.ggasoftware.jdi_ui_tests.implementation.selenium.elements.composite.Page;
import com.ggasoftware.jdi_ui_tests.implementation.selenium.elements.interfaces.common.IButton;
import com.ggasoftware.jdi_ui_tests.implementation.selenium.elements.interfaces.common.IImage;
import com.ggasoftware.jdi_ui_tests.implementation.selenium.elements.interfaces.common.ITextArea;
import com.ggasoftware.jdi_ui_tests.implementation.selenium.elements.interfaces.common.ITextField;

/**
 * Created by Maksim_Palchevskii on 8/17/2015.
 */
public class ContactForm extends Page {

    @FindBy(id = "Name")
    public ITextField name;
    @FindBy(id = "LastName")
    public ITextField lastName;
    @FindBy(id = "Description")
    public ITextArea description;
    @FindBy(xpath = "/html/body/div/div/main/div[2]/div/form/div[3]/div[2]/button")
    public IButton contactSubmit;
    @FindBy(xpath = "/html/body/div/header/div/nav/div[2]/img")
	public IImage logoImage;
}
