package by.ruslan.radevich.homework.lessons9;

import java.util.Random;

public class IllegalCandidate extends Voter{
    private int Voter;

    public IllegalCandidate() {
    }

    public void setVoter(int voter) {
        Voter = voter;
    }

    public int getVoter() {
        return Voter;
    }

    @Override
    public String toString() {
        return "IllegalCandidate{" +
                "Voter=" + Voter +
                "} " + super.toString();
    }

    public void candidate2() {
        Random candidate2 = new Random(Voter);
        for (Voter = 0; Voter < 100; Voter ++) {
            System.out.println("OfficialCandidate " + candidate2);
        }

    }
}
