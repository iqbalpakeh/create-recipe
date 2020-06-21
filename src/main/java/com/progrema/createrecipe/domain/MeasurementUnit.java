package com.progrema.createrecipe.domain;

import javax.persistence.*;

@Entity
public class MeasurementUnit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    // --------------------
    // GETTER SETTER
    // --------------------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String measureUnit) {
        this.description = measureUnit;
    }

    @Override
    public String toString() {
        return "MeasurementUnit{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
