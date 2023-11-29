package Vista;

import ConcreteStates.StateBlanco;
import ConcreteStates.StateNegro;
import Singleton_Context.Tablero;
import State.InterfaceState;
import javax.swing.*;
import java.awt.*;

public class Prueba extends JFrame {

    private JPanel chessBoard;
    private JPanel[][] squares;
    private int boardSize = 8;
    private int selectedRow = -1;
    private int selectedCol = -1;
    private String Ficha_a_mover;
    private Tablero Tablero;
    private InterfaceState TurnoBlanco = new StateBlanco();
    private InterfaceState TurnoNegro = new StateNegro();

    public Prueba(Tablero Tablero) {
        this.Tablero = Tablero;
        setTitle("Chess Board");
        setSize(500, 530);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chessBoard = new JPanel(new GridLayout(boardSize, boardSize));
        chessBoard.setSize(400, 400);
        this.add(chessBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 400, 400));

        JLabel jLabelFondo = new JLabel();
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Tablero.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        squares = new JPanel[boardSize][boardSize];
        initializeChessBoard();

        setVisible(true);
    }

    public void initializeChessBoard() {
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
        placeChessPieces(this.Tablero);
    }

    public void placeChessPieces(Tablero Tablero) {
        for (int col = 0; col < boardSize; col++) {

            //PEONES
            JLabel Peon_Negro = new JLabel(new ImageIcon(getClass().getResource("/Images/PeonNegro.png")));
            Peon_Negro.setName(this.Tablero.getFichasNegras().get(col).getNombre());
            squares[1][col].add(Peon_Negro);
            squares[1][col].setName(Peon_Negro.getName());

            JLabel Peon_Blanco = new JLabel(new ImageIcon(getClass().getResource("/Images/PeonBlanco.png")));
            Peon_Blanco.setName(this.Tablero.getFichasBlancas().get(col).getNombre());
            squares[6][col].add(Peon_Blanco);
            squares[6][col].setName(Peon_Blanco.getName());

            //TORRES
            JLabel Torre_Negra = new JLabel(new ImageIcon(getClass().getResource("/Images/TorreNegro.png")));
            JLabel Torre_Blanca = new JLabel(new ImageIcon(getClass().getResource("/Images/TorreBlanco.png")));
            if (col == 0 || col == 1) {
                Torre_Negra.setName(this.Tablero.getFichasNegras().get(col + 8).getNombre());
                Torre_Blanca.setName(this.Tablero.getFichasBlancas().get(col + 8).getNombre());

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
                Alfil_Negro.setName(this.Tablero.getFichasNegras().get(col + 8).getNombre());
                Alfil_Blanco.setName(this.Tablero.getFichasBlancas().get(col + 8).getNombre());

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
                Caballo_Negro.setName(this.Tablero.getFichasNegras().get(col + 8).getNombre());
                Caballo_Blanco.setName(this.Tablero.getFichasBlancas().get(col + 8).getNombre());

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
                Reina_Negro.setName(this.Tablero.getFichasNegras().get(col + 8).getNombre());
                Reina_Blanca.setName(this.Tablero.getFichasBlancas().get(col + 8).getNombre());
                squares[0][3].add(Reina_Negro);
                squares[0][3].setName(Reina_Negro.getName());
                squares[7][3].add(Reina_Blanca);
                squares[7][3].setName(Reina_Blanca.getName());
            }

            //REYES
            JLabel Rey_Negro = new JLabel(new ImageIcon(getClass().getResource("/Images/ReyNegro.png")));
            JLabel Rey_Blanco = new JLabel(new ImageIcon(getClass().getResource("/Images/ReyBlanco.png")));
            if (col == 7) {
                Rey_Negro.setName(this.Tablero.getFichasNegras().get(col + 8).getNombre());
                Rey_Blanco.setName(this.Tablero.getFichasBlancas().get(col + 8).getNombre());
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
                squares[fromRow - 2][fromCol].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                squares[fromRow - 1][fromCol].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
            } else if (isValidMove(fromRow, fromCol, fromRow - 1, fromCol, Nombre_Ficha)) {
                squares[fromRow - 1][fromCol].setBackground(Color.GREEN);
                squares[fromRow - 1][fromCol].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
            } else {
                clearPossibleMoves();
            }
        } // PEON NEGRO
        else if (Nombre_Ficha.contains("PeonNegro")) {
            if (fromRow == 1 && isValidMove(fromRow, fromCol, fromRow + 2, fromCol, Nombre_Ficha)) {
                squares[fromRow + 2][fromCol].setBackground(Color.GREEN);
                squares[fromRow + 1][fromCol].setBackground(Color.GREEN);
                squares[fromRow + 2][fromCol].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                squares[fromRow + 1][fromCol].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
            } else if (isValidMove(fromRow, fromCol, fromRow + 1, fromCol, Nombre_Ficha)) {
                squares[fromRow + 1][fromCol].setBackground(Color.GREEN);
                squares[fromRow + 1][fromCol].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
            } else {
                clearPossibleMoves();
            }

        } //CABALLO
        else if (Nombre_Ficha.contains("Caballo")) {
            if (isValidMove(fromRow, fromCol, fromRow - 2, fromCol + 1, Nombre_Ficha)) {
                if (isEnemyPieceInPath(fromRow - 2, fromCol + 1)) {
                    squares[fromRow - 2][fromCol + 1].setBackground(Color.RED);
                    squares[fromRow - 2][fromCol + 1].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

                } else {
                    squares[fromRow - 2][fromCol + 1].setBackground(Color.GREEN);
                    squares[fromRow - 2][fromCol + 1].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                }
            }
            if (isValidMove(fromRow, fromCol, fromRow - 2, fromCol - 1, Nombre_Ficha)) {
                if (isEnemyPieceInPath(fromRow - 2, fromCol - 1)) {
                    squares[fromRow - 2][fromCol - 1].setBackground(Color.RED);
                    squares[fromRow - 2][fromCol - 1].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                } else {
                    squares[fromRow - 2][fromCol - 1].setBackground(Color.GREEN);
                    squares[fromRow - 2][fromCol - 1].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                }
            }
            if (isValidMove(fromRow, fromCol, fromRow + 2, fromCol + 1, Nombre_Ficha)) {
                if (isEnemyPieceInPath(fromRow + 2, fromCol + 1)) {
                    squares[fromRow + 2][fromCol + 1].setBackground(Color.RED);
                    squares[fromRow + 2][fromCol + 1].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                } else {
                    squares[fromRow + 2][fromCol + 1].setBackground(Color.GREEN);
                    squares[fromRow + 2][fromCol + 1].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                }
            }
            if (isValidMove(fromRow, fromCol, fromRow + 2, fromCol - 1, Nombre_Ficha)) {
                if (isEnemyPieceInPath(fromRow + 2, fromCol - 1)) {
                    squares[fromRow + 2][fromCol - 1].setBackground(Color.RED);
                    squares[fromRow + 2][fromCol - 1].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                } else {
                    squares[fromRow + 2][fromCol - 1].setBackground(Color.GREEN);
                    squares[fromRow + 2][fromCol - 1].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                }
            }
            if (isValidMove(fromRow, fromCol, fromRow + 1, fromCol - 2, Nombre_Ficha)) {
                if (isEnemyPieceInPath(fromRow + 1, fromCol - 2)) {
                    squares[fromRow + 1][fromCol - 2].setBackground(Color.RED);
                    squares[fromRow + 1][fromCol - 2].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                } else {
                    squares[fromRow + 1][fromCol - 2].setBackground(Color.GREEN);
                    squares[fromRow + 1][fromCol - 2].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                }
            }
            if (isValidMove(fromRow, fromCol, fromRow + 1, fromCol + 2, Nombre_Ficha)) {
                if (isEnemyPieceInPath(fromRow + 1, fromCol + 2)) {
                    squares[fromRow + 1][fromCol + 2].setBackground(Color.RED);
                    squares[fromRow + 1][fromCol + 2].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                } else {
                    squares[fromRow + 1][fromCol + 2].setBackground(Color.GREEN);
                    squares[fromRow + 1][fromCol + 2].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                }
            }
            if (isValidMove(fromRow, fromCol, fromRow - 1, fromCol - 2, Nombre_Ficha)) {
                if (isEnemyPieceInPath(fromRow - 1, fromCol - 2)) {
                    squares[fromRow - 1][fromCol - 2].setBackground(Color.RED);
                    squares[fromRow - 1][fromCol - 2].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                } else {
                    squares[fromRow - 1][fromCol - 2].setBackground(Color.GREEN);
                    squares[fromRow - 1][fromCol - 2].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                }
            }
            if (isValidMove(fromRow, fromCol, fromRow - 1, fromCol + 2, Nombre_Ficha)) {
                if (isEnemyPieceInPath(fromRow - 1, fromCol + 2)) {
                    squares[fromRow - 1][fromCol + 2].setBackground(Color.RED);
                    squares[fromRow - 1][fromCol + 2].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                } else {
                    squares[fromRow - 1][fromCol + 2].setBackground(Color.GREEN);
                    squares[fromRow - 1][fromCol + 2].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                }
            }
        } //TORRE
        else if (Nombre_Ficha.contains("Torre")) {
            for (int i = 0; i < boardSize; i++) {
                if (i != fromRow && isValidMove(fromRow, fromCol, i, fromCol, Nombre_Ficha)) {
                    if (isEnemyPieceInPath(i, fromCol)) {
                        squares[i][fromCol].setBackground(Color.RED);
                        squares[i][fromCol].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                    } else {
                        squares[i][fromCol].setBackground(Color.GREEN);
                        squares[i][fromCol].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                    }
                }
                if (i != fromCol && isValidMove(fromRow, fromCol, fromRow, i, Nombre_Ficha)) {
                    if (isEnemyPieceInPath(fromRow, i)) {
                        squares[fromRow][i].setBackground(Color.RED);
                        squares[fromRow][i].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

                    } else {
                        squares[fromRow][i].setBackground(Color.GREEN);
                        squares[fromRow][i].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

                    }
                }
            }

        } //ALFIL
        else if (Nombre_Ficha.contains("Alfil")) {
            for (int i = 0; i < boardSize; i++) {
                for (int j = 0; j < boardSize; j++) {
                    if (isValidMove(fromRow, fromCol, i, j, Nombre_Ficha)) {
                        if (isEnemyPieceInPath(i, j)) {
                            squares[i][j].setBackground(Color.RED);
                            squares[i][j].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                        } else {
                            squares[i][j].setBackground(Color.GREEN);
                            squares[i][j].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                        }
                    }
                }
            }
        } //REY
        else if (Nombre_Ficha.contains("Rey")) {

            for (int i = -1; i < 2; i++) {
                for (int j = -1; j < 2; j++) {
                    if (i == 0 && j == 0) {
                        continue;
                    }

                    int toRow = fromRow + i;
                    int toCol = fromCol + j;

                    if (isValidMove(fromRow, fromCol, toRow, toCol, Nombre_Ficha)) {
                        if (isEnemyPieceInPath(toRow, toCol)) {
                            squares[toRow][toCol].setBackground(Color.RED);
                            squares[toRow][toCol].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                        } else {
                            squares[toRow][toCol].setBackground(Color.GREEN);
                            squares[toRow][toCol].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                        }
                    }
                }
            }
        } //REINA
        else if (Nombre_Ficha.contains("Reina")) {
            for (int i = 0; i < boardSize; i++) {
                for (int j = 0; j < boardSize; j++) {
                    if (isValidMove(fromRow, fromCol, i, j, Nombre_Ficha)) {
                        if (isEnemyPieceInPath(i, j)) {
                            squares[i][j].setBackground(Color.RED);
                            squares[i][j].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                        } else {
                            squares[i][j].setBackground(Color.GREEN);
                            squares[i][j].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                        }
                    }
                }
            }
        }
    }

    public boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol, String Nombre_Ficha) {
        // Implementa la lógica de validación del movimiento del peón
        // Por ejemplo, permite el movimiento hacia adelante y captura en diagonal

        //PEON BLANCO
        if (Nombre_Ficha.contains("PeonBlanco")) {
            if (toRow >= boardSize || toCol >= boardSize || toRow < 0 || toCol < 0) {
                return false;
            } else if (fromRow == 6) {
                return (Math.abs(toCol - fromCol) <= 1 && (fromRow - toRow <= 2) && (!isPieceInPath(toRow, toCol) && squares[fromRow - 1][fromCol].getName() == null));
            } else {
                return Math.abs(toCol - fromCol) <= 1 && (fromRow - toRow == 1) && squares[fromRow - 1][fromCol].getName() == null;
            }
        }

        //PEON NEGRO
        if (Nombre_Ficha.contains("PeonNegro")) {
            if (toRow >= boardSize || toCol >= boardSize || toRow < 0 || toCol < 0) {
                return false;
            } else if (fromRow == 1) {
                return (Math.abs(toCol - fromCol) <= 1 && Math.abs(fromRow - toRow) <= 2 && (!isPieceInPath(toRow, toCol) && squares[fromRow + 1][fromCol].getName() == null));
            } else {
                return Math.abs(toCol - fromCol) <= 1 && Math.abs(fromRow - toRow) == 1 && squares[fromRow + 1][fromCol].getName() == null;
            }
        }

        //CABALLO
        if (Nombre_Ficha.contains("Caballo")) {
            if (toRow >= boardSize || toCol >= boardSize || toRow < 0 || toCol < 0) {
                return false;
            } else {
                return Math.abs(toCol - fromCol) <= 2 && (fromRow - toRow <= 2) && !isPieceInPath(toRow, toCol);
            }
        }

        //TORRE
        if (Nombre_Ficha.contains("Torre")) {
            if (toRow >= boardSize || toCol >= boardSize || toRow < 0 || toCol < 0) {
                return false;
            } else if (fromRow == toRow) {
                // Movimiento horizontal
                int step = Integer.compare(toCol, fromCol);
                for (int i = fromCol + step; i != toCol; i += step) {
                    if (isPieceInPath(fromRow, i) || isEnemyPieceInPath(fromRow, i)) {
                        return false; // Hay una pieza en el camino
                    }
                }
            } else if (fromCol == toCol) {
                // Movimiento vertical
                int step = Integer.compare(toRow, fromRow);
                for (int i = fromRow + step; i != toRow; i += step) {
                    if (isPieceInPath(i, fromCol) || isEnemyPieceInPath(i, fromCol)) {
                        return false; // Hay una pieza en el camino
                    }
                }
            }
            return !isPieceInPath(toRow, toCol);
        }

        //ALFIL
        if (Nombre_Ficha.contains("Alfil")) {
            if (toRow >= boardSize || toCol >= boardSize || toRow < 0 || toCol < 0) {
                return false;
            } else if (Math.abs(toRow - fromRow) == Math.abs(toCol - fromCol) && fromRow != toRow && fromCol != toCol) {
                int rowStep = Integer.compare(toRow, fromRow);
                int colStep = Integer.compare(toCol, fromCol);

                int currentRow = fromRow + rowStep;
                int currentCol = fromCol + colStep;

                while (currentRow != toRow || currentCol != toCol) {
                    if (isPieceInPath(currentRow, currentCol) || isEnemyPieceInPath(currentRow, currentCol)) {
                        return false; // Hay una ficha en el camino
                    }
                    currentRow += rowStep;
                    currentCol += colStep;
                }

                return !isPieceInPath(toRow, toCol); // No hay ficha en el camino
            }
        }

        //REY
        if (Nombre_Ficha.contains("Rey")) {
            if (toRow >= boardSize || toCol >= boardSize || toRow < 0 || toCol < 0) {
                return false;
            } else {
                return Math.abs(toCol - fromCol) <= 1 && (fromRow - toRow) <= 1 && !isPieceInPath(toRow, toCol);
            }
        }

        //REINA
        if (Nombre_Ficha.contains("Reina")) {
            if (toRow >= boardSize || toCol >= boardSize || toRow < 0 || toCol < 0) {
                return false;
            } else if (fromRow == toRow || fromCol == toCol || Math.abs(toRow - fromRow) == Math.abs(toCol - fromCol)) {
                int rowStep = Integer.compare(toRow, fromRow);
                int colStep = Integer.compare(toCol, fromCol);

                int currentRow = fromRow + rowStep;
                int currentCol = fromCol + colStep;

                while (currentRow != toRow || currentCol != toCol) {
                    if (isPieceInPath(currentRow, currentCol) || isEnemyPieceInPath(currentRow, currentCol)) {
                        return false; // Hay una ficha en el camino
                    }
                    currentRow += rowStep;
                    currentCol += colStep;
                }

                return !isPieceInPath(toRow, toCol); // No hay ficha en el camino
            }
        }

        return false;
    }

    private boolean isPieceInPath(int row, int col) {
        // Verificar si hay una ficha en la casilla
        if (this.Tablero.getTurno().equals("Blanco")) {
            return squares[row][col].getName() != null && squares[row][col].getName().contains("Blanco");
        } else {
            return squares[row][col].getName() != null && squares[row][col].getName().contains("Negro");
        }
    }

    private boolean isEnemyPieceInPath(int row, int col) {
        // Verificar si hay una ficha en la casilla
        if (this.Tablero.getTurno().equals("Blanco")) {
            return squares[row][col].getName() != null && squares[row][col].getName().contains("Negro");
        } else {
            return squares[row][col].getName() != null && squares[row][col].getName().contains("Blanco");
        }
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
            if (this.Tablero.getTurno().equals("Blanco")) {
                this.Tablero.CambiarTurno(TurnoNegro);
            } else {
                this.Tablero.CambiarTurno(TurnoBlanco);
            }
            JOptionPane.showMessageDialog(null, "El turno del jugador " + this.Tablero.getTurno());
        }
        if (squares[toRow][toCol].getBackground() == Color.RED) {
            Component piece = squares[fromRow][fromCol].getComponent(0);
            Component removedPiece = squares[toRow][toCol].getComponent(0);
            squares[fromRow][fromCol].remove(piece);
            String Nombre_Ficha = squares[fromRow][fromCol].getName();
            squares[toRow][toCol].remove(removedPiece);
            squares[toRow][toCol].add(piece);
            squares[toRow][toCol].setName(Nombre_Ficha);
            squares[fromRow][fromCol].setName(null);
            repaint();
            if (this.Tablero.getTurno().equals("Blanco")) {
                this.Tablero.CambiarTurno(TurnoNegro);
            } else {
                this.Tablero.CambiarTurno(TurnoBlanco);
            }
        }
    }

    public void clearPossibleMoves() {
        // Restaura el color de fondo original de las casillas
        for (int row = 0; row < boardSize; row++) {
            for (int col = 0; col < boardSize; col++) {
                if ((row + col) % 2 == 0) {
                    squares[row][col].setBackground(new Color(194, 181, 164));
                    squares[row][col].setBorder(null);
                } else {
                    squares[row][col].setBackground(new Color(100, 70, 59));
                    squares[row][col].setBorder(null);
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

    public Tablero getTablero() {
        return this.Tablero;
    }
}
