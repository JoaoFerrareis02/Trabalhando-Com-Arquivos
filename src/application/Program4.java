package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program4 {

	public static void main(String[] args) {
		
		//Usando o FileWritter e BufferedWritter


		String[] lines = new String[] { "Good morning", "Good afternoom", "Good night" };

		String path = "C:\\Programacao\\out.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
