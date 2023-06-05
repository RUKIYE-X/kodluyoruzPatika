import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int row;
    int column;
    int size;
    int[][] map;
    int[][] board;
    int mayinSayisi = 0;
    Random random = new Random();
    Scanner scan = new Scanner(System.in);
    boolean isGame = true;

    MineSweeper(int row, int column) {
        this.row = row;
        this.column = column;
        this.map = new int[this.row][this.column];
        this.board = new int[this.row][this.column];
        this.size = this.row * this.column;
    }

    public void run() {
        int rowGir, colGir,counter = 0;
        mayinOlustur();
        print(map);
        System.out.println("Oyun Başladı. Bol Şanslar:)");
        while (isGame) {
            print(board);
            System.out.println("Satır giriniz: ");
            rowGir = scan.nextInt();
            System.out.println("Sütun Giriniz");
            colGir = scan.nextInt();
            if(rowGir<0 || rowGir>this.row){
                System.out.println("Geçersiz Koordinat!");
                continue;
            }
            if(colGir<0 || colGir>this.column){
                System.out.println("Geçersiz Koordinat!");
                continue;
            }
            if (map[rowGir][colGir] != -1) {
                mayinBul(rowGir, colGir);
                counter++;
                if(counter == (this.size - (this.size / 4))){
                    System.out.println("Tebrikler!! Oyunu Kazandınız.");
                    break;
                }
            } else {
                isGame = false;
                System.out.println("Mayına Bastınız!! Oyunu Kaybettiniz.");
            }
        }
    }

    public void mayinBul(int r, int c) {
        if (map[r][c] == 0) {
            if ((r > 0) && (map[r - 1][c] == -1)) {
                board[r][c]++;
            }
            if ((r > 0) && (c > 0) && (map[r - 1][c - 1] == -1)) {
                board[r][c]++;
            }
            if ((r > 0) && (c < this.column - 1) && (map[r - 1][c + 1] == -1)) {
                board[r][c]++;
            }
            if ((c > 0) && (map[r][c - 1] == -1)) {
                board[r][c]++;
            }
            if ((c < this.column - 1) && (map[r][c + 1] == -1)) {
                board[r][c]++;
            }
            if ((r < this.row - 1) && (c > 0) && (map[r + 1][c - 1] == -1)) {
                board[r][c]++;
            }
            if ((r < this.row - 1) && (map[r + 1][c] == -1)) {
                board[r][c]++;
            }
            if ((r < this.row - 1) && (c < this.column - 1) && (map[r + 1][c + 1] == -1)) {
                board[r][c]++;
            }
            if (board[r][c] == 0) {
                board[r][c] = -2;
            }
        }


    }

    public void mayinOlustur() {
        int randRow, randCol, counter = 0;
        while ((this.size / 4) > counter) {
            randRow = random.nextInt(this.row);
            randCol = random.nextInt(this.column);
            //char ch = '*';
            if (map[randRow][randCol] != -1) {
                map[randRow][randCol] = -1;
            }
            counter++;
        }
    }

    public void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
