package com.snow.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Mainmethod {
	public static void main(String args[]) {
		List<HashMap<String, String>> dataSet;
		
		
	try {
		dataSet = DataHelper.readExcelDatafromFile(
				"C://Users//chaurma//eclipse-workspace//SnowNowPageObjectFramework//TestData//Testdata.xlsx", "Sheet1");

		@SuppressWarnings("rawtypes")
		Iterator itr = dataSet.iterator();

		while (itr.hasNext()) {
		System.out.println("rrr : " + "\n" + itr.next());
		}
		} catch (Exception e) {
		e.printStackTrace();
		}


}
}
