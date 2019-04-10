import com.lasalle.edu.Text;
import com.lasalle.edu.WordCounter;
import com.lasalle.edu.filter.FilterStrategy;
import com.lasalle.edu.filter.decorators.FilterStartsWithVowel;
import com.lasalle.edu.filter.decorators.FilterUniqueWords;
import com.lasalle.edu.filter.decorators.FilterWordsStartingWithUppercase;
import com.lasalle.edu.filter.decorators.FilterWordsWithMoreThanTwoCharacters;
import com.lasalle.edu.filter.strategies.NoFilter;
import com.lasalle.edu.separator.SpaceSeparator;
import com.lasalle.edu.separator.TextSeparator;
import com.lasalle.edu.show.ShowStrategy;
import com.lasalle.edu.show.SystemPrintShow;

public class Main {
  public static void main(String[] args) {
    FilterStrategy filterStrategy = new NoFilter();
    filterStrategy = new FilterStartsWithVowel(filterStrategy);
    filterStrategy = new FilterUniqueWords(filterStrategy);
    filterStrategy = new FilterWordsStartingWithUppercase(filterStrategy);
    filterStrategy = new FilterWordsWithMoreThanTwoCharacters(filterStrategy);

    ShowStrategy showStrategy = new SystemPrintShow();
    WordCounter wordCounter = new WordCounter(filterStrategy, showStrategy);

    TextSeparator textSeparator = new SpaceSeparator();
    String content = "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500.";
    Text text = new Text(content, textSeparator);

    wordCounter.showCount(text);
  }
}
