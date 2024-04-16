public class Cube {
    private int volume, edgeLenght;

    public Cube(int edgeLenght) {
        this.edgeLenght = edgeLenght;
        this.volume = this.volume();
    }

    public int volume() {
        this.volume = edgeLenght * edgeLenght * edgeLenght;
        return this.volume;
    }

    public String toString() {
        return "The lenght of the edge is " + this.edgeLenght + " and the volume " + this.volume;
    }
}
