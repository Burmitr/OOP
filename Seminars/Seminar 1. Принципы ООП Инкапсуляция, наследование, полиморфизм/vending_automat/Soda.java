package vending_automat;

public class Soda extends Product{
    private String flavour;

    public Soda(String name, int cost, String flavour) {
        super(name, cost);
        this.flavour = flavour;
    }
}
}
