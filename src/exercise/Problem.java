package exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class Problem {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		String strPath = "C:\\Programacao";
		@SuppressWarnings("unused")
		boolean pi = new File(strPath + "\\out").mkdir();

		try (BufferedReader br = new BufferedReader(new FileReader(strPath + "\\in.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter(strPath + "\\out\\summary.txt"))) {

			String line = br.readLine();
			while (line != null) {
				String[] parts = line.split(",");
				double total = Double.parseDouble(parts[1]) * Integer.parseInt(parts[2]);
				bw.write(parts[0] + "," + String.format("%.2f", total));
				bw.newLine();
				line = br.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
