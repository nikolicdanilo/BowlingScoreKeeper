package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame) throws BowlingException{
		//to be implemented
		if(frames.size()<10){
			if(frame.getFirstThrow()+frame.getSecondThrow()<=10){
				frames.add(frame);
			}else{
				throw new BowlingException();
			}
		}else{
			throw new BowlingException();
		}
	}
	public void setBonus(int firstThrow, int secondThrow) throws BowlingException {
		//to be implemented
		if(frames.size()!=10){
			throw new BowlingException();
		}else if(frames.get(frames.size()-1).isStrike()){
			
			if(firstThrow>10 || secondThrow>10 ){
				throw new BowlingException();
			}else {
					if(frames.get(frames.size()-2).isStrike()){
						frames.get(frames.size()-2).addBonus(10+firstThrow);
					}
					frames.get(frames.size()-1).addBonus(firstThrow+secondThrow);
			}
		}else if(frames.get(frames.size()-1).isSpare()){
			if(firstThrow>10 || secondThrow!=0 ){
				throw new BowlingException();
			}else{
					frames.get(frames.size()-1).addBonus(firstThrow);
			}
		}
	}
	public void dodajBonuseFrejmovima(){
		for(int i=0;i<frames.size();i++){
			if(frames.get(i).isSpare()&& i!=frames.size()-1){
				frames.get(i).addBonus(frames.get(i+1).getFirstThrow());
			}else if(frames.get(i).isStrike()&& i!=frames.size()-1){
				if(frames.get(i+1).isStrike()){
					if(i!=frames.size()-2)
						frames.get(i).addBonus(frames.get(i+1).getFirstThrow()+frames.get(i+2).getFirstThrow());
				}else{
					
					frames.get(i).addBonus(frames.get(i+1).getFirstThrow()+frames.get(i+1).getSecondThrow());
				}
			}
		}
	}
	
	public int score(){
		//to be implemented
		int score=0;
		for(int i=0;i<frames.size();i++){
			score+=frames.get(i).score();
		}
		return score;
		
	}
	public int scoreWithBonus(){
		dodajBonuseFrejmovima();
		int score =0;
			for(int i=0;i<frames.size();i++){
				score+=frames.get(i).scoreWithBonus();
			}
			return score;
	}
}
