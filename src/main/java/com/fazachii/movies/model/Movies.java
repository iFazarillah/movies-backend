package com.fazachii.movies.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.Date;
import java.util.List;
import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "movie")
public class Movies {


    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", length = 36, nullable = false)
    @Id
    private String id;

    @Column(name = "imdbId", length = 36)
    private String imdbId;

    @Column(name = "title")
    private String title;

    @Column(name = "releaseDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date releaseDate;

    @Column(name = "trailerLink")
    private String trailerLink;

    @Column(name = "poster")
    private String poster;

    @Column(name = "genres", columnDefinition = "varchar[]")
    private List<String> genres;

    @Column(name = "backdrops", columnDefinition = "varchar[]")
    private List<String> backdrops;


}
