public class EmployeeProcedural {
    public static void main(String[] args) {
        double[] salaries = {35000.5, 42000.0, 28000.75, 50000.25};
        double max = salaries[0];
        for(int x=1; x<salaries.length; x++){
            if(salaries[x] > max){
                max = salaries[x];
            }
        }
        System.out.println("Highest Salary = " + max);
    }
}
