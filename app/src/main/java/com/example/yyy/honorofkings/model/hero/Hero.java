package com.example.yyy.honorofkings.model.hero;

import com.example.yyy.honorofkings.model.spell.herospell.HeroSpell;
import com.example.yyy.honorofkings.model.spell.summonerspell.SummonerSpell;

/**
 * Created by yyy on 2018/3/1.
 * 英雄的父类
 */

public class Hero {

    // 召唤师技能
    protected SummonerSpell summonerSpell;

    // TODO 英雄技能 暂时假设只携带一个英雄技能
    protected HeroSpell heroSpell;

    public void releaseHeroSpell(){
        heroSpell.release();
    }

    public void releaseSummonerSpell(){
        summonerSpell.release();
    }
}
