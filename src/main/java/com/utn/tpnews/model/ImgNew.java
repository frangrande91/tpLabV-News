package com.utn.tpnews.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ImgNew extends New {


    @NotNull
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "image_id")
    private List<Image> images;

    @Override
    public TypeNew typeNew() {
        return TypeNew.IMG;
    }
}
