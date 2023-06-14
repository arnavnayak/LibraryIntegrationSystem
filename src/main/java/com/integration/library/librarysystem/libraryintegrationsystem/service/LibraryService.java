package com.integration.library.librarysystem.libraryintegrationsystem.service;

import com.integration.library.librarysystem.libraryintegrationsystem.model.LibraryBook;
import com.integration.library.librarysystem.libraryintegrationsystem.repository.LibraryRepo;
import com.integration.library.librarysystem.libraryintegrationsystem.model.LibraryBookEntryRequest;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;


@Service
@Slf4j
public class LibraryService {

    @Autowired
    @Lazy
    LibraryRepo libraryRepo;

    public Iterable<LibraryBook> fetchAllBookService() {
        Iterable<LibraryBook> allBookList = libraryRepo.findAll();
        return allBookList;
    }

    public LibraryBook makeBookEntryService(LibraryBookEntryRequest libraryBookEntryRequest) {
        ModelMapper modelMapper = new ModelMapper();
        LibraryBook bookEntry = modelMapper.map(libraryBookEntryRequest,LibraryBook.class);
        UUID uuid=UUID.randomUUID();
        bookEntry.setBookId(uuid.toString());
        return libraryRepo.save(bookEntry);
    }


    public LibraryBook updateBookEntryService(LibraryBookEntryRequest libraryBookEntryRequest,String bookId) {
        ModelMapper modelMapper = new ModelMapper();
        LibraryBook updatedBookEntry = modelMapper.map(libraryBookEntryRequest,LibraryBook.class);
        //Logic of getting the bookid
        LibraryBook bookEntry = fetchBookById(bookId);
        updatedBookEntry.setBookId(bookEntry.getBookId());
        return libraryRepo.save(updatedBookEntry);
    }

    public LibraryBook fetchBookById(String bookId) {
        log.info("inside fetchBookById service : bookId: {}",bookId);
        Optional<LibraryBook> bookDetails = libraryRepo.findById(bookId);
        log.info("after fetching bookdetails fetchBookById service : bookId: {}",bookDetails);
        return bookDetails.get();
    }

    public String deleteBookByIdService(String bookId) {
        log.info("inside deleteBookByIdService  : bookId: {}",bookId);
        libraryRepo.deleteById(bookId);
        log.info("after deleting bookdetails fetchBookById service :");
        return "successfully deleted bookId : "+bookId;
    }
}
