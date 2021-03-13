import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Officer firstOfficer = new Officer("Eriks", "White", 22, 3);
        Officer secondOfficer = new Officer("David", "Black", 66, 32);
        Officer thirdOfficer = new Officer("Jack", "Red", 23, 5);
        Officer fourthOfficer = new Officer("Joe", "Reed", 90, 99);
        Officer fifthOfficer = new Officer("Nick", "Blue", 38, 41);
        Officer sixthOfficer = new Officer("Karl", "Logger", 19, 15);
        Officer seventhOfficer = new Officer("Rick", "Rock", 65, 65);

        District first = new District("Crime", "New York", 3, new Officer[0]);
        District second = new District("Investigation", "Los Angeles", 55, new Officer[0]);

        Lawyer lawyerOne = new Lawyer("Jana", "Steel", 3, 15);
        Lawyer lawyerTwo = new Lawyer("Daniel", "Bolt", 9, 7);

        first.addNewOfficer(firstOfficer);
        first.addNewOfficer(secondOfficer);
        first.addNewOfficer(thirdOfficer);

        second.addNewOfficer(fourthOfficer);
        second.addNewOfficer(fifthOfficer);
        second.addNewOfficer(sixthOfficer);
        second.addNewOfficer(seventhOfficer);

        System.out.println(first);
        System.out.println(second);
        System.out.println();
        System.out.println("First lawyer is " + lawyerOne);
        System.out.println("Second lawyer is " + lawyerTwo);

        ArrayList<Lawyer> allLawyers = new ArrayList<>();
        allLawyers.add(lawyerOne);
        allLawyers.add(lawyerTwo);

        int solvedCrimes = 0;
        for (Lawyer lawyer : allLawyers) {
            solvedCrimes = lawyer.getHelpedInCrimesSolving() + solvedCrimes;
        }
        System.out.println("The total number of solved crimes with lawyers help is: " + solvedCrimes);

        for (Lawyer lawyer : allLawyers) {
            if (lawyerOne.getHelpedInCrimesSolving() > lawyerTwo.getHelpedInCrimesSolving()) {
                System.out.println("First lawyer has helped the most to solve crimes");
                break;
            } else if (lawyerOne.getHelpedInCrimesSolving() < lawyerTwo.getHelpedInCrimesSolving()) {
                System.out.println("Second lawyer has helped the most to solve crimes");
                break;
            } else if (lawyerOne.getHelpedInCrimesSolving() == lawyerTwo.getHelpedInCrimesSolving()) {
                System.out.println("Both lawyers have the same score in helping solve crimes");
                break;
            }
        }


    }
}