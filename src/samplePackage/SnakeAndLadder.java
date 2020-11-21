package samplePackage;

public class SnakeAndLadder 
{
	public static void main(String[] args)
	{
		final int ladder = 1;
		final int snake = 2;
		int playerA = 0;
		int playerB = 0;
		int unit = 1;
		String player = "no one";
		boolean found = false;
		
		while(!found)
		{
			int dice = (int) Math.floor(Math.random()*100%6);
			int die = dice + 1;
		
			if (unit==1)
			{
				unit=2;
				int check = (int) Math.floor(Math.random()*10)%3;
				switch (check)
				{
					case ladder:
						playerA += die;
						if (playerA>100)
						{
							playerA -= die;
						}
						unit=1;
						break;
					case snake:
						playerA -= die;
						if (playerA<0)
						{
							playerA = 0;
						}
						break;
					default:
						playerA += 0;
				}
				player = "playerA";
				if (playerA==100)
				{
					found = true;
				}
			}
			
			else
			{
				unit=1;
				int check = (int) Math.floor(Math.random()*10)%3;
				switch (check)
				{
					case ladder:
						playerB += die;
						if (playerB>100)
						{
							playerB -= die;
						}
						unit=2;
						break;
					case snake:
						playerB -= die;
						if (playerB<0)
						{
							playerB = 0;
						}
						break;
					default:
						playerB += 0;
				}
				player = "playerB";
				if (playerB==100)
				{
					found = true;
				}
			}
		}
		
		System.out.println(player + " won the game");
	}
}
