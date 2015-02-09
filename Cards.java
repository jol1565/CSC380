import java.util.*;


public class Cards extends ArrayList{
	public List<String> suits = Arrays.asList("Hearts", "Diamonds", "Clubs", "Spades");
	public List<String> card = Arrays.asList("Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King");
	public List<Integer> value = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10);
	public List<Cards> deck = new ArrayList<Cards>();
	public String suit;
	public String cardType;
	public int val;
	
	
	public Cards(int numberOfDecks){
		for (int i=0;i<numberOfDecks;i++){
			for (int j=0;j<4;j++)
				for (int k=0;k<13;k++)
						deck.add(new Cards(suits.get(j), card.get(k), value.get(k)));
				}
		Collections.shuffle(deck);
		}
	public Cards(String s, String c, int v){
		suit = s;
		cardType = c;
		val = v;
	}
	public Cards(){
		
	}
	
	public int getCardVal(int i){
		Cards one = deck.get(i);
		return one.val;
		
	}
	public String getCardSuit(int i){
		Cards one = deck.get(i);
		return one.suit;
	}
	public String getCardType(int i){
		Cards one = deck.get(i);
		return one.cardType;
	}
	
}
