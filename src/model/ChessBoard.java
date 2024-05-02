package model;

import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Array;
import java.util.*;

public class ChessBoard extends GridPane {

  private final Field[][] fields;

  public ChessBoard() throws FileNotFoundException{
    fields = new Field[8][8];
    ArrayList<String> map = new ArrayList<>();
    //char[][] map = new char[8][8];
    File file = new File("src/resources/map.csv");
    Scanner scanner = new Scanner(file);
    while (scanner.hasNextLine()) { // gibt es noch eine weitere Zeile in der Datei
      String line = scanner.nextLine(); // einlesen der nächsten Zeile
      map.add(line);
    }

    for (int i = 0; i < map.size(); i++) {
      String line = map.get(i);
      for (int j = 0; j < line.length(); j++) {
        Field s = new Field(i + 1, (char) (j + 65));
        add(s, j, i); // switched row and column to avoid a 90° rotation
        fields[i][j] = s;
        System.out.println(("Line[" + i + "]: " + line));
        if (line.charAt(j) == 'W') {
          fields[i][j].setFigure(new ChessFigure(ChessFigureType.KING, ChessColor.WHITE,
                  new Image(getClass().getResourceAsStream("../resources/water.png"))));
        }
        else if (line.charAt(j) == 'G'){
          fields[i][j].setFigure(new ChessFigure(ChessFigureType.KING, ChessColor.WHITE,
                  new Image(getClass().getResourceAsStream("../resources/gras.png"))));
        }
       // if (line.charAt(i) == '1') {
          //System.out.println("[" + j + "][" + i + "]:" + );
          //fields[j][i].setFigure(new ChessFigure(ChessFigureType.KING, ChessColor.WHITE,
                  //new Image(getClass().getResourceAsStream("../resources/water.png"))));
        //}
      }
      System.out.println(line);
    }


    /*for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        Color color = i % 2 == 0 ? j % 2 == 0 ? Color.YELLOW : Color.SADDLEBROWN
            : j % 2 == 0 ? Color.valueOf("#03dffc") : Color.SANDYBROWN;
        Field s = new Field(j + 1, (char) (i + 65), color);
        add(s, i, j);
        fields[i][j] = s;
      }
    }*/

    /*fields[0][0].setFigure(new ChessFigure(ChessFigureType.ROOK, ChessColor.WHITE,
        new Image(getClass().getResourceAsStream("../resources/water.png"))));
    fields[1][0].setFigure(new ChessFigure(ChessFigureType.KNIGHT, ChessColor.WHITE,
        new Image(getClass().getResourceAsStream("../resources/water.png"))));
    fields[2][0].setFigure(new ChessFigure(ChessFigureType.BISHOP, ChessColor.WHITE,
        new Image(getClass().getResourceAsStream("../resources/water.png"))));
    fields[3][0].setFigure(new ChessFigure(ChessFigureType.KING, ChessColor.WHITE,
        new Image(getClass().getResourceAsStream("../resources/water.png"))));
    fields[4][0].setFigure(new ChessFigure(ChessFigureType.QUEEN, ChessColor.WHITE,
        new Image(getClass().getResourceAsStream("../resources/water.png"))));
    fields[5][0].setFigure(new ChessFigure(ChessFigureType.BISHOP, ChessColor.WHITE,
        new Image(getClass().getResourceAsStream("../resources/water.png"))));
    fields[6][0].setFigure(new ChessFigure(ChessFigureType.KNIGHT, ChessColor.WHITE,
        new Image(getClass().getResourceAsStream("../resources/water.png"))));
    fields[7][0].setFigure(new ChessFigure(ChessFigureType.ROOK, ChessColor.WHITE,
        new Image(getClass().getResourceAsStream("../resources/water.png"))));
    for (int i = 0; i < 8; i++) {
      fields[i][1].setFigure(new ChessFigure(ChessFigureType.PAWN, ChessColor.WHITE,
          new Image(getClass().getResourceAsStream("../resources/water.png"))));
    }

    fields[0][7].setFigure(new ChessFigure(ChessFigureType.ROOK, ChessColor.BLACK,
        new Image(getClass().getResourceAsStream("../resources/water.png"))));
    fields[1][7].setFigure(new ChessFigure(ChessFigureType.KNIGHT, ChessColor.BLACK,
        new Image(getClass().getResourceAsStream("../resources/water.png"))));
    fields[2][7].setFigure(new ChessFigure(ChessFigureType.BISHOP, ChessColor.BLACK,
        new Image(getClass().getResourceAsStream("../resources/water.png"))));
    fields[3][7].setFigure(new ChessFigure(ChessFigureType.KING, ChessColor.BLACK,
        new Image(getClass().getResourceAsStream("../resources/water.png"))));
    fields[4][7].setFigure(new ChessFigure(ChessFigureType.QUEEN, ChessColor.BLACK,
        new Image(getClass().getResourceAsStream("../resources/water.png"))));
    fields[5][7].setFigure(new ChessFigure(ChessFigureType.BISHOP, ChessColor.BLACK,
        new Image(getClass().getResourceAsStream("../resources/water.png"))));
    fields[6][7].setFigure(new ChessFigure(ChessFigureType.KNIGHT, ChessColor.BLACK,
        new Image(getClass().getResourceAsStream("../resources/water.png"))));
    fields[7][7].setFigure(new ChessFigure(ChessFigureType.ROOK, ChessColor.BLACK,
        new Image(getClass().getResourceAsStream("../resources/water.png"))));
    for (int i = 0; i < 8; i++) {
      fields[i][6].setFigure(new ChessFigure(ChessFigureType.PAWN, ChessColor.BLACK,
              new Image(getClass().getResourceAsStream("../resources/water.png"))));
    }*/

  }

  public Field[][] getFields() {
    return fields;
  }
}
