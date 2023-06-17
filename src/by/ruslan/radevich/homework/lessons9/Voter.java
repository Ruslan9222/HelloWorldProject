package by.ruslan.radevich.homework.lessons9;

public class Voter {
    public void vote(int number, OfficialCandidate official, IllegalCandidate illegal, RandomCandidate random) {
        if (number % 3 == 0) {
            official.addVote();
        } else if (number % 3 == 1) {
            illegal.addVote();
        } else {
            random.addVote();
        }
    }
}
