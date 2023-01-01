package exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Problem {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter a source path: ");
		File sourcePath = new File(sc.nextLine());
		
		boolean success = new File(sourcePath.getParent()+"\\out").mkdir();
		String targetPath = sourcePath.getParent()+"\\out\\summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourcePath));
				BufferedWriter bw = new BufferedWriter(new FileWriter(targetPath))){
			
			String line = br.readLine();
			
			while(line != null) {
				String[] values = line.split(",");
				String name = values[0];
				double price = Double.parseDouble(values[1]);
				int quantity = Integer.parseInt(values[2]);
				
				list.add(new Product(name,price,quantity));				
				
				line = br.readLine();
			}
			
			for(Product p : list) {
				bw.write(p.toString());
				bw.newLine();			
			}
			
		} catch (IOException e) {
			System.out.println("Error: "+e.getMessage());
		} finally {
			sc.close();
		}

	}

}
