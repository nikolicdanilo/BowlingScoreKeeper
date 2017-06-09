package upm.tdd.training;

public class Frame {
	private int firstThrow;
	private int secondThrow;
	private int scoreBonus;
	
	public int getFirstThrow() {
		return firstThrow;
	}

	public int getSecondThrow() {
		return secondThrow;
	}

	public Frame(int firstThrow, int secondThrow){
		/*this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
		scoreBonus=0;*/
		this.firstThrow=firstThrow;
		this.secondThrow=secondThrow;
		scoreBonus=0;
		
	}
	
	//the score of a single frame
	public int score() {
		//to be implemented
			//return firstThrow+secondThrow;
		return firstThrow+secondThrow;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		//to be implemented
		/*if(firstThrow==10){
			return true;
		}else{
			return false;
		}*/
		if(firstThrow==10){
			return true;
		}else{
			return false;
		}
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		//to be implemented
		/*if(!isStrike()&&firstThrow+secondThrow==10){
			return true;
		}else{
		return false;
		}*/
		if(!isStrike()&&firstThrow+secondThrow==10){
			return true;
		}else{
			return false;
		}
	}
	public void addBonus(int bonus){
		//scoreBonus=bonus;
		scoreBonus=bonus;
	}

	//bonus throws
	public int scoreWithBonus(){
		//to be implemented
		//return score()+scoreBonus;
		return score()+scoreBonus;
	}


}
