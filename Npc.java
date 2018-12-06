package org.gameloft.second;

public class Npc
{
    String npcName;
    double npcHp;
    char npcAttack;
    double npcDmg;
    int npcLvl;

    Npc( String varNpcName, double varNpcHp, char varNpcAttack, double varNpcDmg, int varNpcLvl )
    {
        this.npcName = varNpcName;
        this.npcHp = varNpcHp;
        this.npcAttack = varNpcAttack;
        this.npcDmg = varNpcDmg;
        this.npcLvl = varNpcLvl;
    }

}
