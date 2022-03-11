import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {
String input="1",chris;
int a=0;
boolean Fermat=true;
Scanner scan= new Scanner(System.in);
while(Fermat==true){
do{
if(!input.equals("1")&&!input.equals("2")&&!input.equals("3")&&!input.equals("4"))System.out.println("Please make sure you pick a number between 1 and 4");
System.out.println("Which service would you like to use?\n[1]: Basic week visualizer\n[2]: Advanced week visualizer\n[3]: Basic calculator\n[4]: Employee repertoire");
input=scan.nextLine();}while(!input.equals("1")&&!input.equals("2")&&!input.equals("3")&&!input.equals("4"));
switch(input){
	case "1":BasicWeek ellipsoid=new BasicWeek();System.out.println(ellipsoid.GetDays());break;
	case "2":AdvancedWeek mobius=new AdvancedWeek();System.out.println(mobius.getDays());break;
	case "3":Calculator nihilism=new Calculator();break;
	case "4":Employee Euler=new Employee();System.out.println(Euler.toString());break;
		}
System.out.print("Would you like to perform another operation? (y/n)");
chris=scan.nextLine();
if(!chris.equalsIgnoreCase("y"))Fermat=false;
//wanted to put restrictions on each input, ie I didn't want to let you enter Isaac Newton as an employee with age 380, I'd print "He's immortal?", but really I showed that I can do that and don't have any motive to do otherwise, not mentioning that actually Newton is immortal and yes I wish I could employ him
}
}
}