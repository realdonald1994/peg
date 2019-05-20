package Peg;
/**
 * @author Zhongxu Huang
 * @ID 40052560
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PegBoard {

/**
* @param args
*/
	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		int num;
		File file = new File("./src/input.txt");
		FileInputStream fs = new FileInputStream(file);
		InputStreamReader ir = new InputStreamReader(fs);
		BufferedReader br = new BufferedReader(ir);
		String line;
		ArrayList<Integer> hole = new ArrayList<>();
		while ((line = br.readLine()) != null) {
			num = Integer.parseInt(line);
			hole.add(num);
		}
		br.close();
		for (int i : hole) {
			System.out.println("The " + i + "th point is hole");
			wirte("./src/output.txt", "\n"+"The " + i + " point is hole");
			startprocess(i);
		
	
		Play play = new Play();
		play.DFS();
		long endTime = System.currentTimeMillis();
		long cost = endTime - startTime;
		System.out.println("Time cost: " + cost +"ms.");
		wirte("./src/output.txt", "\n"+ "Time cost: " + cost +"ms.");
		}
	}
	public  static void wirte(String filename,String content) throws IOException {
		FileWriter writer = new FileWriter(filename, true);  
		   writer.write(content);   
           writer.close();   
	}
	private static void startprocess(int i) {
		int n1 = 0, n2 = 0;
		if (i == 1) {
			Play.n1 = 0;
			Play.n2 = 0;
			
		} else if (i == 2) {
			Play.n1 = 1;
			Play.n2 = 0;
			
		} else if (i == 3) {
			Play.n1 = 1;
			Play.n2 = 1;
			
		} else if (i == 4) {
			Play.n1 = 2;
			Play.n2 = 0;
			
		} else if (i == 5) {
			Play.n1 = 2;
			Play.n2 = 1;
			
		} else if (i == 6) {
			Play.n1 = 2;
			Play.n2 = 2;
			
		} else if (i == 7) {
			Play.n1 = 3;
			Play.n2 = 0;
		} else if (i == 8) {
			Play.n1 = 3;
			Play.n2 = 1;
		} else if (i == 9) {
			Play.n1 = 3;
			Play.n2 = 2;
		} else if (i == 10) {
			Play.n1 = 3;
			Play.n2 = 3;
		} else if (i == 11) {
			Play.n1 = 4;
			Play.n2 = 0;
		} else if (i == 12) {
			Play.n1 = 4;
			Play.n2 = 1;
		}
		else if (i == 13) {
			Play.n1 = 4;
			Play.n2 = 2;
		}
		else if (i == 14) {
			Play.n1 = 4;
			Play.n2 = 3;
		}
		else if (i == 15) {
			Play.n1 = 4;
			Play.n2 = 4;
		}

		
	}
	
}