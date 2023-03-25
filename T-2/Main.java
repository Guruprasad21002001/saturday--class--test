public class Main
{
public static void main(String[] args)
{
        int[][] matrix1 = {{1, 4}, {2, 6}};
        int[][] matrix2 = {{4, 8}, {6, 3}};
        int[][] sumMatrix = new int[2][2];
        for(int i = 0; i < 2; i++)
        {
        for(int j = 0; j < 2; j++)
        {
        sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
        }
        }
        System.out.println("Sum of matrices:");
        for(int i = 0; i < 2; i++)
        {
        for(int j = 0; j < 2; j++)
        {
        System.out.print(sumMatrix[i][j] + " ");
        }
        System.out.println();
        }
        }
        }