package assignment.libraryCatlogSystem;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


// controller service service
//DTO , Optional<>,put
//
public class Main {


    public static void main(String[] args) {

        String[] titleList = {
                "Java","Spring","Postgresql","MySQL","Python","Hibernate","Dart","Flutter","AndroidOS","IOS"
        };
        String[] authorList = {
                "James Gosling","Rod Johnson","Michael Stonebraker","Don't Know","Don't Know","Don't Know","Don't Know","Google","Google","Apple"
        };
        LocalDate[] publicationDateList = {
                LocalDate.of(2000,8,8),
                LocalDate.of(2001,4,12),
                LocalDate.of(2002,3,17),
                LocalDate.of(2002,1,20),
                LocalDate.of(2001,2,16),
                LocalDate.of(2001,5,28),
                LocalDate.of(2002,10,10),
                LocalDate.of(2005,7,24),
                LocalDate.of(2007,9,13),
                LocalDate.of(2003,11,5),
                LocalDate.of(2000,7,9),
        };
        String[] genreList = {
                "Language","Framework","Database","Database","Language","Framework","Language","Framework","OS","OS"
        };
        String[] formatList = {
                "PDF","EPUB","EPUB","PDF","PDF","PDF","PDF","PDF","PDF","EPUB"
        };

        ArrayList<Book> books = new ArrayList<Book>();
        EBooks[] bookArray = new EBooks[10];


        // todo 4 book arraylist
        for (int i = 0; i < bookArray.length; i++) {
            bookArray[i] = new EBooks();
            // It is mandatory to initialize with default constructor
            // I have added a default constructor BOOK in book class
            bookArray[i].setTitle(titleList[i]);
            bookArray[i].setAuthor(authorList[i]);
            bookArray[i].setPublicationDate(publicationDateList[i]);
            bookArray[i].setFormat(formatList[i]);
            bookArray[i].setGenre(genreList[i]);

            books.add(bookArray[i]);
        }
        System.out.println(books);


        // todo 2 search book
        Book bookSearchTitle = new Book();
        System.out.println("Search by title => "+  bookSearchTitle.searchBook("Java",books));
        System.out.println("Search by author => "+  bookSearchTitle.searchBook("","Don't Know",books));


        // todo 3 overriding concept
        Book book1 = new Book();
        Book book2 = new EBooks();
        System.out.println("from Book class object "+ book1.getFormat());
        System.out.println("from EBook class object "+ book2.getFormat());


        // todo 5
        HashMap<String, List<Book>> genreMap = new HashMap<>();
        for (Book book : books) {
            if (genreMap.containsKey(book.getGenre())){
                List<Book> list = genreMap.get(book.getGenre());
                list.add(book);
                genreMap.replace(book.getGenre(),list);
            }else{
                List<Book> newList = new ArrayList<>();
                newList.add(book);
                genreMap.put(book.getGenre(),newList);
            }
        }

        genreMap.forEach((k,v)->{
            System.out.println("The key is => " +k+"\nThe Value at that key is \n ===>"+v);
        });

        // todo 6
        for (Book book : books) {
            if(book.getPublicationDate().isAfter(LocalDate.of(2003,1,1))){
                System.out.println("The book published after 2003 is => "+book);
            }
        }


        // todo 7
        System.out.println("The Title List before upper case conversion is => "+ Arrays.toString(titleList));
        for(int i = 0 ; i < books.size() ; i++){
         titleList[i] = books.get(i).getTitle().toUpperCase();
        }

        System.out.println("The Title List after upper case conversion is => "+ Arrays.toString(titleList));
        System.out.println();
        for(int i = 0 ; i < books.size() ; i++){
            String pattern = "SQL";
            if(titleList[i].contains(pattern)){
                System.out.println("Yes the pattern SQL is found in the title =>"+books.get(i).getTitle() );
            }
        }
        System.out.println();
        for(int i = 0 ; i < books.size() ; i++){
            String pattern2 = "OS";
//            if(titleList[i].compareToIgnoreCase()!=0){
            if(titleList[i].contains(pattern2)){
                System.out.println("Yes the pattern OS is found in the title =>"+books.get(i).getTitle() );
            }
        }

        // todo 8
        for (int i = 0 ; i < books.size() ; i++) {
            int oldYears = books.get(i).getPublicationDate().until(LocalDate.now()).getYears();
            System.out.println("Calculating through the UNTIL function the difference between current date and publication date at index "+i+" => "+oldYears+" years");

            LocalDateTime firstDate = books.get(i).getPublicationDate().atTime(LocalTime.now());
            LocalDateTime secondDate = LocalDateTime.now();
//            Duration.between(books.get(i).getPublicationDate().atTime(LocalTime.now()),LocalDate.now().atTime(LocalTime.now()));
            Duration duration = Duration.between(firstDate,secondDate); // between function must requires time
            System.out.println("Calculating through the DURATION class the difference between current date and publication date at index "+i+" => "+ duration.toDays()/365+" years");
        }

    }
}
