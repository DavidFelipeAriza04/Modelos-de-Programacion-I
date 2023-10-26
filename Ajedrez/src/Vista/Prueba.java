package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Prueba extends JFrame {

    private JPanel chessBoard;
    private JPanel[][] squares;
    private int boardSize = 8;
    private int selectedRow = -1;
    private int selectedCol = -1;

    public Prueba() {
        setTitle("Chess Board");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        chessBoard = new JPanel(new GridLayout(boardSize, boardSize));
        add(chessBoard);

        squares = new JPanel[boardSize][boardSize];
        initializeChessBoard();

        setVisible(true);
    }

    private void initializeChessBoard() {
        for (int row = 0; row < boardSize; row++) {
            for (int col = 0; col < boardSize; col++) {
                JPanel square = new JPanel();
                square.setLayout(new BorderLayout());
                if ((row + col) % 2 == 0) {
                    square.setBackground(Color.WHITE);
                } else {
                    square.setBackground(Color.BLACK);
                }
                square.addMouseListener(new SquareMouseListener(row, col));
                squares[row][col] = square;
                chessBoard.add(square);
            }
        }
        // Coloca imágenes de figuras de ajedrez en las casillas
        placeChessPieces();
    }

    private class SquareMouseListener extends MouseAdapter {

        private int row;
        private int col;

        public SquareMouseListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            if (selectedRow == -1 && selectedCol == -1) {
                selectedRow = row;
                selectedCol = col;
                showPossibleMoves(selectedRow, selectedCol);
            } else {
                if (isValidMove(selectedRow, selectedCol, row, col)) {
//                    movePiece(selectedRow, selectedCol, row, col);
                    swapPieces(selectedRow, selectedCol, row, col);
                }
                // Mueve la ficha seleccionada a la nueva posición
                clearPossibleMoves();
                selectedRow = -1;
                selectedCol = -1;
            }
        }
    }

    private void clearPossibleMoves() {
        // Restaura el color de fondo original de las casillas
        for (int row = 0; row < boardSize; row++) {
            for (int col = 0; col < boardSize; col++) {
                if ((row + col) % 2 == 0) {
                    squares[row][col].setBackground(Color.WHITE);
                } else {
                    squares[row][col].setBackground(Color.BLACK);
                }
            }
        }
    }

    private void showPossibleMoves(int fromRow, int fromCol) {
        // Implementa la lógica para mostrar las casillas a las que puede moverse el peón
        // Por ejemplo, resaltar la casilla inmediatamente delante del peón y dos casillas en su primer movimiento
        if (isValidMove(fromRow, fromCol, fromRow - 1, fromCol)) {
            squares[fromRow - 1][fromCol].setBackground(Color.YELLOW);
        }
        if (fromRow == 6 && isValidMove(fromRow, fromCol, fromRow - 2, fromCol)) {
            squares[fromRow - 2][fromCol].setBackground(Color.YELLOW);
        }
    }

    private boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol) {
        // Implementa la lógica de validación del movimiento del peón
        // Por ejemplo, permite el movimiento hacia adelante y captura en diagonal
        return Math.abs(toCol - fromCol) <= 1 && (fromRow - toRow == 1);
    }

    private void placeChessPieces() {
        for (int col = 0; col < boardSize; col++) {
            squares[1][col].add(new JLabel(new ImageIcon(getClass().getResource("/Images/PeonNegro.png"))));
            squares[6][col].add(new JLabel(new ImageIcon(getClass().getResource("/Images/PeonBlanco.png"))));
        }

        squares[0][0].add(new JLabel(new ImageIcon(getClass().getResource("/Images/TorreNegro.png"))));
        squares[0][7].add(new JLabel(new ImageIcon(getClass().getResource("/Images/TorreNegro.png"))));
        squares[7][0].add(new JLabel(new ImageIcon(getClass().getResource("/Images/TorreBlanco.png"))));
        squares[7][7].add(new JLabel(new ImageIcon(getClass().getResource("/Images/TorreBlanco.png"))));

        squares[0][1].add(new JLabel(new ImageIcon(getClass().getResource("/Images/CaballoNegro.png"))));
        squares[0][6].add(new JLabel(new ImageIcon(getClass().getResource("/Images/CaballoNegro.png"))));
        squares[7][1].add(new JLabel(new ImageIcon(getClass().getResource("/Images/CaballoBlanco.png"))));
        squares[7][6].add(new JLabel(new ImageIcon(getClass().getResource("/Images/CaballoBlanco.png"))));

        squares[0][2].add(new JLabel(new ImageIcon(getClass().getResource("/Images/AlfilNegro.png"))));
        squares[0][5].add(new JLabel(new ImageIcon(getClass().getResource("/Images/AlfilNegro.png"))));
        squares[7][2].add(new JLabel(new ImageIcon(getClass().getResource("/Images/AlfilBlanco.png"))));
        squares[7][5].add(new JLabel(new ImageIcon(getClass().getResource("/Images/AlfilBlanco.png"))));

        squares[0][3].add(new JLabel(new ImageIcon(getClass().getResource("/Images/ReinaNegro.png"))));
        squares[0][4].add(new JLabel(new ImageIcon(getClass().getResource("/Images/ReyNegro.png"))));
        squares[7][3].add(new JLabel(new ImageIcon(getClass().getResource("/Images/ReinaBlanco.png"))));
        squares[7][4].add(new JLabel(new ImageIcon(getClass().getResource("/Images/ReyBlanco.png"))));

        // Agrega más imágenes para otras piezas de ajedrez
    }

    private void swapPieces(int fromRow, int fromCol, int toRow, int toCol) {
        Component piece = squares[fromRow][fromCol].getComponent(0);

        squares[fromRow][fromCol].remove(piece);
        squares[toRow][toCol].add(piece);

//        validate();
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Prueba());
    }
}
