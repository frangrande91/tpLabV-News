package com.utn.tpnews.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class VideoNew extends New {


    @NotNull
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "video_id")
    private Video video;

    @Override
    public TypeNew typeNew() {
        return TypeNew.VIDEO;
    }
}
