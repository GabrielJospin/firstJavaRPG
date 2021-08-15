package br.com.jospin.itens.swords;

import br.com.jospin.itens.Item;

public class Sword implements Item {

    private String name;
    private Double weight;
    private String description;
    private Long attack;


    public Sword(String name) {
        this.name = name;
        this.weight = 0.5;
        this.attack = 5L;
        this.description = "Just a Sword";
    }

    protected Sword(String name, Double weight, String description, Long attack) {
        this.name = name;
        this.weight = weight;
        this.description = description;
        this.attack = attack;
    }

    @Override
    public Double getWeight() {
        return this.weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public Long getAttack() {
        return attack;
    }

    public void setAttack(Long attack) {
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "Sword at name " + name;
    }
}
