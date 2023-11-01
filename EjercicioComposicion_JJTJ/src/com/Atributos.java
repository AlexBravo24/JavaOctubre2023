package com;

public class Atributos {
	
	private int nivel;
	private int hp;
	private int stamina;
	private int mana;
	private int swordskill;
	private int Shielding;
	private int fishing;
	private int lucky;

	public Atributos() {}

	public Atributos(int nivel, int hp, int stamina, int mana, int swordskill, int shielding, int fishing, int lucky) {
		super();
		this.nivel = nivel;
		this.hp = hp;
		this.stamina = stamina;
		this.mana = mana;
		this.swordskill = swordskill;
		Shielding = shielding;
		this.fishing = fishing;
		this.lucky = lucky;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getSwordskill() {
		return swordskill;
	}

	public void setSwordskill(int swordskill) {
		this.swordskill = swordskill;
	}

	public int getShielding() {
		return Shielding;
	}

	public void setShielding(int shielding) {
		Shielding = shielding;
	}

	public int getFishing() {
		return fishing;
	}

	public void setFishing(int fishing) {
		this.fishing = fishing;
	}

	public int getLucky() {
		return lucky;
	}

	public void setLucky(int lucky) {
		this.lucky = lucky;
	}

	@Override
	public String toString() {
		return "Atributos [nivel=" + nivel + ", hp=" + hp + ", stamina=" + stamina + ", mana=" + mana + ", swordskill="
				+ swordskill + ", Shielding=" + Shielding + ", fishing=" + fishing + ", lucky=" + lucky + "]";
	}

	
}