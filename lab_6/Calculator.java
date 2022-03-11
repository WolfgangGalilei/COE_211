import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

    public Calculator() {

        Scanner scanCalc = new Scanner(System.in);
System.out.print("Input the first number: ");
num1= scanCalc.nextInt();
scanCalc.nextLine();
do{System.out.print("Input the operator(+ OR - OR * OR /): ");
operator= scanCalc.nextLine();}while(!operator.equals("+")&&!operator.equals("-")&&!operator.equals("*")&&!operator.equals("/"));
System.out.print("Input the second number: ");
num2= scanCalc.nextInt();
switch (operator){
	case "+": System.out.print(""+num1+"+"+num2+"="+add(num1,num2)); break;
	case "-": System.out.print(""+num1+"-"+num2+"="+subtract(num1,num2));break;
	case "*": System.out.print(""+num1+"*"+num2+"="+multiply(num1,num2));break;
	case "/": System.out.print(""+num1+"/"+num2+"="+divide(num1,num2));break;
    }
}
	private String add(int a, int b) {
	String ans=a+b+"";
	return ans;
    }

	private String subtract(int a, int b) {
	String ans=a-b+"";
	return ans;
    }

	private String multiply(int a, int b) {
	String ans=a*b+"";
	return ans;
    }

	private String divide(int a, int b) {
	String ans=(double)a/b+"";
	return ans;
    }
}