import java.util.*;

class InsurancePolicy implements Comparable<InsurancePolicy> {
    private String policyNumber;
    private String policyHolderName;
    private Date expiryDate;
    private String coverageType;
    private double premiumAmount;

    public InsurancePolicy(String policyNumber, String policyHolderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    @Override
    public int compareTo(InsurancePolicy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        InsurancePolicy policy = (InsurancePolicy) obj;
        return policyNumber.equals(policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public String toString() {
        return "PolicyNumber: " + policyNumber + ", Holder: " + policyHolderName + ", Expiry: " + expiryDate + 
               ", Type: " + coverageType + ", Premium: $" + premiumAmount;
    }
}

public class InsurancePolicyManagement {
    private Set<InsurancePolicy> hashSetPolicies = new HashSet<>();
    private Set<InsurancePolicy> linkedHashSetPolicies = new LinkedHashSet<>();
    private Set<InsurancePolicy> treeSetPolicies = new TreeSet<>();

    public void addPolicy(InsurancePolicy policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    public void displayAllPolicies() {
        System.out.println("Policies in HashSet:");
        hashSetPolicies.forEach(System.out::println);
        
        System.out.println("\nPolicies in LinkedHashSet:");
        linkedHashSetPolicies.forEach(System.out::println);
        
        System.out.println("\nPolicies in TreeSet (Sorted by Expiry Date):");
        treeSetPolicies.forEach(System.out::println);
    }

    public void displayExpiringSoon(int days) {
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        cal.add(Calendar.DAY_OF_YEAR, days);
        Date threshold = cal.getTime();

        System.out.println("\nPolicies Expiring in Next " + days + " Days:");
        for (InsurancePolicy policy : treeSetPolicies) {
            if (policy.getExpiryDate().before(threshold)) {
                System.out.println(policy);
            }
        }
    }

    public void displayByCoverageType(String type) {
        System.out.println("\nPolicies of Coverage Type: " + type);
        for (InsurancePolicy policy : hashSetPolicies) {
            if (policy.getCoverageType().equalsIgnoreCase(type)) {
                System.out.println(policy);
            }
        }
    }

    public void removeExpiredPolicies() {
        Date now = new Date();
        treeSetPolicies.removeIf(policy -> policy.getExpiryDate().before(now));
        linkedHashSetPolicies.removeIf(policy -> policy.getExpiryDate().before(now));
        hashSetPolicies.removeIf(policy -> policy.getExpiryDate().before(now));
        System.out.println("\nExpired policies removed.");
    }

    public static void main(String[] args) {
        InsurancePolicyManagement system = new InsurancePolicyManagement();
        Calendar cal = Calendar.getInstance();

        cal.set(2025, Calendar.JUNE, 10);
        system.addPolicy(new InsurancePolicy("P1001", "Alice", cal.getTime(), "Health", 5000));

        cal.set(2024, Calendar.MARCH, 5);
        system.addPolicy(new InsurancePolicy("P1002", "Bob", cal.getTime(), "Auto", 3000));

        cal.set(2024, Calendar.FEBRUARY, 28);
        system.addPolicy(new InsurancePolicy("P1003", "Charlie", cal.getTime(), "Home", 4000));

        system.displayAllPolicies();
        system.displayExpiringSoon(30);
        system.displayByCoverageType("Auto");
        system.removeExpiredPolicies();
        system.displayAllPolicies();
    }
}
