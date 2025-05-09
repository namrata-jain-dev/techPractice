package assignment.libraryCatlogSystem;

import lombok.Data;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;

@Data
public class Book {
    private String title ;
    private String author ;
    private String genre ;
    private LocalDate publicationDate ;

    // default constructor bnana is mendatory
    public Book() {

    }

    // todo overloading
    public Book searchBook(String title, ArrayList<Book> bookList){
        for (Book book : bookList) {
           if (book.getTitle().equalsIgnoreCase(title)){
                return book ;
           }
        }
        return null ;
    }
    // todo overloading
    public Book searchBook(String title,String author,ArrayList<Book> bookList){
        for (Book book : bookList) {
            if (book.getAuthor().equalsIgnoreCase(author)){
                return book ;
            }
        }
        return null ;
    }
    //todo overriding
    String getFormat(){
      return "PDF";
    }
}



@Setter
class EBooks extends Book{

    private String format;

    @Override
    String getFormat() {
        super.getFormat();
        if (format == null){
            return "EPDF";
        }
        return format;
    }
}

