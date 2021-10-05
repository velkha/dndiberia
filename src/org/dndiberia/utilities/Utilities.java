package org.dndiberia.utilities;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.dndiberia.models.ReturnApiJsonObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class Utilities {
	private static final int[] DAYS_OF_MONTH=new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public Map<String, Object> jsonToMapKV(String jsonStr) {
		Gson gson = new Gson();
		Type strObjgMap=new TypeToken<Map<String, Object>>(){}.getType();
		Map<String, Object>map=gson.fromJson(jsonStr, strObjgMap);
		return map;
	}
	public String toJson(Object object) {
		Gson gson = new GsonBuilder().create();
		return gson.toJson(object);
	}
	public String generateErrorData(String errorCode) {
		ReturnApiJsonObject rbo = new ReturnApiJsonObject(1);
		rbo.addData(errorCode);
		return toJson(rbo);
	}
	public String generateTestConnString() {
		return "test";
	}
	public String dateCheck(String date){
		String[] str = date.split("-");
		int year = Integer.valueOf(str[0]);
		int month = Integer.valueOf(str[1]);
		int day = Integer.valueOf(str[2]);
		if(month<1) month = 1;
		if(month>12) month = 12;
		if(DAYS_OF_MONTH[month-1]<day) day=DAYS_OF_MONTH[month-1];
		if(day<1) day=1;
		if(month==2&&checkIfBisiesto(year)) 
			if(day>29) 
				day=29;
		return year+"-"+month+"-"+day;
	}
	
	private boolean checkIfBisiesto(int year) {
		return year%4==0&&year%100==0&&year%400==0;
	}
	
	public String getActualDate() {
		
		String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		return date;
	}
}
