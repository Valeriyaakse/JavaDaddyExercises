package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task2_TreeSet.subtask4_Books;

import java.util.TreeSet;

public class BookSetDemo {
    public static void main(String[] args) {
        TreeSet<Book> treeSet = new TreeSet<>();
        Book book1 = new Book("Война и мир", 1869);
        Book book2 = new Book("Преступление и наказание", 1866);
        Book book3 = new Book("Муму", 1852);
        treeSet.add(book1);
        treeSet.add(book2);
        treeSet.add(book3);
        System.out.println(treeSet);
    }
}
