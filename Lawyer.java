public class Lawyer extends Person {
    public int lawyerID;
    public int helpedInCrimesSolving;

    public Lawyer(String name, String surname, int lawyerID, int helpedInCrimesSolving) {
        super(name, surname);
        this.lawyerID = lawyerID;
        this.helpedInCrimesSolving = helpedInCrimesSolving;
    }

    public String toString() {
        return "Name- " + name + "; Surname- " + surname + "; Lawyers ID-" + lawyerID +
                "; Helped solve crimes- " + helpedInCrimesSolving;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    public int getLawyerID() {
        return lawyerID;
    }

    public void setLawyerID(int lawyerID) {
        this.lawyerID = lawyerID;
    }

    public int getHelpedInCrimesSolving() {
        return helpedInCrimesSolving;
    }

    public void setHelpedInCrimesSolving(int helpedInCrimesSolving) {
        this.helpedInCrimesSolving = helpedInCrimesSolving;
    }

}
