package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task2_TreeSet.subtask4_Books;

public class Book implements Comparable {
    private String title;
    private int year;
    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    @Override
    public int compareTo(Object o) {
        if (this == o)  return 0;
//        if (o != null && o.getClass() != this.getClass()) {
//            break;
       // }
        Book another = (Book) o;
        return this.year - another.year;
    }

    @Override
    public String toString() {
        return title + " " + year;
    }
}
