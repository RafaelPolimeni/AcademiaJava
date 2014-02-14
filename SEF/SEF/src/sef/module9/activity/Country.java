package sef.module9.activity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Country implements Comparable {
	
	String name;
	int population;
	String continent;
	
	public String getName(){
		return name;
	}
	public int getPopulation() {
		return population;
	}
	
	public void setPopulation(int population) {
		this.population = population;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	
	public Country(String nome, int population, String continent){
		this.name = nome;
		this.population = population;
		this.continent = continent;
	}

	
	

	public static void main(String[] Args){
		
		List<Country> paises = new ArrayList<>();
		paises.add(new Country("Brasil", 200000, "America"));
		paises.add(new Country("Italia", 87000, "Europe"));
		paises.add(new Country("Alemanha",86000, "Europe"));
		paises.add(new Country("Japao", 1500000, "Asia"));
		paises.add(new Country ("Marrocos", 460000, "Africa"));
		paises.add(new Country("Argentina", 80000, "America"));
		
		Collections.sort(paises);
		
		for (Object  obj : paises) {
			Country country = (Country) obj;
			System.out.println(country.getName()); 
		}
		
	}
	

	@Override
	public int compareTo(Object obj) {
		Country country = (Country) obj;
		
		int retorno;
		
		if(this.continent == country.continent){
			if(this.population == country.population){
				retorno = 0;
			} else if(this.population > country.population){
				retorno = 1;
			} else{
				retorno = -1;
			}
		} else if(this.continent.compareTo(country.continent) > 0){
			retorno = 1;
		} else{
			retorno = -1;
		}
			return retorno;


	}
}