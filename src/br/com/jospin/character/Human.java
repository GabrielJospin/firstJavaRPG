package br.com.jospin.character;

import br.com.jospin.itens.Backpack;
import java.util.Objects;

public class Human implements RpgCharacter {


    private String name;
    private Long life;
    private Long attack;
    Backpack backpack;

    public Human(String name) {
        this.name = name;
        this.life = 20L;
        this.attack = 5L;
        this.backpack = Backpack.noBackpackItem();
    }

    public Human(String name, Long life, Long attack) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.backpack = Backpack.noBackpackItem();
    }

    public Human(String name, Long life, Long attack, Backpack backpack) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.backpack = backpack;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Long getLife() {
        return life;
    }

    @Override
    public void damage(Long damage) throws Exception {

        System.out.printf("%s has %d damage\n",name,damage);

        if(damage >= 0)
            this.life -= damage;
        else
            throw new Exception("Dano Inválido");
    }

    @Override
    public void restore(Long restore) throws Exception {

        System.out.printf("%s restore %d of life",name,restore);

        if(restore >= 0)
            this.life += restore;
        else
            throw new Exception("Dano Inválido");
    }

    @Override
    public Long getAttack() {
        return this.attack;
    }

    @Override
    public void setAttack(Long attack) {
        this.attack = attack;
    }

    @Override
    public void attack(RpgCharacter rpgCharacter) throws Exception {
        System.out.printf("%s attack %s\n",name,rpgCharacter.getName());
        rpgCharacter.damage(this.getAttack());
    }

    @Override
    public Backpack getBackpack() {
        return this.backpack;
    }

    public Backpack setBackPack(Backpack backpack){
        Backpack reserve = this.backpack;
        this.backpack = backpack;
        return reserve;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) &&
                Objects.equals(life, human.life) &&
                Objects.equals(attack, human.attack) &&
                Objects.equals(backpack, human.backpack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, life, attack, backpack);
    }

    @Override
    public String toString() {
        return String.format("A Human named %s whith %d life and %d attack\nIn your backpack has %s",
                name,
                life,
                attack,
                backpack);
    }
}
