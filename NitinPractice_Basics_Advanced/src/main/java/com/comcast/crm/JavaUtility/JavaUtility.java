package com.comcast.crm.JavaUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
public int getRandomNum() {
	Random ran=new Random();
	int ranInt=ran.nextInt(3000);
	return ranInt;
}

public String getSystemDateYYYYMMDD() {
	Date DObj=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-DD");
	String date=sdf.format(DObj);
	return date;
	
}

public String getSystemReqDateYYYYMMDD(int days) {
	Date dObj=new Date();
	Calendar cal=Calendar.getInstance();
	cal.setTime(dObj);
    cal.add(Calendar.DAY_OF_MONTH,30);
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-DD");
    String endDate=sdf.format(cal.getTime());
	return endDate;
}
}