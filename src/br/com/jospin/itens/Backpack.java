package br.com.jospin.itens;

import java.util.*;

public class Backpack {

    private Double maxWeight;
    private Double momentaryWeight;
    private List<Item> elements;

    public Backpack(Double maxWeight) {
        this.maxWeight = maxWeight;
        this.momentaryWeight = 0.0;
        this.elements = new ArrayList<Item>();
    }

    static public Backpack noBackpackItem(){
        return new Backpack(0.0);
    }


    public void insertItem(Item item) throws Exception {
        if(item.getWeight() + momentaryWeight <= maxWeight){
            elements.add(item);
            momentaryWeight += item.getWeight();
        }else{
            throw new Exception("Error!! insufficient space in the backpack");
        }
    }

    public Item removeItem(Item item) throws Exception{

        if(!elements.remove(item)){
            throw new Exception("Error Not found element in backpage");
        }

        return item;
    }


    public Double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public Double getMomentaryWeight() {
        return momentaryWeight;
    }

    public void setMomentaryWeight(Double momentaryWeight) {
        this.momentaryWeight = momentaryWeight;
    }

    public List<Item> getElements() {
        return elements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Backpack)) return false;
        Backpack backpack = (Backpack) o;
        return Objects.equals(maxWeight, backpack.maxWeight) &&
                Objects.equals(momentaryWeight, backpack.momentaryWeight) &&
                Objects.equals(elements, backpack.elements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxWeight, momentaryWeight, elements);
    }

    @Override
    public String toString() {

        if(this.maxWeight == 0)
            return "no Backpack";
        if(this.momentaryWeight.equals(this.maxWeight)){
            return String.format("full with %.2f kg and this itens: %s",momentaryWeight,elements);
        }

        if(!this.elements.isEmpty())
            return String.format("with %.2f kg and this itens: %s",momentaryWeight,elements);

        return " a free backpage";
    }
}
