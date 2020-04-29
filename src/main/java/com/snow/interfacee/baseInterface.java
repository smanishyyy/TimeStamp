package com.snow.interfacee;

import org.openqa.selenium.WebDriver;

public interface baseInterface {
	public void SelectAlldataDrpDownById(WebDriver driver, String day);

	public boolean cfunVerifyCharWise(WebDriver driver, String inpstr, String disclaimerXpath);

	public void cusToVerifyTextp(WebDriver driver, String xpath, String disclaimer,String text);

	public String IsEleExist(boolean flag);
	public void sleepmode(int sleepInSecond);
	public void ClickifObjExistt(boolean flag, WebDriver driver, String RequestServLinkXpath);
	public void captureScreenMethod(WebDriver driver, String DirPath, String TestcaseNumber) ;
}
