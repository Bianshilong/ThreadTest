package com.bsl.thread.test2.session9;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class MyOneList {
	private List list = new ArrayList();
	public synchronized void add(String data) {
		list.add(data);
	}
	public synchronized int getSize() {
		return list.size();
	}
}
