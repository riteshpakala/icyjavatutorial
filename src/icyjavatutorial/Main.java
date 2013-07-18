/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package icyjavatutorial;

import icyjavatutorial.java1.ch1;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
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
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Ritesh
 */
public class Main extends Application {
    
    public static ObservableList<Node> content, content2;
    public static Scene scene, toc;
    public static Hyperlink link, link2;
    
    
    /******************
         * 
         * Buttons
         * 
         */
    
     private static Button Java1btn = new Button("Basics of Java");
     private static Button back = new Button("Back");
     private static Button Javafx1btn = new Button();
     
     private static Button chapter1 = new Button("Chapter 1");
     
     private static VBox vbox = new VBox(); 
     private static VBox hbox = new VBox();  
     private static VBox tocBox = new VBox();
    /******************/
        
    @Override
    public void start(final Stage primaryStage) {
        scene = new Scene(new Group(), 640, 480, Color.WHITE);
        toc = new Scene(new Group(), 640, 480, Color.WHITE);
        content = ((Group) scene.getRoot()).getChildren();
        content2 = ((Group) toc.getRoot()).getChildren();
        Canvas canvas = new Canvas(640, 480);
        Canvas tocCanvas = new Canvas(640, 480);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        GraphicsContext tocGc = tocCanvas.getGraphicsContext2D();
        /******************
         * 
         * Images
         * 
         */
         
        final Image logo = new Image(getClass().getResourceAsStream("res/logo.png"));
        gc.drawImage(logo, 555, 460, 80, 15);
        
        final Image bgd = new Image(getClass().getResourceAsStream("res/bgd.png"));
        gc.drawImage(bgd, 0, 0, 640, 480);
        
        final Image tocBgd = new Image(getClass().getResourceAsStream("res/toc.png"));
        tocGc.drawImage(tocBgd, 0, 0, 640, 480);
        /******************/
        
        
        
        
        
        /*********JAVA CHAPTER 1 ******************/
                
                final Image page1 = new Image(getClass().getResourceAsStream("res/ch1/page1.png"));
                final Image page2 = new Image(getClass().getResourceAsStream("res/ch1/page2.png"));
                final Image page3 = new Image(getClass().getResourceAsStream("res/ch1/page3.png"));
                final Image page4 = new Image(getClass().getResourceAsStream("res/ch1/page4.png"));
                
                final Image netbeanLogo = new Image(getClass().getResourceAsStream("res/netbeansLogo.png"));
                final Image javaLogo = new Image(getClass().getResourceAsStream("res/javaLogo.png"));
                
                
                final ch1 ch1 = new ch1(page1, page2, page3, page4);
                chapter1.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        
                        ch1.start(primaryStage);
                    }
                });
                
                link = new Hyperlink();
                link2 = new Hyperlink();
                
                
                
                link.setGraphic(new ImageView(netbeanLogo));
                link2.setGraphic(new ImageView(javaLogo));

                link.setTranslateX(480);
                link.setTranslateY(10);
                
                link2.setTranslateX(480);
                link2.setTranslateY(135);

                link.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e){

                            getHostServices().showDocument("http://www.oracle.com/technetwork/java/javase/downloads/index.html");

                        }
                    });

                link2.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e){

                            getHostServices().showDocument("http://www.oracle.com/technetwork/java/javase/downloads/index.html");

                        }
                    });
                
            link.setPrefSize(125, 125);
            link2.setPrefSize(125, 125);
            ch1.getContent4().addAll(link, link2);
        /********************************************/
        
        hbox.getChildren().add(back);
        hbox.setPadding(new Insets(453, 5, 5, 5));
        hbox.setSpacing(20);
        
        tocBox.getChildren().add(chapter1);
        tocBox.setAlignment(Pos.CENTER);
        tocBox.setPadding(new Insets(210, 5, 5, 280));
        tocBox.setSpacing(20);        
        content2.addAll(tocCanvas, tocBox, hbox);
        
        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setTitle("IcyJava");
                primaryStage.setScene(scene);
                primaryStage.show();
            }
        });
        
        Java1btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setTitle("Table of Contents");
                primaryStage.setScene(toc);
                primaryStage.show();
            }
        });
        
        vbox.getChildren().add(Java1btn);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(210, 5, 5, 265));
        vbox.setSpacing(20);
        content.addAll(canvas, vbox);
        primaryStage.setTitle("IcyJava");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
