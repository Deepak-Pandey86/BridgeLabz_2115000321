import java.util.*;

class VotingSystem {
    private Map<String, Integer> voteCount = new HashMap<>();
    private Map<String, Integer> voteOrder = new LinkedHashMap<>();

    // Cast a vote
    void castVote(String candidate) {
        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, voteOrder.getOrDefault(candidate, 0) + 1);
    }

    // Display results sorted by candidate name (TreeMap)
    void displaySortedResults() {
        TreeMap<String, Integer> sortedVotes = new TreeMap<>(voteCount);
        System.out.println("\nElection Results (Sorted by Candidate Name):");
        for (Map.Entry<String, Integer> entry : sortedVotes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }

    // Display results in vote order (LinkedHashMap)
    void displayVoteOrder() {
        System.out.println("\nVote Order (First Come, First Counted):");
        for (Map.Entry<String, Integer> entry : voteOrder.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }

    // Display results sorted by highest votes (Descending order)
    void displaySortedByVotes() {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(voteCount.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue())); // Sort by votes descending

        System.out.println("\nElection Results (Sorted by Votes):");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }
}

public class VotingApp {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        // Casting votes
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");

        // Display results
        votingSystem.displaySortedResults();  // TreeMap (Alphabetical order)
        votingSystem.displayVoteOrder();      // LinkedHashMap (Insertion order)
        votingSystem.displaySortedByVotes();  // Sorted by highest votes
    }
}
