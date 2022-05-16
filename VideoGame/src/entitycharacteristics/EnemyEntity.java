package entitycharacteristics;

public class EnemyEntity extends EntityBase {
	private int tooCloseToPlayer;

    public EnemyEntity() {
	     super();
         tooCloseToPlayer = 0;
  }
	public int getTooCloseToPlayer() {
		return tooCloseToPlayer;
	}

	public void setTooCloseToPlayer(int tooCloseToPlayer) {
		this.tooCloseToPlayer = tooCloseToPlayer;
	}
	
}
