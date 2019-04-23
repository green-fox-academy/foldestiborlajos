import java.util.HashMap;

public class Aircraft {
 protected int ammo;
 protected int maxAmmo;
 protected int baseDamage;
 protected String type;
 protected int damage;

  public Aircraft() {
    this.ammo = 0;
    this.damage = 0;
  }

  public int fight (Aircraft anotherAircraft){
    this.setDamage( this.getAmmo()* anotherAircraft.getBaseDamage());
    this.setAmmo(0);
    return this.getDamage();
  }

  public int refill(int ammoToFill) {
    int remainderAmmo;
    if (ammoToFill >= maxAmmo){
      maxAmmo = ammoToFill;
      remainderAmmo = 0;
    }else{
      this.setAmmo(maxAmmo);
     remainderAmmo = ammoToFill - this.maxAmmo;
    }
    return remainderAmmo;
  }

  public String getType() {
    return type;
  }

  public String getStatus() {
    return this.getType() + " ammo: " + getAmmo() + " base damage: " + getBaseDamage() + " Alldamage: " + getDamage();
  }

  public boolean isPriority(){
    if (this.getType().equals("F15")){
      return false;
    }else {
      return true;
    }
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public int getAmmo() {
    return ammo;
  }

  public int getDamage() {
    return damage;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }

  public void setAmmo(int ammo) {
    this.ammo = ammo;
  }
}
