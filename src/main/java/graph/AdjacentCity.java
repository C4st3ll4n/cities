package graph;

public class AdjacentCity {
    private City cidade;
    private int distance;
    private int starDistance;

    public AdjacentCity(City cidade, int distance) {
        this.cidade = cidade;
        this.distance = distance;
        this.starDistance = Math.round(this.cidade.getDistanceToDestiny() + this.distance);
    }

    public int getStarDistance() {
        return starDistance;
    }

    public City getCidade() {
        return cidade;
    }

    public void setCidade(City cidade) {
        this.cidade = cidade;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
