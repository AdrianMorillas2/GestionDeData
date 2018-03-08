package view;

import javax.swing.*;
import java.awt.*;

/**
 * Clase que representa la vista del tablero
 * @author Miguel Ã�ngel
 * @version 1.0
 */								/*???????????**/
public class PieceView extends ImageIcon implements Cloneable{

    //id de la imagen
    private int id;
    //Ã­ndice de fila
    private int indexRow;
    //Ã­ndice de columna
    private int indexColumn;
    //TamaÃ±o de la imagen
    private int imageSize;
    //AAAAA
    private ImageIcon icono;


    /**
     * Constructor de una clase
     * @param indexRow indice de fila
     * @param indexColumn indice de columna
     * @param imagePath ubicaciÃ³n de la imagen.
     */
    public PieceView(int id,int indexRow, int indexColumn,int imageSize,String imagePath){
        super();
        this.id=id;
        this.indexRow=indexRow;
        this.indexColumn=indexColumn;
        this.imageSize=imageSize;
        //this.icono= new ImageIcon(imagePath);
    }

    public PieceView(int id, int indexRow, int indexColumn,int imageSize,Image image){
        super();
        this.id=id;
        this.indexRow=indexRow;
        this.indexColumn=indexColumn;
        this.imageSize=imageSize;
        
        this.setImage(image);
        
        
    }


    public int getIndexRow() {
        return indexRow;
    }

    public int getIndexColumn() {
        return indexColumn;
    }


    public int getImageSize() {
        return imageSize;
    }

    public void setImageSize(int imageSize) {
        this.imageSize = imageSize;
    }

    public int getId(){
        return this.id;
    }

    public String toString(){
        return("id:"+id);
    }

}
