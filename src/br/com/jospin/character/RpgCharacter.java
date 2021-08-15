package br.com.jospin.character;

import br.com.jospin.itens.Backpack;

public interface RpgCharacter {

    //Identify
    String getName();
    void setName(String name);

    //Life
    Long getLife();
    void damage(Long damage) throws Exception;
    void restore(Long restore) throws Exception;

    //Attack
    Long getAttack();
    void setAttack(Long attack);
    void attack(RpgCharacter rpgCharacter) throws Exception;

    Backpack getBackpack();

}
