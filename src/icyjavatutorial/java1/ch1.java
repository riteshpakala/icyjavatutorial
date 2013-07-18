/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package icyjavatutorial.java1;

import icyjavatutorial.Main;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Ritesh
 */
public class ch1 {
       
    /********** Page 1 **********/
    private static Button next = new Button("Next");
    private static Button back = new Button("Back");
    private static HBox hbox = new HBox();
    /********** Page 1 **********/
    
    /********** Page 2 **********/
    private static Button next2 = new Button("Next");
    private static Button back2 = new Button("Back");
    private static HBox hbox2 = new HBox();
    /********** Page 2 **********/
    
    /********** Page 3 **********/
    private static Button next3 = new Button("Next");
    private static Button back3 = new Button("Back");
    private static HBox hbox3 = new HBox();
    /********** Page 3 **********/
    
    /********** Page 4 **********/
    public static ObservableList<Node> content4;
    private static Button home = new Button("Home");
    private static Button toc = new Button("TOC");
    private static Button back4 = new Button("Back");
    private static HBox hbox4 = new HBox();
    /********** Page 4 **********/
    
    private static Scene scene, scene2, scene3, scene4;
    
    public ch1(final Image page1, final Image page2, final Image page3, final Image page4){
        /********** Page 1 **********/
        scene = getScene();
        Canvas canvas = getCanvas();
        ObservableList<Node> content = getContent(scene);
        
        
        hbox.getChildren().addAll(back, next);
        hbox.setPadding(new Insets(453, 5, 5, 5));
        hbox.setSpacing(10);
        
        getGC(canvas).drawImage(page1, (double)0, (double)0, (double)640, (double)480);
        content.addAll(canvas, hbox);
        /********** Page 1 **********/
        
        /********** Page 2 **********/
        scene2 = getScene();
        Canvas canvas2 = getCanvas();
        ObservableList<Node> content2 = getContent(scene2);

        getGC(canvas2).drawImage(page2, (double)0, (double)0, (double)640, (double)480);
        hbox2.getChildren().addAll(back2, next2);
        hbox2.setPadding(new Insets(453, 5, 5, 5));
        hbox2.setSpacing(10);

        content2.addAll(canvas2, hbox2);
        /********** Page 2 **********/
        
        /********** Page 3 **********/
        scene3 = getScene();
        Canvas canvas3 = getCanvas();
        ObservableList<Node> content3 = getContent(scene3);

        getGC(canvas3).drawImage(page3, (double)0, (double)0, (double)640, (double)480);
        hbox3.getChildren().addAll(back3, next3);
        hbox3.setPadding(new Insets(453, 5, 5, 5));
        hbox3.setSpacing(10);

        content3.addAll(canvas3, hbox3);
        /********** Page 3 **********/
        
        /********** Page 4 **********/
        scene4 = getScene();
        Canvas canvas4 = getCanvas();
        content4 = getContent(scene4);

        getGC(canvas4).drawImage(page4, (double)0, (double)0, (double)640, (double)480);
        
        
        hbox4.getChildren().addAll(back4, home, toc);
        hbox4.setPadding(new Insets(453, 5, 5, 5));
        hbox4.setSpacing(10);

        content4.addAll(canvas4, hbox4);
        /********** Page 4 **********/
        
        
    }
    public void start(final Stage primaryStage){

        /********** Page 1 **********/
        
        
        primaryStage.setTitle("Chapter 1 - Page 1");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        back.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        primaryStage.setTitle("Table of Contents");
                        primaryStage.setScene(Main.toc);
                        primaryStage.show();
                    }
                });
        
        next.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        
                        primaryStage.setTitle("Chapter 1 - Page 2");
                        primaryStage.setScene(scene2);
                        primaryStage.show();
                    }
                });
        /********** Page 1 **********/
        
        
        /********** Page 2 **********/
       
        
        
        back2.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        
                        primaryStage.setTitle("Chapter 1 - Page 1");
                        primaryStage.setScene(scene);
                        primaryStage.show();
                    }
                });
        
        next2.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        
                        primaryStage.setTitle("Chapter 1 - Page 3");
                        primaryStage.setScene(scene3);
                        primaryStage.show();
                    }
                });
        
        
        /********** Page 2 **********/
        
        /********** Page 3 **********/
       
        
        back3.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        
                        primaryStage.setTitle("Chapter 1 - Page 2");
                        primaryStage.setScene(scene2);
                        primaryStage.show();
                    }
                });
        
        next3.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        
                        primaryStage.setTitle("Chapter 1 - Page 4");
                        primaryStage.setScene(scene4);
                        primaryStage.show();
                    }
                });
        
        /********** Page 3 **********/
        
        /********** Page 4 **********/
       
        
        
        back4.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        
                        primaryStage.setTitle("Chapter 1 - Page 3");
                        primaryStage.setScene(scene3);
                        primaryStage.show();
                    }
                });
        
        home.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        
                        primaryStage.setTitle("IcyJava");
                        primaryStage.setScene(Main.scene);
                        primaryStage.show();
                    }
                });
        
        toc.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        
                        primaryStage.setTitle("Table of Contents");
                        primaryStage.setScene(Main.toc);
                        primaryStage.show();
                    }
                });
        
        /********** Page 4 **********/
        
    }
    
    public Scene getScene(){
        Scene scene = new Scene(new Group(), 640, 480, Color.WHITE);
        return scene;
    } 
    
    public ObservableList<Node> getContent(Scene scene){
        ObservableList<Node> content = ((Group) scene.getRoot()).getChildren();
        return content;
    }
    
    public Canvas getCanvas(){
        Canvas canvas = new Canvas(640,480);
        return canvas;
    }
    
    public GraphicsContext getGC(Canvas canvas){
        GraphicsContext gc = canvas.getGraphicsContext2D();
        return gc;
    }
    
    public ObservableList<Node> getContent4(){
        return content4;
    }
}
