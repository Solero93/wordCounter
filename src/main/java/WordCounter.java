public class WordCounter {
  private Text text;

  public WordCounter(Text text) {
    this.text = text;
  }

  public void showCountOfUniqueWords() {
    int result = text.countUniqueWords();
    System.out.println(result);
  }
}
