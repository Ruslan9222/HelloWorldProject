package by.ruslan.radevich.homework.lessons9;

import java.util.Random;

public class RandomCandidate extends Voter{
    private int Voter;

    public RandomCandidate() {
    }

    public void setVoter(int voter) {
        Voter = voter;
    }

    public int getVoter() {
        return Voter;
    }

    @Override
    public String toString() {
        return "RandomCandidate{" +
                "Voter=" + Voter +
                "} " + super.toString();
    }

    public void candidate3() {
        Random candidate3 = new Random(Voter);
        for (Voter = 0; Voter < 100; Voter ++) {
            System.out.println("OfficialCandidate " + candidate3);
        }

    }

}
