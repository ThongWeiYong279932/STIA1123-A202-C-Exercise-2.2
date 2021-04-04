
public class Main {

	public static void main(String[] args) {
		Animals Goat = new Animals();	//Create new object Goat
		double [] foodweight = {0.5, 0.7, 0.6};
		Goat.foodweight = foodweight;
		Goat.printAnimals("Goat","Mammals","Herbivore","Warm-blooded",16.5);
		Goat.layeggs(false);
		Goat.getfoodweightperday(Goat.foodweight);
		Goat.Behaviour();
		
		System.out.println();
		
		Animals Crocodile = new Animals();	//Create new object Crocodile
		double [] foodweight2 = {3.5, 5.5, 4.0};
		Crocodile.foodweight = foodweight2;
		Crocodile.printAnimals("Crocodile","Reptiles","Carnivore","Cold-blooded",35);
		Crocodile.layeggs(true);
		Crocodile.getfoodweightperday(Crocodile.foodweight);
		Crocodile.Behaviour();

	}

}
