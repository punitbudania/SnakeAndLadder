package samplePackage;

public class SnakeAndLadder 
{
	public static void main(String[] args)
	{
		final int ladder = 1;
		final int snake = 2;
		int position = 0;
		
		while (position<100)
		{
			int dice = (int) Math.floor(Math.random()*100%6);
			int die = dice + 1;
			
			int check = (int) Math.floor(Math.random()*10)%3;
			switch (check)
			{
				case ladder:
					position += die;
					if (position>100)
					{
						position -= die;
					}
					break;
				case snake:
					position -= die;
					if (position<0)
					{
						position = 0;
					}
					break;
				default:
					position += 0;
			}
		}
		System.out.println("Position: " + position);
	}
}
