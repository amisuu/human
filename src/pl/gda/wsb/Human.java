package pl.gda.wsb;

import java.text.ParseException;

public class Human {
    public static void main(String[] args) throws ParseException {
        Person person1 = new Person("Janusz", "Kowalski", "1975-10-06");
        Person person2 = new Student("Konrad", "Nowak", "1999-02-14", 5, 1, 69856);
        Person person3 = new Footballer("Flavio", "Paixao", "1984-09-19", "Lechia Gdańsk", Position.atacker);

        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());

        Student student1 = new Student("Jan", "Kowalski", "1965-06-30", 1, 2, 658965);
        Footballer footballer1 = new Footballer("Michał", "Nalepa", "1993-01-22", "Lechia Gdańsk", Position.defender);

        System.out.println(student1.toString());
        System.out.println(footballer1.toString());

        ((Footballer)person3).scoreAGoal();
        ((Footballer)person3).scoreAGoal();
        footballer1.scoreAGoal();

        System.out.println(person3.toString());
        System.out.println(footballer1.toString());

        person1.howManyYears();
        footballer1.howManyYears();
    }
}
