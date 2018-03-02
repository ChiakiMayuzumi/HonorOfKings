package com.example.yyy.honorofkings.model.hero;

import com.example.yyy.honorofkings.model.spell.herospell.HeroSpell;
import com.example.yyy.honorofkings.model.spell.summonerspell.SummonerSpell;

/**
 * Created by yyy on 2018/3/1.
 * 英雄：狄仁杰
 * 定位：射手
 */

public class DiRenJie extends Hero {

    /**
     * TODO
     * @param summonerSpell
     * @param heroSpell
     */
    public DiRenJie(SummonerSpell summonerSpell, HeroSpell heroSpell) {
        this.summonerSpell = summonerSpell;
        this.heroSpell = heroSpell;
    }

    /**
     *
     * @param summonerSpell
     */
    public void setSummonerSpell(SummonerSpell summonerSpell){

    }

    /**
     *
     * @param heroSpell
     */
    public void setHeroSpell(HeroSpell heroSpell){

    }
}
