class GameOfLife {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Count live neighbors of the current cell
                int liveNeighbors = countLiveNeighbors(board, i, j);

                // Apply the rules of the Game of Life
                if (board[i][j] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    // Rule 1 or 3: Mark as dead (temporarily 2)
                    board[i][j] = 2;
                } else if (board[i][j] == 0 && liveNeighbors == 3) {
                    // Rule 4: Mark as alive (temporarily -1)
                    board[i][j] = -1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 2) {
                    board[i][j] = 0; // Dead
                } else if (board[i][j] == -1) {
                    board[i][j] = 1; // Alive
                }
            }
        }
    }

    private int countLiveNeighbors(int[][] board, int row, int col) {
        int count = 0;
        int[][] directions = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1},           {0, 1},
            {1, -1},  { 1, 0}, {1, 1}
        };

        for (int[] direction : directions) {
            int newRow = row + direction[0];
            int newCol = col + direction[1];

            // Check boundaries and count only live cells
            if (newRow >= 0 && newRow < board.length && newCol >= 0 && newCol < board[0].length && (board[newRow][newCol] == 1 || board[newRow][newCol] == 2)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] board = {
            {0, 1, 0},
            {0, 0, 1},
            {1, 1, 1},
            {0, 0, 0}
        };

        GameOfLife gol = new GameOfLife();
        gol.gameOfLife(board);

        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
