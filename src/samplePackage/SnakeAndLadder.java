package samplePackage;

public class SnakeAndLadder 
{
	public static void main(String[] args)
	{
		int position = 0;
		int dice = (int) Math.floor(Math.random()*100%6);
		int die = dice + 1;
		position += die;
		System.out.println("Position: " + position);
	}
}
