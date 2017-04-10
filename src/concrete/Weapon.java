package concrete;
public class Weapon {
    private int weaponId;
    private String weaponName;
    private String weaponStatus;

    public Weapon(int weaponId, String weaponName, String weaponStatus) {
        this.weaponId = weaponId;
        this.weaponName = weaponName;
        this.weaponStatus = weaponStatus;
    }

    
    public int getWeaponId() {
        return weaponId;
    }

    public void setWeaponId(int weaponId) {
        this.weaponId = weaponId;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getWeaponStatus() {
        return weaponStatus;
    }

    public void setWeaponStatus(String weaponStatus) {
        this.weaponStatus = weaponStatus;
    }
    
}
