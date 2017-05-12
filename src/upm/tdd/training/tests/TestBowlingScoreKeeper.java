package upm.tdd.training.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import upm.tdd.training.BowlingException;
import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;

public class TestBowlingScoreKeeper {
	BowlingGame testGame;
	Frame testFrame;

	@Test
	public void testWithOutSpareOrStrike() throws BowlingException {
		testGame=new BowlingGame();
		for(int i=0;i<10;i++){
			testGame.addFrame(new Frame(3,2));
		}
		assertEquals("Proveravamo da li je posle 10 bacanja rezultat jedan zbiru svi bacanja bez strike i spore",50,testGame.score());
		
	}
	@Test
	public void testIfIsStrike(){
		testFrame=new Frame(10,0);
		assertTrue("Proveravamo da li je strike frame sa scorom 10 u prvom bacanju",testFrame.isStrike());
	}
	@Test
	public void testIfIsSpare(){
		testFrame=new Frame(5,5);
		assertTrue("Proveravamo da li je spare frame sa scorom 5 u prvom bacanju i 5 u drugom bacanju",testFrame.isSpare());
	}
	@Test
	public void testScoreWithBonus(){
		testFrame=new Frame(5,3);
		testFrame.addBonus(5);
		assertEquals(13,testFrame.scoreWithBonus());
	}
	@Test
	public void testScoreInGameWithSpare() throws BowlingException{
		testFrame=new Frame(5,5);
		Frame f2 = new Frame(2,2);
		testGame=new BowlingGame();
		testGame.addFrame(testFrame);
		testGame.addFrame(f2);
		assertEquals(16,testGame.scoreWithBonus());
		
	}
	@Test
	public void testScoreInGameWithStrike() throws BowlingException{
		testFrame=new Frame(10,0);
		Frame f2 = new Frame(10,0);
		Frame f3 = new Frame(2,3);
		testGame=new BowlingGame();
		testGame.addFrame(testFrame);
		testGame.addFrame(f2);
		testGame.addFrame(f3);
		assertEquals(42,testGame.scoreWithBonus());
		
	}
	@Test(expected=BowlingException.class)
	public void testExceptionWhenAdd11Frame() throws BowlingException{
		testFrame=new Frame(10,0);
		Frame f2 = new Frame(10,0);
		Frame f3 = new Frame(2,3);
		Frame f4 = new Frame(10,0);
		Frame f5 = new Frame(2,3);
		Frame f6 = new Frame(10,0);
		Frame f7 = new Frame(2,3);
		Frame f8 = new Frame(10,0);
		Frame f9 = new Frame(2,3);
		Frame f10 = new Frame(10,0);
		Frame f11 = new Frame(2,3);
		testGame=new BowlingGame();
		testGame.addFrame(testFrame);
		testGame.addFrame(f2);
		testGame.addFrame(f3);
		testGame.addFrame(f4);
		testGame.addFrame(f5);
		testGame.addFrame(f6);
		testGame.addFrame(f7);
		testGame.addFrame(f8);
		testGame.addFrame(f9);
		testGame.addFrame(f10);
		testGame.addFrame(f11);
		
	
	}@Test(expected=BowlingException.class)
	public void testExceptionWhenSetBonusOn9Frame() throws BowlingException{
		testFrame=new Frame(10,0);
		Frame f2 = new Frame(10,0);
		Frame f3 = new Frame(2,3);
		Frame f4 = new Frame(10,0);
		Frame f5 = new Frame(2,3);
		Frame f6 = new Frame(10,0);
		Frame f7 = new Frame(2,3);
		Frame f8 = new Frame(10,0);
		Frame f9 = new Frame(2,3);
		
		testGame=new BowlingGame();
		testGame.addFrame(testFrame);
		testGame.addFrame(f2);
		testGame.addFrame(f3);
		testGame.addFrame(f4);
		testGame.addFrame(f5);
		testGame.addFrame(f6);
		testGame.addFrame(f7);
		testGame.addFrame(f8);
		testGame.addFrame(f9);
		testGame.setBonus(10, 0);
		
	
	}
	@Test(expected=BowlingException.class)
	public void testExceptionForScoreBiggerThen10() throws BowlingException{
		testFrame=new Frame(12,0);
		testGame=new BowlingGame();
		testGame.addFrame(testFrame);
		
	}
	@Test
	public void testPartijeMaxScore() throws BowlingException{
		BowlingGame game = new BowlingGame();
		Frame f1 = new Frame(10,0);
		Frame f2 = new Frame(10,0);
		Frame f3 = new Frame(10,0);
		Frame f4 = new Frame(10,0);
		Frame f5 = new Frame(10,0);
		Frame f6 = new Frame(10,0);
		Frame f7 = new Frame(10,0);
		Frame f8 = new Frame(10,0);
		Frame f9 = new Frame(10,0);
		Frame f10 = new Frame(10,0);
		
		game.addFrame(f1);
		game.addFrame(f2);
		game.addFrame(f3);
		game.addFrame(f4);
		game.addFrame(f5);
		game.addFrame(f6);
		game.addFrame(f7);
		game.addFrame(f8);
		game.addFrame(f9);
		game.addFrame(f10);
		game.setBonus(3,3);	

		assertEquals(279, game.scoreWithBonus());

	}
	@Test

	public void testPartije2() throws BowlingException{

		BowlingGame game = new BowlingGame();

		Frame f1 = new Frame(1,4);
		Frame f2 = new Frame(4,5);
		Frame f3 = new Frame(6,4);
		Frame f4 = new Frame(5,5);
		Frame f5 = new Frame(10,0);
		Frame f6 = new Frame(0,1);
		Frame f7 = new Frame(7,3);
		Frame f8 = new Frame(6,4);
		Frame f9 = new Frame(10,0);
		Frame f10 = new Frame(2,8);
		
		game.addFrame(f1);
		game.addFrame(f2);
		game.addFrame(f3);
		game.addFrame(f4);
		game.addFrame(f5);
		game.addFrame(f6);
		game.addFrame(f7);
		game.addFrame(f8);
		game.addFrame(f9);
		game.addFrame(f10);
		game.setBonus(6,0);	
		assertEquals(133, game.scoreWithBonus());

	}

}
