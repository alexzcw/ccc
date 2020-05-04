package S3;

import java.util.Scanner;

public class S32013 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int fteam = in.nextInt();   
        int G = in.nextInt();    
        int[] totalPoints = new int[4];

        int[][] points = new int[4][4];
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                if( i==j )
                    points[i][j] = 0;
                else
                    points[i][j] = -1;
            }
        }

        for(int i = 0; i < G; i++) {
            int A = in.nextInt()-1;
            int B = in.nextInt()-1;
            int SA = in.nextInt();
            int SB = in.nextInt();
            if(SA > SB) {
                points[A][B] = 3;
                points[B][A] = 0;
            }
            else if(SA < SB) {
                points[A][B] = 0;
                points[B][A] = 3;
            }
            else {
                points[A][B] = 1;
                points[B][A] = 1;
            }
        }

        int res = totalScores(fteam, 0, points, totalPoints);

        System.out.println(res);
    }
	public static int totalScores(int T, int gameIdx, int[][] possiblePoints, int[] possibleTotalPoints) {
        int res = 0;

        if(gameIdx >= 6) {
            int k = T-1;
            boolean biggest = true;
            for(int i = 0; i < 4; i++) {
                if(i!=k) {
                    if( possibleTotalPoints[i] >= possibleTotalPoints[k] ) {
                        biggest = false;
                        break;
                    }
                }
            }

            if (biggest)
                res++;
            return res;
        }
        int x = 0;
        int y = 0;
        switch(gameIdx) {
	        case 0: {
	                x = 0;
	                y = 1;
	        }
	        break;
	        case 1:{
                x = 0;
                y = 2;
            }
            break;
	        case 2: {
                x = 0;
                y = 3;
            }
            break;
	        case 3: {
                x = 1;
                y = 2;
            }
            break;
	        case 4: {
                x = 1;
                y = 3;
            }
            break;
	        case 5: {
                x = 2;
                y = 3;
            }
            break;
        }
		if( hasPlayed(x,y,possiblePoints) ) {
            possibleTotalPoints[x] += possiblePoints[x][y];
            possibleTotalPoints[y] += possiblePoints[y][x];
            res += totalScores(T, gameIdx+1, possiblePoints, possibleTotalPoints);
        }
        else {
            // case 1
            int[][] possiblePointsCase1 = new int[4][4];
            for(int i = 0; i < 4; i++)
                for(int j = 0; j < 4; j++)
                    possiblePointsCase1[i][j] = possiblePoints[i][j];
            int[] possibleTotalPointsCase1 = new int[4];
            for(int i = 0; i < 4; i++)
                possibleTotalPointsCase1[i] = possibleTotalPoints[i];
            possiblePointsCase1[x][y] = 3;
            possiblePointsCase1[y][x] = 0;
            possibleTotalPointsCase1[x] += possiblePointsCase1[x][y];
            possibleTotalPointsCase1[y] += possiblePointsCase1[y][x];
            res += totalScores(T, gameIdx+1, possiblePointsCase1, possibleTotalPointsCase1);
            // case 2
            int[][] possiblePointsCase2 = new int[4][4];
            for(int i = 0; i < 4; i++)
                for(int j = 0; j < 4; j++)
                    possiblePointsCase2[i][j] = possiblePoints[i][j];
            int[] possibleTotalPointsCase2 = new int[4];
            for(int i = 0; i < 4; i++)
                possibleTotalPointsCase2[i] = possibleTotalPoints[i];
            possiblePointsCase2[x][y] = 1;
            possiblePointsCase2[y][x] = 1;
            possibleTotalPointsCase2[x] += possiblePointsCase2[x][y];
            possibleTotalPointsCase2[y] += possiblePointsCase2[y][x];
            res += totalScores(T, gameIdx+1, possiblePointsCase2, possibleTotalPointsCase2);

            // case 3
            int[][] possiblePointsCase3 = new int[4][4];
            for(int i = 0; i < 4; i++)
                for(int j = 0; j < 4; j++)
                    possiblePointsCase3[i][j] = possiblePoints[i][j];
            int[] possibleTotalPointsCase3 = new int[4];
            for(int i = 0; i < 4; i++)
                possibleTotalPointsCase3[i] = possibleTotalPoints[i];
            possiblePointsCase3[x][y] = 1;
            possiblePointsCase3[y][x] = 1;
            possibleTotalPointsCase3[x] += possiblePointsCase3[x][y];
            possibleTotalPointsCase3[y] += possiblePointsCase3[y][x];
            res += totalScores(T, gameIdx+1, possiblePointsCase3, possibleTotalPointsCase3);
        }
        return res;
    }
	public static boolean hasPlayed(int x, int y, int[][] points) {
        boolean res = false;
        if( (x!=y) && (points[x][y] >= 0) )
            res = true;
        return res;
    }

}
