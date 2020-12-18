
import java.util.*;
import java.lang.*;
import java.io.*;

interface Vehicle{
	void changingGear(int modifiedgear);
	void speedingUp(int speedup);
	void braking(int speeddown);
	int getGear();
	int getSpeed();
}

class Bike implements Vehicle
{
	int gear;
	int speed;
	public void changingGear(int modifiedgear)
	{
		this.gear = modifiedgear;
	}
	public void speedingUp(int speedup)
	{
		this.speed = speed + speedup;
	}
	public void braking(int speeddown)
	{
		this.speed = speed - speeddown;
	}
	public int getGear(){
		return gear;
	}
	public int getSpeed(){
		return speed;
	}

}

class Car implements Vehicle
{
	int gear;
	int speed;
	public void changingGear(int modifiedgear){
	this.gear = modifiedgear;
	}
	public void speedingUp(int speedup)
	{
		this.speed = speed + speedup;
	}
	public void braking(int speeddown)
	{
		this.speed = speed - speeddown;
	}
	public int getGear(){
		return gear;
	}
	public int getSpeed(){
		return speed;
	}
}

class Interfaceimplement{
	public static void main (String[] arge){
		Vehicle bike = new Bike();
		Vehicle car = new Car();
		Scanner in = new Scanner(System.in);
		System.out.println ("Bike started.");
		System.out.println ("Tell me the gear of the bike");
    	int gear = in.nextInt ();
    	System.out.println ("How much speed should be increased?");
    	int increment = in.nextInt ();
    	System.out.println ("How much speed should be decreased?");
    	int decrement = in.nextInt ();
		bike.changingGear(gear);
		bike.speedingUp(increment);
		bike.braking(decrement);
		System.out.println("Bike Gear : " + bike.getGear() + "   Bike Speed : " + bike.getSpeed());
		System.out.println ("Car started.");
		System.out.println ("Tell me the gear of the bike");
    	int cgear = in.nextInt ();
    	System.out.println ("How much speed should be increased?");
    	int cincrement = in.nextInt ();
    	System.out.println ("How much speed should be decreased?");
    	int cdecrement = in.nextInt ();
		car.changingGear(cgear);
		car.speedingUp(cincrement);
		car.braking(cdecrement);
		System.out.println("Car Gear : " + car.getGear() + "   Car Speed : " + car.getSpeed());
	}
}











