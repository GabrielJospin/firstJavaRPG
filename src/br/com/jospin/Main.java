package br.com.jospin;

import br.com.jospin.character.Human;
import br.com.jospin.character.RpgCharacter;
import br.com.jospin.itens.Backpack;
import br.com.jospin.itens.swords.Sword;
import com.sun.xml.internal.ws.util.pipe.DumpTube;

public class Main {

    public static void main(String[] args) {

        RpgCharacter character = new Human("Carlos",20L,10L);
        try {
            character.getBackpack().insertItem(new Sword("Agulha"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(character);

        character = new Human("Carlos",21L,11L,new Backpack(20.0));
        try {
            character.getBackpack().insertItem(new Sword("Agulha"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(character);
        

    }
}
