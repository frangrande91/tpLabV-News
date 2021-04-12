package com.utn.tpnews.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImgNew extends New {

    @NotNull
    private List<Image> images;

    @Override
    public TypeNew typeNew() {
        return TypeNew.IMG;
    }
}
