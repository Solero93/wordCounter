package com.lasalle.edu;

import com.lasalle.edu.Text;
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

  @Test
  public void countWordsStartingWithVowel_ShouldReturn1_WhenOneWordStartWithLowercase() {
    Text text = new Text("asdad");
    assertEquals(1, text.countWordsStartingWithVowel());
  }

  @Test
  public void countWordsStartingWithVowel_ShouldReturn0_WhenOneWordStartWithConsonant() {
    Text text = new Text("Sadad");
    assertEquals(0, text.countWordsStartingWithVowel());
  }

  @Test
  public void countWordsMoreThanTwoCharacters_ShouldReturn1_WhenWordWithMoreThanTwoLetters() {
    Text text = new Text("ASDAD");
    assertEquals(1, text.countWordsWithMoreThanTwoCharacters());
  }

  @Test
  public void countWordsMoreThanTwoCharacters_ShouldReturn0_WhenWordWithLessThanTwoLetters() {
    Text text = new Text("a");
    assertEquals(0, text.countWordsWithMoreThanTwoCharacters());
  }

  @Test
  public void countWordsStartingWithUppercase_ShouldReturn1_WhenWordStartingWithUppercase() {
    Text text = new Text("Asdads");
    assertEquals(1, text.countWordsStartingWithUppercase());
  }

  @Test
  public void countWordsStartingWithUppercase_ShouldReturn0_WhenWordStartingWithLowercase() {
    Text text = new Text("asaljkd");
    assertEquals(0, text.countWordsStartingWithUppercase());
  }
}
