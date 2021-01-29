package Card;

public class CardCompany {

    private static CardCompany instance = new CardCompany();

    private CardCompany(){}

    public static CardCompany getInstance(){

        if(instance == null){
            instance = new CardCompany();
            return instance;
        }

        return instance;
    }

    public Card createCard(){
        Card card = new Card();
        return card;
    }

}
