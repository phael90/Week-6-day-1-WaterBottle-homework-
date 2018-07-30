import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WatterBottleTest {
 WaterBottle waterbottle;

 @Before
    public void before(){
     this.waterbottle = new WaterBottle(100);
 }

 @Test
    public void Volume(){
     assertEquals(100, waterbottle.Volume());
 }
}
