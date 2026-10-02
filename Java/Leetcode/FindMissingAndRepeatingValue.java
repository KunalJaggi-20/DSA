package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class FindMissingAndRepeatingValue 
{

    public static void main(String[] args) 
    {

        int grid[][] = {{9,1,7},{8,9,2},{3,4,6}};

        int n = grid.length;

        Set<Integer> s = new HashSet<>();

        int a = 0, b = 0; // a = repeating, b = missing

        int actualSum = 0;
        int expectedSum = 0;

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                actualSum += grid[i][j];

                if(s.contains(grid[i][j]))
                {
                    a = grid[i][j];
                }

                s.add(grid[i][j]);
            }
        }

        expectedSum = (n * n * (n * n + 1)) / 2;

        b = expectedSum + a - actualSum;

        System.out.println("Repeating : " + a);
        System.out.println("Missing : " + b);
    }
}