package ca.pitt.demo.quarkus.dto;

public class Calculation {
    
    private String x;

    private String y;

    private String op;

    public Calculation() {
        // Do nothing.
    }

    public Calculation(String x, String y, String op) {
        this.x = x;
        this.y = y;
        this.op = op;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }
    

}
