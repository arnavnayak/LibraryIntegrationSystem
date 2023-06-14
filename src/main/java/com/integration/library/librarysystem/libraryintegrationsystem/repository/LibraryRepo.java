package com.integration.library.librarysystem.libraryintegrationsystem.repository;

import com.integration.library.librarysystem.libraryintegrationsystem.model.LibraryBook;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepo extends CrudRepository<LibraryBook,String> {

}
