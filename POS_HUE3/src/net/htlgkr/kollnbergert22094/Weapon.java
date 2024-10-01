package net.htlgkr.kollnbergert22094;

public class Weapon {

    //name;combatType;damageType;damage;speed;strength;value
    //Varscona;MELEE;SLASHING;11;3;5;4250
    private String name;
    private CombatType combatType;
    private DamageType damageType;
    private int damage;
    private int speed;
    private int strength;
    private int value;

    public Weapon(String name, CombatType combatType, DamageType damageType, int damage, int speed, int strength, int value) {
        this.name = name;
        this.combatType = combatType;
        this.damageType = damageType;
        this.damage = damage;
        this.speed = speed;
        this.strength = strength;
        this.value = value;
    }
}
