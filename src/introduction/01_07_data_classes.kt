package introduction

//Rewrite the following Java code to Kotlin:
//public class introduction.Person {
//    private final String name;
//    private final int age;
//
//    public introduction.Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//}

data class Person (val name: String, val age: Int)

fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}