package org.csid.autobody.entity;

import javax.persistence.*;

@Entity
@Table(name = "Make")
public class MakeEntity {


    @Id
    private String make;

    public MakeEntity() {
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
