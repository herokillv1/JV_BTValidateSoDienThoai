public class NumberMobileTest {
    private static NumberMobile numberMobile;
    public static final String[] validNumberMobile = new String[] {"(84)-(0978489648)"};
    public static final String[] invalidNumberMobile = new String[] {"(a8)-(22222222)"};

    public static void main(String[] args) {
        numberMobile = new NumberMobile();
        for (String email : validNumberMobile) {
            boolean isvalid = numberMobile.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
        for (String email : invalidNumberMobile) {
            boolean isvalid = numberMobile.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
    }
}
