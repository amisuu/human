package pl.gda.wsb;

public class Footballer extends Person {
    private String club;
    private Position position;
    private int numberOfGoals;


    public Footballer(String name, String surname, String dateOfBirth, String club, Position position) {
        super(name, surname, dateOfBirth);
        this.club = club;
        this.position = position;
    }

    public void scoreAGoal(){
        numberOfGoals++;
        System.out.println("Gol dla Lechii, zdobyty przez: " + getSurname());
    }

    @Override
    public String toString(){
        return "Name and surname: " + getName() + " " + getSurname() +
                ", date of birth: " + getDateOfBirth() + "." + " Footballer's club: " +
                club + ", position: " + position + ", Number of goals: " + numberOfGoals;
    }
}


