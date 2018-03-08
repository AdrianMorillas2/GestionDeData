import java.awt.Graphics;
import java.io.IOException;

import control.PuzzleController;
import model.BoardModel;
import view.BoardView;
import view.PuzzleGUI;

/*
 * Copyright 2016 Miguel Ã�ngel RodrÃ­guez-GarcÃ­a (miguel.rodriguez@urjc.es).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Clase principal que ejecuta el juego
 * @Author Miguel Ã�ngel
 * @version 1.0
 */
public class PuzzleApp {

    public static void main(String args[]) throws IOException{
    	//TODO: Poner estas variables con valores que pasas por argumentos 
        int imageSize = 32;
        int rowNum = 3;
        int columnNum= 3;

        String fileSeparator = System.getProperty("file.separator");
        String imagePath=System.getProperty("user.dir")+fileSeparator+"resources"+fileSeparator;

        String[] imageList={imagePath+"blank.gif",imagePath+"one.gif",imagePath+"two.gif",imagePath+"three.gif",imagePath+ "four.gif",
                imagePath+"five.gif",imagePath+"six.gif",imagePath+"seven.gif",imagePath+"eight.gif"};


        // Creamos el modelo
        BoardModel board =  new BoardModel(rowNum,columnNum,imageSize, imageList);

        // Creamos el controlador
        PuzzleController controller =  new PuzzleController();
        
        // Inicializamos la GUI
        PuzzleGUI.initialize(controller, rowNum, columnNum, imageSize, imageList);
        
        // Obtenemos la vista del tablero
        BoardView boardView = PuzzleGUI.getBoardView();

        // AÃ±adimos un nuevo observador al controlador
        controller.addObserver(boardView);
        controller.addObserver(board);

        // Visualizamos la aplicaciÃ³n.
        PuzzleGUI p =PuzzleGUI.getInstance();
        
        //boardView.paint(p.getGraphics());
    }
}
