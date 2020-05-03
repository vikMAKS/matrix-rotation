import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int [][]matrix = new int[3][3];
        for(int i=0; i<=2; i++) {
        for(int j=0; j<=2; j++) {
        matrix[i][j] = get.nextInt();
        }
        }
        System.out.println("Orginal matrix: ");
        System.out.println(" ");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Rotated matrix by 90 degrees: ");
        System.out.println(" ");
        for(int j=0; j<3; j++) {
            for(int i=2; i>=0; i--) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
        for(int x=0; x<=41; x++) {
            System.out.print("_");
        }
        System.out.println("");
        System.out.println("Creates by Codinger!");
        System.out.println("Please like it!");
    }
}
