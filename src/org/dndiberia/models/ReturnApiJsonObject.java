package org.dndiberia.models;

import java.util.ArrayList;
import java.util.List;

public class ReturnApiJsonObject {
	@SuppressWarnings("unused")
	private int id;
	private List<String> data;
	public ReturnApiJsonObject(int id) {
		super();
		this.id = id;
		this.data = new ArrayList<String>();
	}
	public void addData(String dato) {
		data.add(dato);
	}
}
