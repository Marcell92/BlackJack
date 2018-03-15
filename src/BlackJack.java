
public class BlackJack {

	static int ReturnCard(int card1, int card2) {

		if (card1 > card2 && card1 <= 21) {

			return card1;
		}

		else if (card2 > card1 && card2 <= 21) {

			return card2;
		}

		else if (card1 > 21 && card2 <= 21) {

			return card2;
		}

		else if (card2 > 21 && card1 <= 21) {

			return card1;
		}

		else if (card1 == card2) {
			return card1;
		}

		else {

			return 0;
		}
	}
}
