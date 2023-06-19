package by.ruslan.radevich.homework.lessons9;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        OfficialCandidate official = new OfficialCandidate();
        IllegalCandidate illegal = new IllegalCandidate();
        RandomCandidate random = new RandomCandidate();
        Voter[] voters = new Voter[100];
        Random randomGenerator = new Random();

        for (int i = 0; i < voters.length; i++) {
            voters[i] = new Voter();
            voters[i].vote(randomGenerator.nextInt(100) + 1, official, illegal, random);
        }

        System.out.println("Official Candidate votes: " + official.getVotes());
        System.out.println("Illegal Candidate votes: " + illegal.getVotes());
        System.out.println("Random Candidate votes: " + random.getVotes());

    }
}