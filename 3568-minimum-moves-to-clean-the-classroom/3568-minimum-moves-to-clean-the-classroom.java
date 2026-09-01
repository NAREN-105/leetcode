import java.util.*;

public class Solution {
    public int minMoves(String[] classroom, int energy) {
        int m = classroom.length;
        int n = classroom[0].length();
        
        int startR = -1, startC = -1;
        List<int[]> litters = new ArrayList<>();
        
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char ch = classroom[i].charAt(j);
                if (ch == 'S') {
                    startR = i;
                    startC = j;
                } else if (ch == 'L') {
                    litters.add(new int[]{i, j});
                }
            }
        }
        
        int totalLitter = litters.size();
        int targetMask = (1 << totalLitter) - 1;
        
      
        int[][] litterIdx = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(litterIdx[i], -1);
        }
        for (int i = 0; i < totalLitter; i++) {
            int[] pos = litters.get(i);
            litterIdx[pos[0]][pos[1]] = i;
        }
        
        Queue<int[]> queue = new LinkedList<>();
        
        boolean[][][][] visited = new boolean[m][n][energy + 1][1 << totalLitter];
        
        queue.offer(new int[]{startR, startC, energy, 0});
        visited[startR][startC][energy][0] = true;
        
        int moves = 0;
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int k = 0; k < size; k++) {
                int[] curr = queue.poll();
                int r = curr[0];
                int c = curr[1];
                int e = curr[2];
                int mask = curr[3];
                
                
                if (mask == targetMask) {
                    return moves;
                }
                
            
                if (e == 0) continue;
                
                for (int[] dir : dirs) {
                    int nr = r + dir[0];
                    int nc = c + dir[1];
                    
                    
                    if (nr < 0 || nr >= m || nc < 0 || nc >= n || classroom[nr].charAt(nc) == 'X') {
                        continue;
                    }
                    
                    int ne = e - 1;
                    int nmask = mask;
                    char cellType = classroom[nr].charAt(nc);
                    
                    
                    if (cellType == 'R') {
                        ne = energy;
                    }
                    
                    else if (cellType == 'L') {
                        int idx = litterIdx[nr][nc];
                        nmask |= (1 << idx);
                    }
                    
                    
                    if (!visited[nr][nc][ne][nmask]) {
                        visited[nr][nc][ne][nmask] = true;
                        queue.offer(new int[]{nr, nc, ne, nmask});
                    }
                }
            }
            moves++;
        }
        
        return -1;
    }
}
