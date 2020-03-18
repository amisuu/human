package pl.gda.wsb;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private String surname;
    private String dateOfBirth;

    public Person(String name, String surname, String dateOfBirth){
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public String getDateOfBirth(){
        return this.dateOfBirth;
    }

    @Override
    public String toString(){
        return "Name and surname: " + name + " " + surname + ", " + "date of birth: " + dateOfBirth;
    }

    public void howManyYears(){
        LocalDate today = LocalDate.now();
        LocalDate born = LocalDate.parse(dateOfBirth);
        //Duration duration = Duration.between(born.atStartOfDay(), today.atStartOfDay());
        Period period = Period.between(born, today);
        if ((today.getYear()%4==0 && today.getYear()%100!=0) || today.getYear()%400==0)
        {
            System.out.println(surname + " " + period.getYears() + " years old.");
        }
        else {
            System.out.println(surname + " " + period.getYears() + " years old.");
        }
    }
}
