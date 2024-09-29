import java.util.Scanner;
public class Test{
 public static void main(String... args){
 Scanner sc = new Scanner(System.in);
System.out.println("Enter rows size::");
int rs = sc.nextInt();
System.out.println("Enter Column size::");
int cs = sc.nextInt();
int i,j,a[][] = new int [rs][cs];
System.out.println("Enter Matrix Element one by one");
for(i=0;i<rs;i++){
for(j=0;j<cs;j++){
a[i][j] = sc.nextInt();
}
}
System.out.println("Matrix Elements Are::");
    for(i=0;i<rs;i++){
     for(j=0;j<cs;j++){
   System.out.print(a[i][j]+ " ");
}
  System.out.println();
}
}
}
