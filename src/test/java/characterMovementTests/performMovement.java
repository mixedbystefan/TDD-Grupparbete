package characterMovementTests;

import static org.junit.Assert.assertEquals;

import java.awt.geom.Point2D;

import org.junit.Test;

import museumHeist.sprites.GameCharacter;
import museum_heist.Position;



public class performMovement {

	@Test
	public void moveOneRight() {
		GameCharacter mainCharacter = new GameCharacter(); //har 0,0 som startposition
		mainCharacter.moveOneTileRight();
		assertEquals(mainCharacter.getCurrentPosition(),new Position(1,0)); 
	}
	@Test
	public void moveBackAndForth() {
		GameCharacter mainCharacter = new GameCharacter(); //har 0,0 som startposition
		mainCharacter.moveOneTileRight();
		mainCharacter.moveOneTileLeft();
		assertEquals(mainCharacter.getCurrentPosition(),new Position(0,0)); 
	}
	
}
