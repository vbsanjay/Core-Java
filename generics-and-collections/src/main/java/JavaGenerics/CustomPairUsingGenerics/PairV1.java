package JavaGenerics.CustomPairUsingGenerics;

public class PairV1 {
    double fist;
    double second;

    public PairV1(double fist, double second) {
        this.fist = fist;
        this.second = second;
    }
}

class PairV2 {
    // List<PairV2> pairs = {new Pair("Hi", "Hello"), new Pair(2, "Hello"), new Pair(30, 40.5)}
    Object first;
    Object second;

    public PairV2(Object first, Object second) {
        this.first = first;
        this.second = second;
    }
}




