package com.integration.library.librarysystem.libraryintegrationsystem.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter
public class LibraryFetchResponse {

    private String bookId;
    private String bookName;
    private String bookStatus;
    private String bookMark;
    private String bookNote;

    public LibraryFetchResponse(String bookId, String bookName, String bookStatus, String bookMark, String bookNote) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookStatus = bookStatus;
        this.bookMark = bookMark;
        this.bookNote = bookNote;
    }
    public LibraryFetchResponse(){};

}
