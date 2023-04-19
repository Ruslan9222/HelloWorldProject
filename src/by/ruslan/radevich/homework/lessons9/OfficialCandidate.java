package by.ruslan.radevich.homework.lessons9;

import java.util.Random;

public class OfficialCandidate extends Voter {
    private int Voter;

    public OfficialCandidate() {

    }

    public void setVoter(int voter) {
        Voter = voter;
    }

    public int getVoter() {
        return Voter;
    }

    @Override
    public String toString() {
        return "OfficialCandidate{" +
                "Voter=" + Voter +
                "} " + super.toString();
    }

    public void candidate1() {
        Random candidate1 = new Random(Voter);
        for (Voter = 0; Voter < 100; Voter ++) {
            System.out.println("OfficialCandidate " + candidate1);
        }

    }
}
