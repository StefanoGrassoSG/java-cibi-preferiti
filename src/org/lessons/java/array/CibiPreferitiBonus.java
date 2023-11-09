package org.lessons.java.array;

public class CibiPreferitiBonus {
	
	public static void main(String[] args) {
			
		String[] myBestFoods = {"pizza", "ravioli", "lasagne", "carbonara", "prosciutto", "melone", "formaggio", "verdure", "pollo", "patatine"};
		
		String firstFood = myBestFoods[0];
		String lastFood = myBestFoods[myBestFoods.length - 1];
		int index = myBestFoods.length / 2;
		String food = myBestFoods[index];
		String food2 = myBestFoods[index - 1];
		
		System.out.println("la quantità dei miei cibi preferiti è: " + myBestFoods.length);
		System.out.println("il primo è : " + firstFood);
		System.out.println("l'ultimo è : " + lastFood);
		System.out.println("gli elementi in mezzo sono : " + food + " e " + food2);
		}
}
