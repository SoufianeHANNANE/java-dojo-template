import fr.wildcoeschool.binary.SomeClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SomeTest {

  SomeClass someInstance = new SomeClass();

  @Test
  public void testWhite() {
    Assertions.assertEquals("white", someInstance.whatWasHentyIVsWhiteHorseColor());
  }

}