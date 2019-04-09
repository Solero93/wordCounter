import com.lasalle.edu.Text;
import com.lasalle.edu.WordCounter;
import com.lasalle.edu.filter.FilterStrategy;
import com.lasalle.edu.filter.decorators.FilterStartsWithVowel;
import com.lasalle.edu.filter.decorators.FilterUniqueWords;
import com.lasalle.edu.filter.decorators.FilterWordsStartingWithUppercase;
import com.lasalle.edu.filter.decorators.FilterWordsWithMoreThanTwoCharacters;
import com.lasalle.edu.filter.strategies.NoFilter;

public class Main {
  public static void main(String[] args) {
    FilterStrategy filterStrategy = new NoFilter();
    filterStrategy = new FilterStartsWithVowel(filterStrategy);
    filterStrategy = new FilterUniqueWords(filterStrategy);
    filterStrategy = new FilterWordsStartingWithUppercase(filterStrategy);
    filterStrategy = new FilterWordsWithMoreThanTwoCharacters(filterStrategy);

    WordCounter wordCounter = new WordCounter(filterStrategy);
    Text text = new Text("Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500.");
    wordCounter.showCount(text);
  }
}
