package sg.edu.nus.iss;

public class card {
    private String suit;
    private String face;
    private Integer value;

    public card(String suit,String face,Integer value){
        this.suit = suit;
        this.face = face;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public String getFace() {
        return face;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return getFace() + " of " + getSuit();
    }
    
}
