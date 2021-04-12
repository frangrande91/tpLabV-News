package com.utn.tpnews.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Video {

    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    @Max(1024)
    private Integer sizeVideo;

    @NotNull
    private String path;

    @NotNull
    private String format;

}
