public class Main {

    public static void main(String[] args) {
        Cohort13 ore = new Cohort13("Ade", "Sam", "SamAde");
        Cohort13 smile = new Cohort13("Smile1", "Smile2", "Smile3", 5.1,"orange",12);
        Cohort13 michael = new Cohort13();

        michael.setName("Mic", "David");
        String fullName = ore.getFirstName() +" "+ ore.getOtherName() +" "+ ore.getLastName();
        String michaelFullName = michael.getName();


        System.out.println(fullName);
        System.out.println(smile.getClass());
        System.out.println(ore.getHeight());
        System.out.println(ore.getColor());
        System.out.println(michaelFullName);

    }


}
