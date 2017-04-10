
package abs;

public abstract class WeaponData {
    private int weaponId;
    private String weaponName;
    private String weaponStatus;

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
