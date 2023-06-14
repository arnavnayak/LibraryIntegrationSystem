package com.integration.library.librarysystem.libraryintegrationsystem.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Table(name = "LibrarySystem")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class LibraryBook {


    @Id
    @Column(name="bookId")
//    @GeneratedValue(strategy=GenerationType.AUTO)
    private String bookId;

    @Column(name="bookNameAndAuthorName")
    private String bookNameAndAuthorName;

    @Column(name="bookStatus")
    private String bookStatus;

    @Column(name="dateUpdated")
    private LocalDate dateUpdated;

    @Column(name="personName")
    private String personName;

    @Column(name="personEmail")
    private String personEmail;
}
