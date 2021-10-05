 package org.dndiberia.models;

public class DatoMensual {
	int year;
	int month;
	String dataToSend;
	public DatoMensual(int year, int month) {
		super();
		this.year = year;
		this.month = month;
	}
	public void setDataToSend(String dataToSend) {
		this.dataToSend = dataToSend;
	}
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public String getDataToSend() {
		return dataToSend;
	}
	
}
