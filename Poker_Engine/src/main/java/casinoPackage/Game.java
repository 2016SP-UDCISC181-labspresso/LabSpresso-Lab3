package casinoPackage;

import java.util.ArrayList;
import java.util.UUID;

public class Game {
/////////////////////////////////////////////////////////////////////
//..........................ATTRIBUTES............................//                              
////////////////////////////////////////////////////////////////////
	
	private UUID gameID;
	private ArrayList<Player> gamePlayers = new ArrayList<Player>();
	

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
//........................CONSTRUCTORS............................//                        
////////////////////////////////////////////////////////////////////

	public Game(UUID gameID, ArrayList<Player> tablePlayers) {
		super();
		this.gameID = gameID;
		this.tablePlayers = tablePlayers;
}
	
/////////////////////////////////////////////////////////////////////
//.......................... METHODS..............................//                       
////////////////////////////////////////////////////////////////////
	public void addPlayerToGame(Table table, Player player){
		
		
	}
	




}
