package com.integration.library.librarysystem.libraryintegrationsystem.domain;

import com.integration.library.librarysystem.libraryintegrationsystem.model.LibraryBook;
import com.integration.library.librarysystem.libraryintegrationsystem.service.LibraryService;
import com.integration.library.librarysystem.libraryintegrationsystem.model.LibraryBookEntryRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LibraryDomain {

    @Autowired
    LibraryService libraryService;

    public Iterable<LibraryBook> fetchAllBookDomain() {
        return libraryService.fetchAllBookService();
    }

    public LibraryBook makeBookEntryDomain(LibraryBookEntryRequest libraryBookEntryRequest) {

        return libraryService.makeBookEntryService(libraryBookEntryRequest);
    }

    public LibraryBook updateBookEntryDomain(LibraryBookEntryRequest libraryBookEntryRequest,String bookId) {

        return libraryService.updateBookEntryService(libraryBookEntryRequest,bookId);
    }

    public LibraryBook fetchBookByIdDomain(String bookId) {
        return libraryService.fetchBookById(bookId);
    }

    public String deleteBookByIdDomain(String bookId) {
        return libraryService.deleteBookByIdService(bookId);
    }
}
