/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author david
 */
public class SquareMouseListener extends MouseAdapter {

    private int row;
    private int col;
    private Prueba vista;

    public SquareMouseListener(int row, int col, Prueba vista) {
        this.row = row;
        this.col = col;
        this.vista = vista;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (this.vista.getSelectedRow() == -1 && this.vista.getSelectedCol() == -1) {
            this.vista.setSelectedRow(row);
            this.vista.setSelectedCol(col);
            if (this.vista.getSquares()[row][col].getName() != null) {
                System.out.println(this.vista.getSquares()[row][col].getName());
                this.vista.showPossibleMoves(this.vista.getSelectedRow(), this.vista.getSelectedCol(), this.vista.getSquares()[row][col].getName());
            } else {
                System.out.println("Casilla Vacia");
                this.vista.clearPossibleMoves();
            }
            this.vista.setFicha_a_mover(this.vista.getSquares()[row][col].getName());
        } else {
            if (this.vista.isValidMove(this.vista.getSelectedRow(), this.vista.getSelectedCol(), row, col, this.vista.getFicha_a_mover())) {
                this.vista.swapPieces(this.vista.getSelectedRow(), this.vista.getSelectedCol(), row, col);
            }

            // Mueve la ficha seleccionada a la nueva posición
            this.vista.clearPossibleMoves();
        }
    }
}
