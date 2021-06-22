package xxx;

import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(MyTestListener.class)
public class MyTest {

  @Test
  public void testMath() {
    Assert.assertEquals(4, 2*2);
  }

}
