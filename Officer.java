public class Officer extends Person {

    public int officerID;
    public int crimesSolved;

    public Officer(String name, String surname, int officerID, int crimesSolved) {
        super(name, surname);
        this.officerID = officerID;
        this.crimesSolved = crimesSolved;
    }

    public Officer() {
    }

    public String toString() {
        return "Name- " + name + "; Surname- " + surname + "; Officers ID- " + officerID +
                "; Number of solved crimes is- " + crimesSolved;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    public void setOfficerID(int officerID) {
        this.officerID = officerID;
    }

    public Integer getOfficerID() {
        return officerID;
    }

    public void setCrimesSolved(int crimesSolved) {
        this.crimesSolved = crimesSolved;
    }

    public Integer getCrimesSolved() {
        return crimesSolved;
    }

    //public void printDetails() {
    //System.out.println("Name:" + getName() + "; Surname:" + getSurname() + "; Officer ID:" + getOfficerID() +
    //       "; Working district:" + "; Number of solved crimes:" + getCrimesSolved());
    // }

    public int calculatedLevel() {
        if (crimesSolved >= 0 && crimesSolved <= 20) {
            return 1;
        }
        if (crimesSolved >= 21 && crimesSolved <= 40) {
            return 2;
        }
        if (crimesSolved >= 41) {
            return 3;
        } else {
            return 0;
        }

    }
}
