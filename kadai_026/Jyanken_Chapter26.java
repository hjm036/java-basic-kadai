package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	private Scanner scanner = new Scanner(System.in);
	
	public String getMyChoice() {
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのsを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		String choice = scanner.nextLine();
		
		return choice;
		
	}
	
	public String getRandom() {
        String[] yourChoices = {"r", "s", "p"};
        int i = (int) Math.floor(Math.random() * 3);

		switch (i) {
		case 0:
			return yourChoices[0];
		case 1:
			return yourChoices[1];
		case 2:
			return yourChoices[2];
		default:
			return "";
		}
    }

	public void playGame() {

		HashMap<String, String> hand = new HashMap<String, String>();


		hand.put("r", "グー");
		hand.put("s", "チョキ");
		hand.put("p", "パー");

		String myHand = getMyChoice();

		String yourChoice = getRandom();

		System.out.println("自分の手は" + hand.get(myHand) + "対戦相手の手は" + hand.get(yourChoice));

		if (myHand.equals(yourChoice)) {
			System.out.println("あいこです");
		} else if (myHand.equals("r")) {
			if (yourChoice.equals("s")) {
				System.out.println("自分の勝ちです");
			} else {
				System.out.println("自分の負けです");
			}
		} else if (myHand.equals("s")) {
			if (yourChoice.equals("p")) {
				System.out.println("自分の勝ちです");
			} else {
				System.out.println("自分の負けです");
			}
		} else if (myHand.equals("p")) {
			if (yourChoice.equals("r")) {
				System.out.println("自分の勝ちです");
			} else {
				System.out.println("自分の負けです");
			}
		} else {
			System.out.println("無効な入力です");
			
			}
	}

}

