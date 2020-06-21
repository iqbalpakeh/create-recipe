package com.progrema.createrecipe.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Recipe recipe;

    @OneToOne(fetch = FetchType.EAGER)
    private MeasurementUnit uom;

    private String description;

    private BigDecimal amount;

    public Ingredient() {
    }

    public Ingredient(String description, BigDecimal amount, MeasurementUnit uom, Recipe recipe) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
        this.recipe = recipe;
    }

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

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public MeasurementUnit getUom() {
        return uom;
    }

    public void setUom(MeasurementUnit uom) {
        this.uom = uom;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", recipe=" + recipe +
                ", uom=" + uom +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                '}';
    }

}
