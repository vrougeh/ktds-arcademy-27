package com.ktdsuniversity.edu.datetime.mart;

import java.time.LocalDate;

public class StoreTest {
	
	public static void main(String[] args) {
		Store store = new Store();
		store.add(new Item("test",LocalDate.parse("2026-02-08") ));
		
		store.sell(20260208);
		
	}

}
