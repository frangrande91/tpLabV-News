package com.utn.tpnews.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.AccessType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "typeNew", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = TextNew.class, name = "TEXT"),
        @JsonSubTypes.Type(value = ImgNew.class, name = "IMG"),
        @JsonSubTypes.Type(value = VideoNew.class, name = "VIDEO"),
})
@Entity
public abstract class New  {

    @Id
    @GeneratedValue
    protected Integer id;

    @NotNull
    protected String title;

    @NotNull
    @Size
    protected String description;

    @NotNull
    @Max(1024)
    protected Integer size;

    @AccessType(AccessType.Type.PROPERTY)
    public abstract TypeNew typeNew();




}
