package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task1_Pair;

public class PairDemo {
    public static void main(String[] args) {
        Pair<String,String> pair = new Pair<>("Hello", "dear mentor");
        System.out.println(pair.toString());
        System.out.println(pair.getFirst() + " " + pair.getSecond());
        pair.setFirst("Goodbye");
        pair.setSecond("sweetie");
        System.out.println(pair.getFirst() + " "+ pair.getSecond());
    }
}
