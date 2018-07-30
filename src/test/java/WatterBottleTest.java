import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WatterBottleTest {
 WaterBottle waterBottle;

 @Before
    public void before(){
     this.waterBottle = new WaterBottle();
 }

 @Test
    public void initialVolume(){
     assertEquals(100, waterBottle.volume() );
 }

 @Test
    public void drinkTest(){
     waterBottle.drink();
     assertEquals(90, waterBottle.volume() );
 }

 @Test
    public void emptyTest(){
     waterBottle.emptyBottle();
     assertEquals(0, waterBottle.volume() );
 }
}
