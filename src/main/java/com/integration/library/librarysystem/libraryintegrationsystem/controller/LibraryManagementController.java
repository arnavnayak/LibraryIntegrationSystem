package com.integration.library.librarysystem.libraryintegrationsystem.controller;

import com.integration.library.librarysystem.libraryintegrationsystem.domain.LibraryDomain;
import com.integration.library.librarysystem.libraryintegrationsystem.utils.LogUtils;
import com.integration.library.librarysystem.libraryintegrationsystem.model.LibraryBookEntryRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/library/books/integration")
public class LibraryManagementController {

    @Autowired
    LibraryDomain libraryDomain;

    @Autowired
    LogUtils logUtils;

    @GetMapping(value = "/fetchAllBook", produces = "application/json")
    public ResponseEntity<?> fetchAllBooks(){
        logUtils.loggerImpl("fetchAllBooks",null,null);
        return ResponseEntity.ok(libraryDomain.fetchAllBookDomain());

    }

    @PostMapping(value = "/bookEntry", consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> makeBookEntry(@RequestBody LibraryBookEntryRequest libraryBookEntryRequest){
        logUtils.loggerImpl("makeBookEntry",libraryBookEntryRequest,null);
        return ResponseEntity.ok(libraryDomain.makeBookEntryDomain(libraryBookEntryRequest));
    }

    @PutMapping(value = "/bookUpdate/{id}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> updateBookEntry(@RequestBody LibraryBookEntryRequest libraryBookEntryRequest
            ,@PathVariable("id") String bookId){
        logUtils.loggerImpl("updateBookEntry",libraryBookEntryRequest,bookId);
        return ResponseEntity.ok(libraryDomain.updateBookEntryDomain(libraryBookEntryRequest,bookId));
    }

    @GetMapping(value = "/fetchBookById/{id}", produces = "application/json")
    public ResponseEntity<?> fetchBookById(@PathVariable("id") String bookId){
        logUtils.loggerImpl("fetchBookById",null,bookId);
        return ResponseEntity.ok(libraryDomain.fetchBookByIdDomain(bookId));
    }

    @DeleteMapping(value = "/deleteBookEntry/{id}", produces = "application/json")
    public ResponseEntity<?> deleteBookEntry(@PathVariable("id") String bookId){
        logUtils.loggerImpl("deleteBookEntry",null,bookId);
        return ResponseEntity.ok(libraryDomain.deleteBookByIdDomain(bookId));
    }
}
