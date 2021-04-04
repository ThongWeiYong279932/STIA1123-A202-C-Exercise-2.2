
public class Animals {
	String name;
	String type;
	String Dietary;
	String Thermoregulation;
	double averagelifespan;
	boolean layeggs;
	double [] foodweight;
	void printAnimals(String name, String type, String Dietary, String Thermoregulation, double averagelifespan) {
		System.out.println("Animal: " + name + "\n" + "Type: " + type + "\n" + "Dietary: " + Dietary + "\n" 
							+ "Thermoregulation: " + Thermoregulation + "\n" + "Average lifespan(in years): " + averagelifespan);
	}
	
	void layeggs (boolean layeggs) {
		if (layeggs == true) {
			System.out.println("The animal reproduce by laying eggs");
		}
		else {
			System.out.println("The animal reproduce by giving birth to child");
		}
	}
	
	void getfoodweightperday(double [] foodweight) {
		double totalweight=0, averageweight;
		int count = 0;
		for (int i=0; i<foodweight.length;i++) {
			totalweight += foodweight[i];
			count++;
		}
		averageweight = totalweight/count;
		System.out.printf("The total weight of food consumed per day = %.2fkg %n",totalweight);
		System.out.printf("The average weight of food consumed per meal = %.2fkg %n",averageweight);
	}
	
	
	void Behaviour(){
		String Behaviour = ("1.Walk \n" + "2.Eat \n" + "3.Breath \n" + "4.Excrete waste");
		System.out.println("Bahavior : \n" + Behaviour);
	}
}
