import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/** (Demo)
 * Driver class that passes in the name of a csv file to Team to parse. 
 * The csv file is a list of heroes. The data are then displayed.

 * @author MoSho
 * @version 2019-01-31
 */
public class Driver_demo
{
	/**
	 * Main entry point for the program. Parse a file of heroes and add them
	 * to the Justice League
	 * 
	 * @param args Command line arguments (not used)
	 * @throws IOException Throw when there is an issue with the input file
	 */
	public static void main(String[] args) throws IOException 
	{
		// TODO: Create Hero team list
		ArrayList<Hero> JL = new ArrayList<Hero>();

		String filename = "Input.csv";
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String lineOfData = br.readLine();	// String containing a line of data from the file.

		// Print contents of the file
		System.out.println("Input file contents:");
		// TODO: Print the header row (first line is the header)
		System.out.println(" Line 01:: " + lineOfData);

		// Keep reading from the file while there is data
		lineOfData = br.readLine();
		System.out.printf(" Line %02d:: %s\n", 2, lineOfData);
		while(lineOfData != null)
		{
			// TODO: Break up the row to construct a Hero
			String[] heroInfo = lineOfData.split(",");
			// TODO: Construct a Hero from the data in the file 
			String name = heroInfo[0];
			float weight = Float.parseFloat(heroInfo[1]);
			int age = Integer.parseInt(heroInfo[2]);
			String city = heroInfo[3];
			Hero myHero = new Hero(name, weight, age, city);
			// TODO: Add them to the team
			JL.add(myHero);
	}
	

		// TODO: Get the next line of the file
		lineOfData = br.readLine();
		// Make sure to close the Reader once done parsing the file
		br.close();

		// TODO: Find all the heroes that defend Gotham
		String listOfGDefenders = "Gotham's defenders:\n";
		for (int i = 0; i < JL.size(); i++)
		{
			Hero currHero = JL.get(i);
			String currCity = currHero.getCity();
			boolean isGothamDefender = currCity.equalsIgnoreCase("Gotham");
			if (isGothamDefender) listOfGDefenders += currHero;
		}
		
		// TODO: Write their information to a file named GothamDefenders.txt
		BufferedWriter bw = new BufferedWriter(new FileWriter("GothamDefenders.txt"));
		bw.write(listOfGDefenders);
		bw.close(); // close the file


		// TODO: Find the heaviest hero on the team
		// TODO: Write their information to a file (or just print to console) 
		// Make sure to initialize the max to -INFINITY
		double maxWeight = Double.NEGATIVE_INFINITY;
		Hero BigDaddy = null;
		for (Hero currHero : JL)
		{
			// TODO: Update BigDaddy if needed
			if (currHero.getWeight() > maxWeight)
			{
				BigDaddy = currHero;
				maxWeight = BigDaddy.getWeight();
		}
		System.out.println("\nBiggest Hero\n" + BigDaddy);		
	}
}
}