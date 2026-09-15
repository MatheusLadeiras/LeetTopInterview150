class Solution {
    public boolean isValidSudoku(char[][] board) {
       //Size checker
        if(board.length != 9) return false;
        for (int i = 0; i < 9; i++) {if(board[i].length != 9) {return false;}}

        //Rows checker
        for (int i = 0; i < 9; i++) {
            char[] unseenNumbers = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
            for (int j = 0; j < 9; j++) {
                switch (board[i][j]) {
                    case '.': break;
                    case '1', '2', '3', '4', '5', '6', '7', '8', '9':
                    int number = Integer.parseInt(String.valueOf(board[i][j]));
                    if(board[i][j] != unseenNumbers[number-1]) {return false;} else {
                        unseenNumbers[number-1] = '.';
                    }
                    break;
                    default: return false; 
                }
            }
        }

        //Columns checker
        for (int i = 0; i < 9; i++) {
            char[] unseenNumbers = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
            for (int j = 0; j < 9; j++) {
                switch (board[j][i]) {
                    case '.': break;
                    case '1', '2', '3', '4', '5', '6', '7', '8', '9':
                    int number = Integer.parseInt(String.valueOf(board[j][i]));
                    if(board[j][i] != unseenNumbers[number-1]) {return false;} else {
                        unseenNumbers[number-1] = '.';
                    }
                    break;
                    default: return false; 
                }
            }
        }
        
        //Square checker
        for(int m = 0; m < 7; m=m+3) {
            for(int n = 0; n < 7; n=n+3) {
                char[] unseenNumbers = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
                for (int i = m; i < m + 3; i++) {
                    for (int j = n; j < n+3; j++) {
                        switch (board[i][j]) {
                            case '.': break;
                            case '1', '2', '3', '4', '5', '6', '7', '8', '9':
                            int number = Integer.parseInt(String.valueOf(board[i][j]));
                            if(board[i][j] != unseenNumbers[number-1]) {return false;} else {
                                unseenNumbers[number-1] = '.';
                            }
                            break;
                            default: return false; 
                        }
                    }
                }
            }
        }

        return true;
    } 
}
