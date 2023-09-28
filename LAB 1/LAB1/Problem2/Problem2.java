package Problem2;
public class Problem2 {

	public static void main(String[] args) {
		valorantWeapons weapon1 = new valorantWeapons("Phantom", Types.RIFLE, 30, 0.2);
        valorantWeapons weapon2 = new valorantWeapons("Ghost", Types.PISTOL , 15);
        valorantWeapons weapon3 = new valorantWeapons("KINGDOM", Types.KNIFE , 50);

        weapon1.displayWeaponInfo();
        weapon2.displayWeaponInfo();
        weapon3.displayWeaponInfo();
        System.out.println("Total Valorant weapons: " + valorantWeapons.getTotalWeapons());
 
	}
}
