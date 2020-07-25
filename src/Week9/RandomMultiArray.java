package Week9;


public class RandomMultiArray {
    public static void main(String[] args){
        int[][] numbers = new int[5][5];
        for (int x = 0; x < 5; x++)
        {
            for (int y = 0; y < 5; y++)
            {
                numbers[x][y] = (int)(Math.random() * 100) + 1;
                System.out.println ("Number" + x + " -> " + numbers[x][y] );
            }
        }
    }
}
