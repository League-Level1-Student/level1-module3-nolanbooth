package _01_intro_to_static;

public class Static_Introthing {
	public class Athlete {
	    static int nextBibNumber;
	    static String raceLocation = "New York";
	    static String raceStartTime = "9.00am";

	    String name;
	    int speed;
	    int bibNumber;

	    Athlete (String name, int speed){
	        this.name = name;
	        this.speed = speed;
	    }

	    public static void main(String[] args) {
	       Athlete superthingy = new Athlete("bill" , 3);
	    Athlete superthingy2 = new Athlete("BILL",5);
	   System.out.println(superthingy.name);
	    }
	}
}

