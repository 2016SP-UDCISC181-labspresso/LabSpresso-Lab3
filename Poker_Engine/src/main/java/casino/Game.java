package casino;

import java.util.ArrayList;
import java.util.UUID;

public class Game {
/////////////////////////////////////////////////////////////////////
//..........................ATTRIBUTES............................//                              
////////////////////////////////////////////////////////////////////
	
	private UUID gameID;
	private ArrayList<Player> tablePlayers = new ArrayList<Player>();
	

/////////////////////////////////////////////////////////////////////
//......................SETTERS & GETTERS.........................//                        
////////////////////////////////////////////////////////////////////
	
	public UUID getGameID() {
		return gameID;
	}
	public void setGameID(UUID gameID) {
		this.gameID = gameID;
	}
	public ArrayList<Player> getTablePlayers() {
		return tablePlayers;
	}
	public void setTablePlayers(ArrayList<Player> tablePlayers) {
		this.tablePlayers = tablePlayers;
	}

/////////////////////////////////////////////////////////////////////
//.......................... METHODS..............................//                       
////////////////////////////////////////////////////////////////////
	public void addPlayerToGame(Table table, Player player){
		//TODO add player to table...add to the arraylist
		
	}
	

/////////////////////////////////////////////////////////////////////
//........................CONSTRUCTORS............................//                        
////////////////////////////////////////////////////////////////////
	
	public Game(UUID gameID, ArrayList<Player> tablePlayers) {
		super();
		this.gameID = gameID;
		this.tablePlayers = tablePlayers;
	}


}
