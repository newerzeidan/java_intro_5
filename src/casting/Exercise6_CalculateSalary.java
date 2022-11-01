package casting;

public class Exercise6_CalculateSalary {
    public static void main(String[] args) {
        String salary1 = "5000";
        String salary2 = "6000.25";
        String salary3 = "4000.50";

        /*
        Task 1
        Find min and max salary

        Expected output:
        Min salary = $ 4000.50
        Max salary = $ 6000.25
         */


        double s1 = Double.parseDouble(salary1); //5000
        double s2 = Double.parseDouble(salary2); //6000.25
        double s3 = Double.parseDouble(salary3); // 4000.50

        double minSalary = Math.min(s3, Math.min(s1, s2));

        System.out.println("The Min Salary is = $ " + Math.min(Math.min(s1, s2), s3));
        System.out.println("The Max Salary is = $ " + Math.max(Math.max(s1, s2), s3));

        /*
        Calculate the 10 percent of the min salary

        Expected output:
        400.05
         */

        System.out.println(Math.min(s3, Math.min(s1, s2)) * 0.1);
        System.out.println(minSalary * 0.1);

    }
}
