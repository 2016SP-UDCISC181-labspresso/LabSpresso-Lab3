package casino;
import java.util.UUID;

import pokerBase.*;
public class Player {
/////////////////////////////////////////////////////////////////////
//..........................ATTRIBUTES............................//                              
////////////////////////////////////////////////////////////////////
	
	private UUID playerID;
	private String playerName;
	private int playerPos;

	
/////////////////////////////////////////////////////////////////////
//.....................SETTERS & GETTERS.........................//                        
////////////////////////////////////////////////////////////////////
	
	public UUID getPlayerI.D() {
		return playerID;
	}
	public void setPlayerID(UUID playerID) {
		this.playerID = playerID;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getPlayerPos() {
		return playerPos;
	}
	public void setPlayerPos(int playerPos) {
		this.playerPos = playerPos;
	}

	
/////////////////////////////////////////////////////////////////////
//........................CONSTRUCTORS............................//                        
////////////////////////////////////////////////////////////////////
	public Player(UUID playerID, String playerName, int playerPos) {
		super();
		this.playerID = playerID;
		this.playerName = playerName;
		this.playerPos = playerPos;

/////////////////////////////////////////////////////////////////////
//.......................... METHODS..............................//                       
////////////////////////////////////////////////////////////////////


	}
	
	

}
