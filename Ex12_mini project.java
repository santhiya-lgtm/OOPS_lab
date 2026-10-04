import java.lang.*;

public class import java.util.*;
HelloWorld {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello, Welcome to 'Guess My Number Game'\n Here you will have to guess a number in minimum attempts"
				+ "\n \n\nChoose game Mode\n \nSingle Player:Press 1\n\nMultiplayer:Enter the number of players");
		int player = sc.nextInt();
		sc.nextLine();
		int guess,attempts;
		int scores[]=new int[player];
		String players[]=new String[player];
		for(int i=0;i<player;i++) {
			System.out.println("Enter the name of the "+(i+1)+" player");
			players[i]=sc.nextLine();
		}
		
		
		for(int i=0;i<player;i++) {
			attempts=0;
		int rn= (int)(Math.random()*100);
		do {
		System.out.println("Hey, Comm'on "+players[i]+", Enter your guess Number (0-100)");
		guess=sc.nextInt();
		attempts++;
		if(guess==rn) {
			System.out.println("Ahaan! you guess the number, GREAT !!!!");
			break;
		}
		else if(guess>rn) {
			System.out.println("You went high! Guess a Smaller Number");
		}
		else {
			System.out.println("Its Low, Buckle up and guess Higher Number");
		}
		}while(true);
		scores[i]=attempts;
		
		System.out.println("The number is "+rn+"\n"+players[i]+",You took "+attempts+"           
                                                                 attempts to guess\n\n\n\n");
		}
for(int i=0;i<player;i++) {
	System.out.println(players[i]+" took "+scores[i]+" attempts");
}

System.out.println("Thanks for playing 'Guess the Number Game' ");
}
}
