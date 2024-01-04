package ReflectionAPI;

import Annotations.MethodInfo;

@MethodInfo(author = "Tigran",dateOfCreation = 2024, purpose = "Created")
public class Person {
    private int id;
    private String name;

    public Person() {
    }

    public Person(int id, String name) {
        this.id = -1;
        this.name = "No name";
    }

    public void sayHello(){
        System.out.println("My name is " + this.name + " !");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
