package com.anupama.cerp.entities;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.io.Serializable;

// to inherit base class properties
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id // Specifies the primary key of the entity
    // The @GeneratedValue annotation provides us with different strategies for the generation of primary keys :
    //GenerationType.IDENTITY: This strategy will help us to generate the primary key value by the database itself using the auto-increment column option.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
