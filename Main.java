package org.gameloft.second;

public class Main
{
    // Main.java
    // Mage.java
    // Npc.java
    // Controller.java

    // combat log
    // mage casts some spell on npc
    // npc fights back

    public static void main(String[] args)
    {
        Mage Jimmy = new Mage("Jimmy", 10, 'A', 2, 1);
        Npc Wolf = new Npc( "Wolf", 5, 'B', 1, 1  );

        Controller.funcDisplayResultOfAttack( Controller.funcMageAttack(Wolf.npcHp, Jimmy.mageDmg) );


















    }
}
