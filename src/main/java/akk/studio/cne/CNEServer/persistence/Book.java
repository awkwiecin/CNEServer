package akk.studio.cne.CNEServer.persistence;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "libraryBookStock")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

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
    @Column(name = "active")
    private boolean active;


    public Book(int id, String author, String title, String publisher, int yearOfPublication, boolean rented, boolean sold, boolean active) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.rented = rented;
        this.sold = sold;
        this.active = active;
    }
}
