import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PlantsZombies {

	private static final String FILENAME = "input.txt";

	// Initial variables
	static int 	T_plant, // Type of plant
				A_plant, // Attack number of plant
				HP_plant, // Health Point of plant
				T_zombie, // Type of zombie
				A_zombie, // Attack number of zombie
				HP_zombie; // Health Point of zombie
	static float pW = -2.0f; // Propability of winning

	public static void main(String[] args) {

		T_plant = A_plant = HP_plant = T_zombie = A_zombie = HP_zombie = -1;

		BufferedReader br = null;
		FileReader fr = null;

		try {

			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			String sCurrentLine;

			br = new BufferedReader(new FileReader(FILENAME));

			// while ((sCurrentLine = br.readLine()) != null) {
			// System.out.println(sCurrentLine);
			// }

			sCurrentLine = br.readLine();
			String tempData[] = sCurrentLine.split(" ");

			T_plant = Integer.parseInt(tempData[0]);
			A_plant = Integer.parseInt(tempData[1]);
			HP_plant = Integer.parseInt(tempData[2]);
			T_zombie = Integer.parseInt(tempData[3]);
			A_zombie = Integer.parseInt(tempData[4]);
			HP_zombie = Integer.parseInt(tempData[5]);

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
		
		/*
		 *=============================================================================
		 * End of danger section
		 *=============================================================================
		*/

		/*
		 *=============================================================================
		 * This is student's code section.
		 *=============================================================================
		*/


		// TO DO
		// DO SOMETHING HERE


		/*
		 *=============================================================================
		 * End of student's code section
		 *=============================================================================
		*/

		/*
		 *=============================================================================
		 * This is a danger section.
		 * The student must not change any thing in this.
		 *=============================================================================
		*/
	    // Display the result: p(W)
	    System.out.println( String.format("%.2f",pW));

		return;
	    /*
		 *=============================================================================
		 * End of danger section
		 *=============================================================================
		*/

	}

}
