package com.example.yyy.honorofkings.model.spell.herospell.direnjie;

import android.util.Log;

import com.example.yyy.honorofkings.model.spell.herospell.HeroSpell;

/**
 * Created by yyy on 2018/3/1.
 * TODO
 * 六令追凶，狄仁杰的一技能
 */

public class LiuLingZhuiXiong implements HeroSpell {

    @Override
    public void release() {
        // 技能效果
        Log.d("fuck111","狄仁杰甩出六道令牌（可触发普攻法球效果），对命中的目标造成物理伤害和法术伤害（蓝牌伤害减半），蓝牌可对目标造成额外减速，同一目标受到多发红蓝牌伤害后续伤害衰减70%。");
    }
}
