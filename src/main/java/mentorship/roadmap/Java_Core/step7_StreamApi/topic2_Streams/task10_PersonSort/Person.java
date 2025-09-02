package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task10_PersonSort;

public class Person {
        private String name;
        private int age;

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "name: " + getName() + " age: " + getAge();
        }



}
