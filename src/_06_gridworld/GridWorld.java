package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
public static void main(String[]args) {
	World world = new World();
	world.show();
	Bug bug1 = new Bug(Color.GREEN);
	Bug bug = new Bug(Color.RED);	
Location location = new Location(1, 5);
world.add(location, bug);
Random rand = new Random();
int row = rand.nextInt(10);
int column = rand.nextInt(10);
Location location1 = new Location(row, column);
world.add(location1, bug1);
bug1.turn();
bug1.turn();
Flower flower = new Flower(Color.black);
Location locationflower = new Location(row, column-1);
world.add(locationflower, flower);
Location flowerlocation = new Location(row, column+1);
Flower flower2 = new Flower(Color.RED);
world.add(flowerlocation, flower2);
for (int i = 0; i < 10; i++) {
	
	for (int j = 0; j < 10; j++) {
		Location location2 =  new Location(j,i);
		Flower flower3 = new Flower();
		
		world.add(location2, flower3);	
	}
	
}


}	
}
