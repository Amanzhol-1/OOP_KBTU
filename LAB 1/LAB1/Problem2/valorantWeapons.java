package Problem2;

public class valorantWeapons {
	private static int totalWeapons = 0;
	
	private final String name;
    private final Types type;
    private final int damage;
    
    private double fireRate;
    
    {
    	totalWeapons++;
    }
    
    public valorantWeapons(String name, Types type, int damage) {
        this.name = name;
        this.type = type;
        this.damage = damage;
    }
    
    public valorantWeapons(String name, Types type, int damage, double fireRate) {
        this(name, type, damage);
        this.fireRate = fireRate;
    }
    
    public static int getTotalWeapons() {
        return totalWeapons;
    }

    
    public void displayWeaponInfo() {
        System.out.println("Weapon: " + name);
        System.out.println("Type: " + type);
        System.out.println("Damage: " + damage);
        if (fireRate > 0) {
            System.out.println("Fire Rate: " + fireRate + " rounds per second");
        }
    }
    
}
