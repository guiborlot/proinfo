package br.com.proinfo.domain.champion;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Champion {
    private String id;
    private String name;
    private String title;
    private String description;
    private ChampionInfo info;
    private String image;
    private String tags;
    private ChampionStats stats;

}

@AllArgsConstructor
@NoArgsConstructor
class ChampionInfo {
    private int attack;
    private int defense;
    private int magic;
    private int difficulty;
}

@AllArgsConstructor
@NoArgsConstructor
class ChampionStats {
    private int hp;
    private int hpPerLevel;
    private int mp;
    private int mpPerLevel;
    private int moveSpeed;
    private int armor;
    private double armorPerLevel;
    private int spellBlock;
    private double spellBlockPerLevel;
    private int attackRange;
    private int hpRegen;
    private double hpRegenPerLevel;
    private int mpRegen;
    private double mpRegenPerLevel;
    private double crit;
    private double critPerLevel;
    private double attackDamage;
    private double attackDamagePerLevel;
    private double attackSpeedPerLevel;
    private double attackSpeed;
}
