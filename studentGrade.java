import java.util.Scanner;
public class studentGrade {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("How many grades (1 to 5)?: ");
int count = scan.nextInt();

if(count < 1 || count > 5) {
System.out.println("Invalid grade!! please enter between 1 and 5");

}
else{

int sum =0;
for(int i=0; i < count; i++) {
System.out.println("Enter grade " +i+": ");
sum+=scan.nextInt();
}

double avg =(double) sum/count;



System.out.println("The final grade is: "+gradeFunction(avg));
}
}
static char gradeFunction(double avg) {
if(avg >=90) return 'A';
else if(avg >= 80) return 'B';
else if(avg >= 70) return 'C';
else return 'D';
}
}