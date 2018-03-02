package com.example.yyy.honorofkings.model.spell.summonerspell;

import android.util.Log;

import java.util.logging.Logger;

/**
 * Created by yyy on 2018/3/1.
 * 召唤师技能：闪现
 */

public class FlashSummonerSpell implements SummonerSpell {

    @Override
    public void release() {
        // 技能效果
        Log.d("fuck111", "闪现");
    }
}
