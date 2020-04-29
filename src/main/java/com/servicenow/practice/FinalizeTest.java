package com.servicenow.practice;

import java.io.IOException;

public class FinalizeTest {
	int j=12;  
    void add()  
    {  
        j=j+12;  
        System.out.println("J="+j);  
    }  
    public void finalize()  
    {  
        System.out.println("Object is garbage collected");  
    }  
    public static void main(String[] args) {  
    	  
        new FinalizeTest().add();  
        System.gc();  
        new FinalizeTest().add();  
//        System.gc();  
        new FinalizeTest().add();  
        try {
			Runtime.getRuntime().exec("notepad");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }  
}
