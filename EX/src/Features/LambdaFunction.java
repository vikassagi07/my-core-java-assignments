package Features;

interface  PrintSalary{
    double totalpay(int payperhour,int workingdays);
}


public class LambdaFunction {
    public static void main(String[] args) {
        PrintSalary salary= (payperhour,workingdays)->{return payperhour*workingdays*8;};
        System.out.println("pay per week");
        System.out.print("$");
        System.out.print(salary.totalpay(80, 5));

    }
}
