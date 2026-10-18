public class MembershipValidator {
    public boolean validate(int memberId) {
        System.out.println("Validating membership for member ID: " + memberId);
        return memberId > 0;
    }
}
