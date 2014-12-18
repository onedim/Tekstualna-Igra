/**
 * tekstualna igra sa zombijima
 * @author nedimomerovic
 *
 */



public class Character {

	private String name;
	private double hp;
	private double dex;
	private double weapon;
	private double strength;
	private double speed;
	
	
	public double normAttack(double damage){
		damage=weapon+strength;
		return damage;
		
	}
	
	public double specAttack(double damage){
		damage=weapon+strength;
		return damage;
	}
	

}
