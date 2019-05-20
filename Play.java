package Peg;

/**
 * @author Zhongxu Huang
 * @ID 40052560
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class Play {
	public static int n1,n2;
	GameBoard startBoard;
	int count = 0;
	
	public Play() throws IOException {
		init(n1,n2);
		
	}
	private void init(int row, int col) {
		startBoard = new GameBoard(row, col);
	}

	// DFS function
	public void DFS() throws IOException {
		GameTree root = new GameTree(startBoard);

		for (GameBoard nextBoard : startBoard.possibleBoards()) {
			GameTree nextNode = new GameTree(nextBoard);
			if (play(nextBoard, nextNode))
				root.addChild(nextNode);
		}

		printWinningGame(root, count);

	}

	private void printWinningGame(GameTree parent, int count) throws IOException {
		System.out.println("step " + count);
		System.out.println(parent.getGameBoard());
		wirte("./src/output.txt", "\n"+"step " + count + "\n" + parent.getGameBoard());

		if (parent.numChildren() > 0) {

			GameTree nextNode = parent.getFirstChild();
			count++;
			printWinningGame(nextNode, count); // recurse
			if (nextNode.numChildren() == 0)
				parent.removeFirstChild();
			count++;
		} else {

			System.out.println("end " + " the total step  is " + count);
			wirte("./src/output.txt", "end " + "\n" + "the total step  is " + count);

		}
	}

	private boolean play(GameBoard gb, GameTree parent) {

		if (gb.finalBoard()) 
			return true;

		List<GameBoard> nextBoards = gb.possibleBoards();

		boolean found = false;

		for (GameBoard nextBoard : nextBoards) {
			GameTree nextNode = new GameTree(nextBoard);
			if (play(nextBoard, nextNode)) { // recurse
				found = true;
				parent.addChild(nextNode);
			}
		}

		return found;
	}

	

	private void wirte(String filename, String content) throws IOException {
		FileWriter writer = new FileWriter(filename, true);
		writer.write(content);
		writer.close();
	}
}