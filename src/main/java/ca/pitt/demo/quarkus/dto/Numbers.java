package ca.pitt.demo.quarkus.dto;

public class Numbers {
    private Double x;

    private Double y;

    public Numbers(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }
}
