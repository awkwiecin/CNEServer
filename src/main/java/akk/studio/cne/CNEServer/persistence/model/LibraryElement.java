package akk.studio.cne.CNEServer.persistence.model;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "libraryBookStock")
@Data
public class LibraryElement extends BaseEntity {

    @Column(name = "author")
    private String author;
    @Column(name = "title")
    private String title;
    @Column(name = "publisher")
    private String publisher;
    @Column(name = "year_of_publication")
    private int yearOfPublication;
    @Column(name = "rented")
    private boolean rented;
    @Column(name = "sold")
    private boolean sold;


    public LibraryElement(int id, String author, String title, String publisher, int yearOfPublication, boolean rented, boolean sold, boolean active) {
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.rented = rented;
        this.sold = sold;
    }
}
