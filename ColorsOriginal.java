import java.util.Scanner;

public class ColorsOriginal {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int numElements;

        numElements = scnr.nextInt();
        int[] userList = new int[numElements];

        for (int i = 0; i < numElements; i++) {
            userList[i] = scnr.nextInt();
        }

        for (int i = userList.length - 1; i >= userList.length - numElements; i--) {
            System.out.print(userList[i]);

            if (i > userList.length - numElements) {
                System.out.print(",");
            }
        }
System.out.println();
    }
}
