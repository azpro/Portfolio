package main.java.com.azpro;

public class Balance {
    private String currency;
    private float available;
    private float reserved;

    public float getAvailable() {
        return available;
    }

    public String toString(){return super.toString()+"Currency: "+currency+" | Available: "+available+" | reserved: "+reserved;}

}
