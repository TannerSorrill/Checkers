/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkers;

import java.util.Random;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Tanner
 */
public class CheckerBoard {
    private int	numRows;
    private int	numCols;	
    private int	boardWidth;
    private int	boardHeight;
    private Color lightColor;
    private Color darkColor;
    private GridPane gridPane = new GridPane();

    public CheckerBoard(int numRows, int numCols, int boardWidth, int boardHeight){
        this.darkColor = Color.BLACK;
        this.lightColor = Color.RED;
        this.numRows = numRows;
        this.numCols = numCols;
        this.boardHeight = boardHeight;
        this.boardWidth = boardWidth;
               
    }
    public CheckerBoard(int numRows, int numCols, int boardWidth, int boardHeight, Color lightColor, Color darkColor){
        this(numRows,numCols,boardWidth,boardHeight);
        this.lightColor = lightColor;
        this.darkColor = darkColor;              
    }
    
    public GridPane build(){
     
      for (int rows  = 0; rows < numRows; rows++) {
          for (int cols = 0; cols < numCols; cols++) {
            Rectangle square = new Rectangle();
            Color squareColor;
            if ((rows + cols) % 2 == 0) squareColor = lightColor; //even pieces are light color
                else squareColor = darkColor; //odds black
                square.setFill(squareColor);
                gridPane.add(square, cols, rows);
                square.widthProperty().bind(gridPane.widthProperty().divide(numRows)); //automatic sizing
                square.heightProperty().bind(gridPane.heightProperty().divide(numCols)); //automatic sizing
            }
        }
        return gridPane;
        
    }
    public GridPane getBoard(){
        if (gridPane == null){
            return null;
        }
        return this.gridPane;
    }
    
    public int getNumRows(){
        return this.numRows;     
    }
 
    public int getNumCols(){
        return this.numCols;
    }
    
    public int getWidth(){
       return this.boardWidth; 
    }	
    
    public int getHeight(){
        return this.boardHeight;
    }
        
    public Color getLightColor(){
        return this.lightColor;
    }
    public Color getDarkColor(){
        return this.darkColor;
    }
                    
    public int getSquareWidth(){
        return (this.boardHeight * this.boardHeight);
        
    }	
                    
    public int getSquareHeight(){
        return (this.boardHeight * this.boardHeight);
    }
   
    
    
   }
