package pl.javastart.exercise.streams;

import java.util.List;
import java.util.stream.Collectors;

public class FilteringMachine {

    public List<Integer> filterOutNotEvenNumbers(List<Integer> numberList) {
        List<Integer> collectionToFilter = numberList.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        return collectionToFilter;
    }

    public List<Integer> filterOutLowerNumbersThan20(List<Integer> numberList) {
        List<Integer> collectionToFilter2 = numberList.stream()
                .filter(number -> number > 20)
                .collect(Collectors.toList());
        return collectionToFilter2;
    }

    public List<Book> convertToBooks(List<String> titles) {
        List<Book> bookList = titles.stream()
                .map(Book::new)
                .collect(Collectors.toList());
        return bookList;
    }

    //Metoda powinna przekształcić tytuły na książki i zwrócić tylko te które rozpoczynają się od słowa "Gra"
    public List<Book> convertToBooksAndReturnOnlyStartingWithGra(List<String> titles) {
        List<Book> booksStaretingWithGra = convertToBooks(titles).stream()
                .filter(name -> name.getTitle().startsWith("Gra"))
                .collect(Collectors.toList());
        return booksStaretingWithGra;
    }
}
