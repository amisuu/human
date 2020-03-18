package pl.gda.wsb;

public class Student extends Person {
    private int yearOfStudy;
    private int group;
    private int indexNumber;

    public Student(String name, String surname, String dateOfBirth, int yearOfStudy, int group, int indexNumber){
        super(name, surname,dateOfBirth);
        this.yearOfStudy = yearOfStudy;
        this.group = group;
        this.indexNumber = indexNumber;
    }

    @Override
    public String toString(){
        return "Name and surname: " + getName() + " " + getSurname() +
                ", date of birth: " + getDateOfBirth() + "." + " Student index number: " +
                indexNumber + ", year of study: " + yearOfStudy + ", group: " + group;
    }
}
