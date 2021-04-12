package com.utn.tpnews.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VideoNew extends New {

    @NotNull
    private Video video;


    @Override
    public TypeNew typeNew() {
        return TypeNew.VIDEO;
    }
}
