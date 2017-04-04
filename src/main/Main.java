package main;

import java.util.ArrayList;

import animals.Animal;
import animals.Human;
import animals.Mouse;
import animals.TRex;

/**
 * Main
 * <p>
 * The main method, provides an example of the behaviors implemented via the Strategy Pattern
 * built in the associated classes.
 * 
 * To learn more about the Strategy Pattern see the following:
 * 
 * <a href = "http://java-design-patterns.com/patterns/strategy/">An explanation of the Strategy Pattern</a> by <a href = "https://github.com/markusmo3">Markus Moser.</a>
 * 
 * <a href = "https://github.com/iluwatar/java-design-patterns/tree/master/strategy">Associated example code</a> for the above site, also provided by <a href = "https://github.com/markusmo3">Markus Moser.</a> 
 * 
 * A <a href = "https://www.youtube.com/watch?v=v9ejT8FO-7I">YoutTube video</a> by <a href = "http://christopherokhravi.se/" >Christopher Okhravi</a> I found extremely helpful.
 * 
 * @author William Lake
 *
 */
public class Main
{
	
	/**
	 * Main Method
	 * <p>
	 * Creates three animals, one for each type provided in the animals package,
	 * and displays the eating and walking behavior for each.
	 * 
	 * @see Mouse
	 * @see Human
	 * @see TRex
	 * 
	 * @param args
	 * 			Command Line arguments, not used here.
	 */
	public static void main(String[] args)
	{
		ArrayList<Animal> animals = new ArrayList<>();
		
		animals.add(new Mouse());
		animals.add(new Human());
		animals.add(new TRex());
		
		for (Animal animal : animals)
		{
			System.out.println(animal.getClass().getSimpleName());
			System.out.println();
			System.out.println("Walking Behavior:");
			animal.walk();
			System.out.println();
			System.out.println("Eating Behavior:");
			animal.eat();
			System.out.println();
		}
	}

}
