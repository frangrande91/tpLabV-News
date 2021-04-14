package com.utn.tpnews.repository;

import com.utn.tpnews.model.New;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NewRepository extends JpaRepository<New, Integer> {

    //@Query(value = "select * from news when title = ?1", nativeQuery = true)   //QUERY NATIVA
    List<New> findByTitle(String title);

}
