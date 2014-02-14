package sef.module9.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//1 - Type code to create a list of names. Use ArrayList.
		List<String> nome = new ArrayList<>();
		nome.add("Rafael");
		nome.add("Ze");
		nome.add("Bruno");
		nome.add("Manoel");
		
		
		//2 - Call print method to print the list passed as its parameter.
		print(nome);
	}
	
	static void print(List list)
	{
		//3 - Type code to print this list
		//Notice the order in which elements get printed.	
		for(int i= 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}
}
