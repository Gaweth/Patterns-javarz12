package edu.grcy.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList implements Cloneable{
	private List<String> shopping;

	//konstruktor do dobiektu wzorcowego
	public ShoppingList(){
		shopping = new ArrayList<>();
		loadInitialData();
	}

	//konstruktor do otrzymywania kopii
	public ShoppingList(List<String> list){
		this.shopping =list;
	}

	public void loadInitialData(){
		shopping.add("ser");
		shopping.add("pomidory");
		shopping.add("chleb");
	}

	public void setShopping(List<String> shopping) {
		this.shopping = shopping;
	}

	public List<String> getShopping() {
		return shopping;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
		List<String> localList = new ArrayList<>();

		//lokalna kopia listy domyslnej
		// zeby uniknac sytuacji w trakcie robieania
		//clona lista zostanie zmieniona
		localList.addAll(shopping);
		return new ShoppingList(localList);
	}
}

