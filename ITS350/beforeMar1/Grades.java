package beforeMar1;
public class Grades {

    public static void main(String[] args) {
        int [][] arr =
         {
            {2, 3, 5},
            {54, 65, 23},
            {43, 32, 21}
    };

    System.out.println(highestScore(arr));

   

    }
// for finding highest score only in one col (for one person or one module)
    static int highestScore(int col, int array[][]) {

    int score = array[0][col];
    for(int i=0; i<array.length; i++) {
        if (score < array[i][col]) {
            score = array[i][col];
        }
    }
    return score;
        
    }

// for finding highest score in all of the array
    static int highestScore(int array[][]) {

        int score = array[0][0];
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[0].length; j++)
                if (score < array[i][j]) {
                    score = array[i][j];
                }
        }
        return score;
            
    }
    
}