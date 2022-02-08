package challenge;
import java.util.Random;
public class TossCoin {
	public String tossAcoin() {
		Random rand =new Random();
		int toss=Math.abs((rand.nextInt())%2);
		if (toss==0) {
			return "Head";
		}else {
			return "Tail";
		}
	}


public static void main(String[]args){
	TossCoin game=new TossCoin();
	System.out.println(game.tossAcoin());
	System.out.println(game.tossAcoin());
	System.out.println(game.tossAcoin());
	System.out.println(game.tossAcoin());
}
}