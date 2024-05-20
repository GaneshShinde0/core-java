import java.util.*;

public class ArrayVisitLeap {

    public static boolean canWin(int leap, int[] game) {
        return canMove(0, leap,game,new boolean[game.length]);
    }
    public static boolean canMove(int position, int leap, int[] game, boolean[] visited){
        if(position>=game.length){
            return true;
        }
        if(position<0||visited[position]||game[position]==1){
            return false;
        }
        visited[position]=true;
        return canMove(position+1,leap,game,visited)||
                canMove(position-1,leap,game,visited)||
                canMove(position+leap,leap,game,visited); 
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
