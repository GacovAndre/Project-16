import java.util.Scanner;
public class DeliviSo4i7 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Внесете ја големината на низата: ");
int n = scanner.nextInt();
int[] niza = new int[n];
System.out.println("Внесете ги " + n + " елементи на низата:");
for (int i = 0; i < n; i++) {
System.out.print("Елемент " + (i + 1) + ": ");
niza[i] = scanner.nextInt();
}
System.out.println("Членови во низата кои се делат со 4 и 7 се:");
for (int i = 0; i < n; i++) {
if (niza[i] % 4 == 0 && niza[i] % 7 == 0) {
System.out.println(niza[i]);
}
}
}
}