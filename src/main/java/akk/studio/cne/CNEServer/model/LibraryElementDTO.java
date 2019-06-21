package akk.studio.cne.CNEServer.model;

import lombok.Data;

@Data
public class LibraryElementDTO {

    private Long id;
    private String author;
    private String title;
    private String publisher;
    private int yearOfPublication;
    private boolean rented;
    private boolean sold;
    private boolean active;

}
