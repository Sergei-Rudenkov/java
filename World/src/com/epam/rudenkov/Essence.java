package com.epam.rudenkov;

public class Essence {
	int health = 100;
	int age = 0;

	void toDie(){
		this.health = 0;
	}
	Essence toKill(Essence x){
		x.health = 0;
		return null;
	
	}

	void toBreath(){
	
	}
	
	Essence toHaveSex(Essence a){
		if (a.getClass() == this.getClass()){
			Essence newEs = new Essence();
			return newEs;
		}
		return null;
	}

	public static void main(String[] args){
		Essence es = new Essence();
		es.toDie();
		System.out.println(es.health);
	}
}
