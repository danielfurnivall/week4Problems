import java.util.Scanner;
public class Week4Q2 {
    public static void main(String[] args) {
        System.out.println("Part 1 : Square Array");
        make2DArray(6);
        noughtsAndCrosses();
    }

    private static int make2DArray(int n) {
        int[][] ourArray = new int[n][n];
        //build array
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j + count >= 0) {
                    ourArray[i][j] = (j + count);
                } else {
                    ourArray[i][j] = 0;
                }

            }
            count--;
        }


        //print array
        for (int z = 0; z < ourArray.length; z++) {
            for (int y = 0; y < ourArray.length; y++) {
                System.out.print(ourArray[z][y] + " ");
            }
            System.out.print("\n");
        }
        return 1;
    }

    private static void noughtsAndCrosses() {
        char[][] gameBoard = new char[3][3];
        for(int i = 0; i < 4; i++){
            Move move1 = input(1);
            while (gameBoard[move1.getX()][move1.getY()] != 0){
                move1 = input(1);
            }
            gameBoard[move1.getX()][move1.getY()] = move1.getPlayer().charAt(0);
            Move move2 = input(2);
            while (gameBoard[move2.getX()][move2.getY()] != 0){
                move2 = input(2);
            }
            gameBoard[move2.getX()][move2.getY()] = move2.getPlayer().charAt(0);
            for (int z = 0; z < gameBoard.length; z++) {
                for (int y = 0; y < gameBoard.length; y++) {
                    System.out.print(gameBoard[z][y] + " ");
                }
                System.out.print("\n");
            }
        }


        //player 1 = x, player 2 = o
    }


    private static class Move {
        private int x;

        private int getX() {
            return x;
        }

        private void setX(int x) {
            this.x = x;
        }

        private int y;

        private int getY() {
            return y;
        }

        private void setY(int y) {
            this.y = y;
        }

        private String getPlayer() {
            return player;
        }

        private String player;

        private void setPlayer(String player) {
            this.player = player;
        }
    }


    private static Move input(int player) {
        Move date = new Move();
        if (player == 1) {
            date.setPlayer("x");
        } else {
            date.setPlayer("O");}
            System.out.println("Player " + player + ", please insert x co-ordinate");
            Scanner x = new Scanner(System.in);
            int xCoord = x.nextInt();
            date.setX(xCoord);
            System.out.println("Please insert y co-ordinate");
            int yCoord = x.nextInt();
            date.setY(yCoord);
            return date;
        }

    }

