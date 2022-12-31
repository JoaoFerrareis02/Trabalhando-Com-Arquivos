package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program3 {

	public static void main(String[] args) {
		
		//Otimizando o progama usando o bloco try - with - resources

		String path = "C:\\Programacao\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
