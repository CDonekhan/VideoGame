package initialization;

public class GameSettings {
	private static char enemyDeathSymbol = '~';
	private static int numEnemies = 3;	
	
	public static char getEnemyDeathSymbol() {
		return enemyDeathSymbol;
	}
	public static void setEnemyDeathSymbol(char enemyDeathSymbol) {
		GameSettings.enemyDeathSymbol = enemyDeathSymbol;
	}
	public static int getNumEnemies() {
		return numEnemies;
	}
	public static void setNumEnemies(int numEnemies) {
		GameSettings.numEnemies = numEnemies;
	}
}
