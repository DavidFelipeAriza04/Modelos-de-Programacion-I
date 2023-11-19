package Vista;

import Product_Abstraccion.Ficha;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Prueba extends JFrame {

    private JPanel chessBoard;
    private JPanel[][] squares;
    private int boardSize = 8;
    private int selectedRow = -1;
    private int selectedCol = -1;
    private String Ficha_a_mover;

    public Prueba(ArrayList<Ficha> FichasBlancas, ArrayList<Ficha> FichasNegras) {
        setTitle("Chess Board");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        chessBoard = new JPanel(new GridLayout(boardSize, boardSize));
        chessBoard.setSize(500,500);
        this.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(chessBoard);

        squares = new JPanel[boardSize][boardSize];
        initializeChessBoard(FichasBlancas, FichasNegras);

        setVisible(true);
    }

    public void initializeChessBoard(ArrayList<Ficha> FichasBlancas, ArrayList<Ficha> FichasNegras) {
        for (int row = 0; row < boardSize; row++) {
            for (int col = 0; col < boardSize; col++) {
                JPanel square = new JPanel();
                square.setLayout(new BorderLayout());
                if ((row + col) % 2 == 0) {
                    square.setBackground(new Color(194, 181, 164));
                } else {
                    square.setBackground(new Color(100, 70, 59));
                }
//                square.addMouseListener(new SquareMouseListener(row, col));
                square.addMouseListener(new SquareMouseListener(row, col, this));
                squares[row][col] = square;
                chessBoard.add(square);
            }
        }
        // Coloca imágenes de figuras de ajedrez en las casillas
        placeChessPieces(FichasBlancas, FichasNegras);
    }

    public void placeChessPieces(ArrayList<Ficha> FichasBlancas, ArrayList<Ficha> FichasNegras) {
        for (int col = 0; col < boardSize; col++) {

            //PEONES
            JLabel Peon_Negro = new JLabel(new ImageIcon(getClass().getResource("/Images/PeonNegro.png")));
            Peon_Negro.setName(FichasNegras.get(col).getNombre());
            squares[1][col].add(Peon_Negro);
            squares[1][col].setName(Peon_Negro.getName());

            JLabel Peon_Blanco = new JLabel(new ImageIcon(getClass().getResource("/Images/PeonBlanco.png")));
            Peon_Blanco.setName(FichasBlancas.get(col).getNombre());
            squares[6][col].add(Peon_Blanco);
            squares[6][col].setName(Peon_Blanco.getName());

            //TORRES
            JLabel Torre_Negra = new JLabel(new ImageIcon(getClass().getResource("/Images/TorreNegro.png")));
            JLabel Torre_Blanca = new JLabel(new ImageIcon(getClass().getResource("/Images/TorreBlanco.png")));
            if (col == 0 || col == 1) {
                Torre_Negra.setName(FichasNegras.get(col + 8).getNombre());
                Torre_Blanca.setName(FichasBlancas.get(col + 8).getNombre());

            }
            if (col == 0) {
                squares[0][0].add(Torre_Negra);
                squares[0][0].setName(Torre_Negra.getName());
                squares[7][0].add(Torre_Blanca);
                squares[7][0].setName(Torre_Blanca.getName());

            }
            if (col == 1) {
                squares[0][7].add(Torre_Negra);
                squares[0][7].setName(Torre_Negra.getName());
                squares[7][7].add(Torre_Blanca);
                squares[7][7].setName(Torre_Blanca.getName());
            }

            //ALFILES
            JLabel Alfil_Negro = new JLabel(new ImageIcon(getClass().getResource("/Images/AlfilNegro.png")));
            JLabel Alfil_Blanco = new JLabel(new ImageIcon(getClass().getResource("/Images/AlfilBlanco.png")));
            if (col == 2 || col == 3) {
                Alfil_Negro.setName(FichasNegras.get(col + 8).getNombre());
                Alfil_Blanco.setName(FichasBlancas.get(col + 8).getNombre());

            }
            if (col == 2) {
                squares[0][2].add(Alfil_Negro);
                squares[0][2].setName(Alfil_Negro.getName());
                squares[7][2].add(Alfil_Blanco);
                squares[7][2].setName(Alfil_Blanco.getName());

            }
            if (col == 3) {
                squares[0][5].add(Alfil_Negro);
                squares[0][5].setName(Alfil_Negro.getName());
                squares[7][5].add(Alfil_Blanco);
                squares[7][5].setName(Alfil_Blanco.getName());
            }

            //CABALLOS
            JLabel Caballo_Negro = new JLabel(new ImageIcon(getClass().getResource("/Images/CaballoNegro.png")));
            JLabel Caballo_Blanco = new JLabel(new ImageIcon(getClass().getResource("/Images/CaballoBlanco.png")));
            if (col == 4 || col == 5) {
                Caballo_Negro.setName(FichasNegras.get(col + 8).getNombre());
                Caballo_Blanco.setName(FichasBlancas.get(col + 8).getNombre());

            }
            if (col == 4) {
                squares[0][1].add(Caballo_Negro);
                squares[0][1].setName(Caballo_Negro.getName());
                squares[7][1].add(Caballo_Blanco);
                squares[7][1].setName(Caballo_Blanco.getName());

            }
            if (col == 5) {
                squares[0][6].add(Caballo_Negro);
                squares[0][6].setName(Caballo_Negro.getName());
                squares[7][6].add(Caballo_Blanco);
                squares[7][6].setName(Caballo_Blanco.getName());
            }

            //REINAS
            JLabel Reina_Negro = new JLabel(new ImageIcon(getClass().getResource("/Images/ReinaNegro.png")));
            JLabel Reina_Blanca = new JLabel(new ImageIcon(getClass().getResource("/Images/ReinaBlanco.png")));
            if (col == 6) {
                Reina_Negro.setName(FichasNegras.get(col + 8).getNombre());
                Reina_Blanca.setName(FichasBlancas.get(col + 8).getNombre());
                squares[0][3].add(Reina_Negro);
                squares[0][3].setName(Reina_Negro.getName());
                squares[7][3].add(Reina_Blanca);
                squares[7][3].setName(Reina_Blanca.getName());
            }

            //REYES
            JLabel Rey_Negro = new JLabel(new ImageIcon(getClass().getResource("/Images/ReyNegro.png")));
            JLabel Rey_Blanco = new JLabel(new ImageIcon(getClass().getResource("/Images/ReyBlanco.png")));
            if (col == 7) {
                Rey_Negro.setName(FichasNegras.get(col + 8).getNombre());
                Rey_Blanco.setName(FichasBlancas.get(col + 8).getNombre());
                squares[0][4].add(Rey_Negro);
                squares[0][4].setName(Rey_Negro.getName());
                squares[7][4].add(Rey_Blanco);
                squares[7][4].setName(Rey_Blanco.getName());
            }

        }
    }

    public void showPossibleMoves(int fromRow, int fromCol, String Nombre_Ficha) {
        // Implementa la lógica para mostrar las casillas a las que puede moverse el peón
        // Por ejemplo, resaltar la casilla inmediatamente delante del peón y dos casillas en su primer movimiento

        //PEON BLANCO
        if (Nombre_Ficha.contains("PeonBlanco")) {
            if (fromRow == 6 && isValidMove(fromRow, fromCol, fromRow - 2, fromCol, Nombre_Ficha)) {
                squares[fromRow - 2][fromCol].setBackground(Color.GREEN);
                squares[fromRow - 1][fromCol].setBackground(Color.GREEN);
            } else if (isValidMove(fromRow, fromCol, fromRow - 1, fromCol, Nombre_Ficha)) {
                squares[fromRow - 1][fromCol].setBackground(Color.GREEN);
            } else {
                clearPossibleMoves();
            }
        } //CABALLO BLANCO
        else if (Nombre_Ficha.contains("CaballoBlanco")) {
            if (isValidMove(fromRow, fromCol, fromRow - 2, fromCol + 1, Nombre_Ficha)) {
                squares[fromRow - 2][fromCol + 1].setBackground(Color.GREEN);
            }
            if (isValidMove(fromRow, fromCol, fromRow - 2, fromCol - 1, Nombre_Ficha)) {
                squares[fromRow - 2][fromCol - 1].setBackground(Color.GREEN);
            }
            if (isValidMove(fromRow, fromCol, fromRow + 2, fromCol + 1, Nombre_Ficha)) {
                squares[fromRow + 2][fromCol + 1].setBackground(Color.GREEN);
            }
            if (isValidMove(fromRow, fromCol, fromRow + 2, fromCol - 1, Nombre_Ficha)) {
                squares[fromRow + 2][fromCol - 1].setBackground(Color.GREEN);
            }
            if (isValidMove(fromRow, fromCol, fromRow + 1, fromCol - 2, Nombre_Ficha)) {
                squares[fromRow + 1][fromCol - 2].setBackground(Color.GREEN);
            }
            if (isValidMove(fromRow, fromCol, fromRow + 1, fromCol + 2, Nombre_Ficha)) {
                squares[fromRow + 1][fromCol + 2].setBackground(Color.GREEN);
            }
            if (isValidMove(fromRow, fromCol, fromRow - 1, fromCol - 2, Nombre_Ficha)) {
                squares[fromRow - 1][fromCol - 2].setBackground(Color.GREEN);
            }
            if (isValidMove(fromRow, fromCol, fromRow - 1, fromCol + 2, Nombre_Ficha)) {
                squares[fromRow - 1][fromCol + 2].setBackground(Color.GREEN);
            }
        } //TORRE BLANCO
        else if (Nombre_Ficha.contains("TorreBlanco")) {
            for (int i = 0; i < boardSize; i++) {
                if (i != fromRow && isValidMove(fromRow, fromCol, i, fromCol, Nombre_Ficha)) {
                    squares[i][fromCol].setBackground(Color.GREEN);
                    squares[i][fromCol].setBorder(null);
                }
                if (i != fromCol && isValidMove(fromRow, fromCol, fromRow, i, Nombre_Ficha)) {
                    squares[fromRow][i].setBackground(Color.GREEN);
                }
            }

        } else {
            System.out.println("Esto no es un peon blanco");
            clearPossibleMoves();
        }
    }

    public boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol, String Nombre_Ficha) {
        // Implementa la lógica de validación del movimiento del peón
        // Por ejemplo, permite el movimiento hacia adelante y captura en diagonal

        //PEON BLANCO
        if (Nombre_Ficha.contains("PeonBlanco")) {
            if (fromRow == 6) {
                return (Math.abs(toCol - fromCol) <= 1 && (fromRow - toRow <= 2) && (!isPieceInPath(toRow, toCol) && !isPieceInPath(fromRow - 1, toCol)));
            } else {
                return Math.abs(toCol - fromCol) <= 1 && (fromRow - toRow == 1) && !isPieceInPath(toRow, toCol);
            }
        }

        //CABALLO BLANCO
        if (Nombre_Ficha.contains("CaballoBlanco")) {
            if (toRow >= boardSize || toCol >= boardSize || toRow < 0 || toCol < 0) {
                return false;
            } else {
                return Math.abs(toCol - fromCol) <= 2 && (fromRow - toRow <= 2) && !isPieceInPath(toRow, toCol);
            }
        }

        //TORRE BLANCO
        if (Nombre_Ficha.contains("TorreBlanco")) {
            if (toRow >= boardSize || toCol >= boardSize || toRow < 0 || toCol < 0) {
                return false;
            } else if (fromRow == toRow) {
                // Movimiento horizontal
                int step = Integer.compare(toCol, fromCol);
                for (int i = fromCol + step; i != toCol; i += step) {
                    if (isPieceInPath(fromRow, i)) {
                        return false; // Hay una pieza en el camino
                    }
                }
            } else if (fromCol == toCol) {
                // Movimiento vertical
                int step = Integer.compare(toRow, fromRow);
                for (int i = fromRow + step; i != toRow; i += step) {
                    if (isPieceInPath(i, fromCol)) {
                        return false; // Hay una pieza en el camino
                    }
                }
            }
            return !isPieceInPath(toRow, toCol);
        }
        return false;
    }

    private boolean isPieceInPath(int row, int col) {
        // Verificar si hay una ficha en la casilla
        return squares[row][col].getComponentCount() > 0;
    }

    public void swapPieces(int fromRow, int fromCol, int toRow, int toCol) {
        if (squares[toRow][toCol].getBackground() == Color.GREEN) {
            Component piece = squares[fromRow][fromCol].getComponent(0);
            squares[fromRow][fromCol].remove(piece);
            String Nombre_Ficha = squares[fromRow][fromCol].getName();
            squares[toRow][toCol].add(piece);
            squares[toRow][toCol].setName(Nombre_Ficha);
            squares[fromRow][fromCol].setName(null);
            repaint();
        }
    }

    public void clearPossibleMoves() {
        // Restaura el color de fondo original de las casillas
        for (int row = 0; row < boardSize; row++) {
            for (int col = 0; col < boardSize; col++) {
                if ((row + col) % 2 == 0) {
                    squares[row][col].setBackground(new Color(194, 181, 164));
                } else {
                    squares[row][col].setBackground(new Color(100, 70, 59));
                }
            }
        }
        this.selectedCol = -1;
        this.selectedRow = -1;
    }

    public int getSelectedRow() {
        return selectedRow;
    }

    public void setSelectedRow(int selectedRow) {
        this.selectedRow = selectedRow;
    }

    public int getSelectedCol() {
        return selectedCol;
    }

    public void setSelectedCol(int selectedCol) {
        this.selectedCol = selectedCol;
    }

    public String getFicha_a_mover() {
        return Ficha_a_mover;
    }

    public void setFicha_a_mover(String Ficha_a_mover) {
        this.Ficha_a_mover = Ficha_a_mover;
    }

    public JPanel[][] getSquares() {
        return squares;
    }

}
