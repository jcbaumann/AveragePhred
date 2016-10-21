/*
 * @author Jonathan Baumann
 * @version 0.0.1
 * 
 * description: This program calculates the numeric average Phred score of a sequence with a given PHRED string in ASCII  representation.
 * 
 * test data:
 * quality: AAAAAAAAAAAA::99@::::??@::FFAAAAACCAA::::BB@@?A?
 * len: 48
 */

import java.io.*;

public class AveragePhred {

	public static void main(String[] args) throws IOException {
		
		// quality string and length
		String quality;
		int length = 0;
		
		// BufferedReader to read the input of the command line 
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

		// print some informations about this tool
		System.out.println("The program takes as input the quality string in the PHRED format and the length of the input.");
		
		// read the quality string
		System.out.println("Quality string:");
		quality = buffer.readLine();
		
		// read the lenght
		System.out.println("length:");
		length = Integer.parseInt(buffer.readLine());
		
		// call the compute_average_phred function
		System.out.println("Average Phred score: " + compute_average_phred(quality, length));
	}
	
	public static int compute_average_phred(String quality, int len) {
		
		int sum = 0;
		
		for(int i = 0; i < quality.length(); i++) {
			sum += (int)quality.charAt(i) - 33;
		}
		
		return sum / len;
	}
}
