import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Policy implements Comparable<Policy> {
    String policyNumber, policyholder, coverageType;
    Date expiryDate;
    double premium;

    public Policy(String num, String holder, Date expiry, String type, double premium) {
        this.policyNumber = num;
        this.policyholder = holder;
        this.expiryDate = expiry;
        this.coverageType = type;
        this.premium = premium;
    }

    @Override
    public int compareTo(Policy p) {
        return this.expiryDate.compareTo(p.expiryDate);
    }

    @Override
    public String toString() {
        return policyNumber + " - " + policyholder + " - " + coverageType + " - " + expiryDate + " - $" + premium;
    }
}

class InsurancePolicyManager {
    Map<String, Policy> policyMap = new HashMap<>();
    Map<String, Policy> orderedPolicies = new LinkedHashMap<>();
    TreeMap<Date, Policy> sortedPolicies = new TreeMap<>();

    void addPolicy(Policy policy) {
        policyMap.put(policy.policyNumber, policy);
        orderedPolicies.put(policy.policyNumber, policy);
        sortedPolicies.put(policy.expiryDate, policy);
    }

    Policy getPolicy(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    List<Policy> getExpiringPolicies(Date today) {
        return new ArrayList<>(sortedPolicies.subMap(today, new Date(today.getTime() + 30L * 24 * 60 * 60 * 1000)).values());
    }

    List<Policy> getPoliciesByHolder(String holder) {
        List<Policy> result = new ArrayList<>();
        for (Policy p : policyMap.values()) {
            if (p.policyholder.equals(holder)) result.add(p);
        }
        return result;
    }

    void removeExpired(Date today) {
        sortedPolicies.headMap(today, true).clear();
        policyMap.values().removeIf(p -> p.expiryDate.before(today));
        orderedPolicies.values().removeIf(p -> p.expiryDate.before(today));
    }
}

public class InsuranceSystem {
    public static void main(String[] args) throws ParseException {
        InsurancePolicyManager manager = new InsurancePolicyManager();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // Adding policies
        manager.addPolicy(new Policy("P101", "Alice", sdf.parse("2024-03-15"), "Health", 500.0));
        manager.addPolicy(new Policy("P102", "Bob", sdf.parse("2024-04-10"), "Auto", 300.0));
        manager.addPolicy(new Policy("P103", "Alice", sdf.parse("2024-02-25"), "Home", 700.0));

        // Retrieve policy by number
        System.out.println("Policy P101: " + manager.getPolicy("P101"));

        // List policies expiring within next 30 days
        System.out.println("\nPolicies expiring soon:");
        for (Policy p : manager.getExpiringPolicies(new Date())) {
            System.out.println(p);
        }

        // List policies for a specific policyholder
        System.out.println("\nPolicies for Alice:");
        for (Policy p : manager.getPoliciesByHolder("Alice")) {
            System.out.println(p);
        }

        // Remove expired policies
        System.out.println("\nRemoving expired policies...");
        manager.removeExpired(new Date());

        // Display remaining policies
        System.out.println("\nRemaining policies:");
        for (Policy p : manager.policyMap.values()) {
            System.out.println(p);
        }
    }
}
