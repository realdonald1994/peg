package Peg;
/**
 * @author Zhongxu Huang
 * @ID 40052560
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Moves {
	private static Map<Position,List<Move>> validMoves = new HashMap<Position,List<Move>>();
	
	static {
		Position start;
		
		start = new Position(0,0);	
		validMoves.put(start, new ArrayList<Move>());	
		validMoves.get(start).add(new Move(start, new Position(1,0), new Position(2,0)));
		validMoves.get(start).add(new Move(start, new Position(1,1), new Position(2,2)));
		
		start = new Position(1,0);
		validMoves.put(start, new ArrayList<Move>());	
		validMoves.get(start).add(new Move(start, new Position(2,0), new Position(3,0)));
		validMoves.get(start).add(new Move(start, new Position(2,1), new Position(3,2)));
		
		start = new Position(1,1);
		validMoves.put(start, new ArrayList<Move>());	
		validMoves.get(start).add(new Move(start, new Position(2,1), new Position(3,1)));
		validMoves.get(start).add(new Move(start, new Position(2,2), new Position(3,3)));	
		
		start = new Position(2,0);
		validMoves.put(start, new ArrayList<Move>());	
		validMoves.get(start).add(new Move(start, new Position(1,0), new Position(0,0)));
		validMoves.get(start).add(new Move(start, new Position(2,1), new Position(2,2)));
		validMoves.get(start).add(new Move(start, new Position(3,0), new Position(4,0)));
		validMoves.get(start).add(new Move(start, new Position(3,1), new Position(4,2)));
	
		start = new Position(2,1);
		validMoves.put(start, new ArrayList<Move>());	
		validMoves.get(start).add(new Move(start, new Position(3,1), new Position(4,1)));
		validMoves.get(start).add(new Move(start, new Position(3,2), new Position(4,3)));
		
		start = new Position(2,2);
		validMoves.put(start, new ArrayList<Move>());	
		validMoves.get(start).add(new Move(start, new Position(1,1), new Position(0,0)));
		validMoves.get(start).add(new Move(start, new Position(2,1), new Position(2,0)));
		validMoves.get(start).add(new Move(start, new Position(3,2), new Position(4,2)));
		validMoves.get(start).add(new Move(start, new Position(3,3), new Position(4,4)));	
	
		start = new Position(3,0);
		validMoves.put(start, new ArrayList<Move>());	
		validMoves.get(start).add(new Move(start, new Position(2,0), new Position(1,0)));
		validMoves.get(start).add(new Move(start, new Position(3,1), new Position(3,2)));	

		start = new Position(3,1);
		validMoves.put(start, new ArrayList<Move>());	
		validMoves.get(start).add(new Move(start, new Position(2,1), new Position(1,1)));
		validMoves.get(start).add(new Move(start, new Position(3,2), new Position(3,3)));

		start = new Position(3,2);
		validMoves.put(start, new ArrayList<Move>());	
		validMoves.get(start).add(new Move(start, new Position(2,1), new Position(1,0)));
		validMoves.get(start).add(new Move(start, new Position(3,1), new Position(3,0)));	
		
		start = new Position(3,3);
		validMoves.put(start, new ArrayList<Move>());	
		validMoves.get(start).add(new Move(start, new Position(2,2), new Position(1,1)));
		validMoves.get(start).add(new Move(start, new Position(3,2), new Position(3,1)));	
	
		start = new Position(4,0);
		validMoves.put(start, new ArrayList<Move>());	
		validMoves.get(start).add(new Move(start, new Position(3,0), new Position(2,0)));
		validMoves.get(start).add(new Move(start, new Position(4,1), new Position(4,2)));	

		start = new Position(4,1);
		validMoves.put(start, new ArrayList<Move>());	
		validMoves.get(start).add(new Move(start, new Position(3,1), new Position(2,1)));
		validMoves.get(start).add(new Move(start, new Position(4,2), new Position(4,3)));	
		
		start = new Position(4,2);
		validMoves.put(start, new ArrayList<Move>());	
		validMoves.get(start).add(new Move(start, new Position(3,1), new Position(2,0)));
		validMoves.get(start).add(new Move(start, new Position(3,2), new Position(2,2)));
		validMoves.get(start).add(new Move(start, new Position(4,1), new Position(4,0)));
		validMoves.get(start).add(new Move(start, new Position(4,3), new Position(4,4)));
		
		start = new Position(4,3);
		validMoves.put(start, new ArrayList<Move>());	
		validMoves.get(start).add(new Move(start, new Position(3,2), new Position(2,1)));
		validMoves.get(start).add(new Move(start, new Position(4,2), new Position(4,1)));

		start = new Position(4,4);
		validMoves.put(start, new ArrayList<Move>());	
		validMoves.get(start).add(new Move(start, new Position(3,3), new Position(2,2)));
		validMoves.get(start).add(new Move(start, new Position(4,3), new Position(4,2)));	
	}

	
	public static List<Move> getMoves(Position position) {
		if (!validMoves.containsKey(position))
			throw new RuntimeException("Invalid position: " + position);
		
		return validMoves.get(position);
	}

	
	public String toString() {
		return validMoves.toString();
	}
}
