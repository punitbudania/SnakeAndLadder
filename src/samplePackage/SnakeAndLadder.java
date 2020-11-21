package samplePackage;

public class SnakeAndLadder 
{
	public static void main(String[] args)
	{
		int position = 0;
		int dice = (int) Math.floor(Math.random()*100%6);
		int die = dice + 1;
		
		final int ladder = 1;
		final int snake = 2;
		int check = (int) Math.floor(Math.random()*10)%3;
		System.out.println(check);
		switch (check)
		{
			case ladder:
				position += die;
				break;
			case snake:
				position -= die;
				break;
			default:
				position += 0;
		}
		
		System.out.println("Position: " + position);
	}
}
