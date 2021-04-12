package com.utn.tpnews.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TextNew extends New{

    @NotNull
    @Size
    private String text;

    @Max(1024)
    private Integer sizeText;


    @Override
    public TypeNew typeNew() {
        return TypeNew.TEXT;
    }
}
