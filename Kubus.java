public class Kubus {
    public double edgeA;
    public double edgeB;
    public double edgeC;

    public double luasP () {
        return 2*(edgeA + edgeB + edgeC);
    }
    public double vol() {
        return edgeA * edgeB * edgeC;
    }
}
