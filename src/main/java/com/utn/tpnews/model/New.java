package com.utn.tpnews.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class New  {

    @Id
    @GeneratedValue
    protected Integer id;

    @NotNull
    protected String title;

    protected Integer size;


}
