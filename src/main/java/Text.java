import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Text {
  private String text;

  public Text(String text) {
    this.text = text;
  }

  public int countUniqueWords() {
    if (text.equals("")) {
      return 0;
    }

    List<String> splitString = Arrays.asList(text.split(" "));
    HashSet<String> wordsWithoutDuplicates = new HashSet<>(splitString);
    return wordsWithoutDuplicates.size();
  }
}
