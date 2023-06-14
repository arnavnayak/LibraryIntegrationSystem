package com.integration.library.librarysystem.libraryintegrationsystem.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Setter @Getter @NoArgsConstructor
public class LibraryBookEntryRequest {

    @NonNull
    private String personName;
    @NonNull
    private String personEmail;
    @NonNull
    private String bookNameAndAuthorName;
    @NonNull
    private String bookStatus;
    @NonNull
    private LocalDate dateUpdated;
}
