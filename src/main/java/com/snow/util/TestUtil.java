package com.snow.util;

import java.util.ArrayList;

public class TestUtil {
public static long pag_load_timeout=20;
public static long implicit_wait=20;
//
//static Xls_Reader reader;
//
//public static ArrayList<Object[]> getDataFromExcel() {
//
//	ArrayList<Object[]> data = new ArrayList<>();
//	try {
//		reader = new Xls_Reader(
//				"D://Workspace//servicenowfeaturepom-master//src//main//java//com//snow//testdata//Testtdata.xlsx");
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//	for (int rowNum = 2; rowNum <= reader.getRowCount("Sheet1"); rowNum++) {
//		String username = reader.getCellData("Sheet1", "Username", rowNum);
//		String Password = reader.getCellData("Sheet1", "Password", rowNum);
//		Object obj[] = { username, Password };
//		data.add(obj);
//	}
//	return data;
//}
//
////@DataProvider
////public Iterator<Object[]> getTestData() {
////
////	ArrayList<Object[]> testData = TestUtil.getDataFromExcel();
////	return testData.iterator();
////
////}
////
////@Test(dataProvider = "getTestData")
////@And("^user enters username and password$")
////public void user_enters_username_and_password(String Username, String Password) {
////	hompage.set_Username(Username);
////	hompage.set_Password(Password);
////
////}
//
//
}
