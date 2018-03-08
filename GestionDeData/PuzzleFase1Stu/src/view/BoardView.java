package view;

import observer.Observer;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa la vista del tablero
 * @author Miguel Ã�ngel
 * @version 1.0
 */
public class BoardView extends JPanel implements Observer {
    public static final int imageWidth= 96;
    public static final int imageHeight= 96;
    private List<PieceView> iconArray = null;

    public BoardView(int rowNum, int columnNum,int imageSize, String[] imageList) throws IOException{
        super();
        int count = 0;
        iconArray =  new ArrayList<PieceView>();
        for(String st:imageList){
        	iconArray.add(new PieceView(count, rowNum, columnNum, imageSize, imageList[count]));
        		count++;
        }
        
        System.out.println(toString());
    }

    

	public BoardView(int rowNum, int columnNum, int imageSize, File imageFile){
        super();
    }

    //redimensionamos la imagen para 96*96
    private BufferedImage resizeImage(File fileImage){
        BufferedImage resizedImage = null;

        return(resizedImage);
    }

    //dividimos la imagen en el nÃºmero
    private BufferedImage[] splitImage(BufferedImage image){
        //Divisor de imÃ¡genes
        BufferedImage images[] = null;
        return(images);
    }
    
    public void update(int blankPos, int movedPos){
    		
    }

    public void update(Graphics g){
    	paint(g);
    }

    public void paint(Graphics g){
    	for(PieceView iconImage:iconArray){
    		//g.drawOval(5,5,5,5);
            g.drawImage(iconImage.getImage(), 0, 0, this);
            System.out.println(iconImage.getDescription());
        }
    	
    	
    	
    	/*int rowNum = iconArray.size();
    	int columnNum = iconArray.get(0).size();
    	
    	for(int i = 0; i < rowNum; i++){
        	for (int z = 0; z < columnNum; z++){

        		g.drawImage(iconArray.get(0).get(2).getImage(), 50,
        				50, this);
        		System.out.println(iconArray.get(i).get(z).getImage().toString()+" "+ iconArray.get(i).get(z).getImageSize());
        	}
        	
        }
    	g.drawImage(iconArray.get(i).get(z), iconArray.get(i).get(z).getDrawnRowIndex(),
				iconImage.getDrawnColumnIndex(), iconImage.getImageSize(),
				iconImage.getImageSize(), this);*/
        
    }

    //Dado una posicion X e Y localizar una pieza
    private int locatePiece(int posX,int posY){
        return(-1);
    }

    /**
     * Mueve la pieza y devuelve las coordenadas en un array de dos posiciones
     * donde: la primera posicion representa la posicion actual de la pieza blanca
     * y la segunda posicion representa la posicion actual de la pieza a mover.
     * @param posX posicion X del puntero
     * @param posY posicion Y del puntero.
     * @return Array de dos posiciones: posicion actual de la pieza blanca y posicion
     * actual de la pieza que tiene que ser movida.
     */
    public int[] movePiece(int posX,int posY){

        return(null);
    }
    
    //@Override
	/*public String toString() {
    	int rowNum = iconArray.size();
    	int columnNum = iconArray.get(0).size();
    	String aux = "";
    	
    	for(int i = 0; i < rowNum; i++){
        	for (int z = 0; z < columnNum; z++){
        		aux += iconArray.get(i).get(z)+" - ";
        	}
        }
		return aux;
	}*/

}
