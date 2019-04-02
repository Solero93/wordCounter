import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TextTest {
  @Test
  public void count_ShouldReturn0_WhenEmptyString() {
    Text text = new Text("");
    assertEquals(0, text.countUniqueWords());
  }

  @Test
  public void count_ShouldReturn1_WhenOneWord() {
    Text text = new Text("asdlkjaskd");
    assertEquals(1, text.countUniqueWords());
  }

  @Test
  public void count_ShouldReturn2_WhenTwoWords() {
    Text text = new Text("asdlkjaskd oiu12oi");
    assertEquals(2, text.countUniqueWords());
  }

  @Test
  public void count_ShouldReturn31_WhenLoremIpsumThing() {
    Text text = new Text("Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500.");
    assertEquals(20, text.countUniqueWords());
  }
}
