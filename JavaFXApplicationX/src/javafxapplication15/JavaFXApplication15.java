/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication15;

import static java.awt.AlphaComposite.SRC_OVER;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.BlendMode;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author PC
 */
public class JavaFXApplication15 extends Application {
    private static final double W = 1920, H = 1080;

    private static final String HERO_IMAGE_LOC =
            "https://i.pinimg.com/originals/d7/b3/da/d7b3da3d4b19b7f0c44673374158df0a.gif";

    private Image heroImage;
    private Node  hero;
    boolean running, goNorth, goSouth, goEast, goWest;
    @Override
    public void start(Stage stage) throws Exception {
        
        
        
        
        heroImage = new Image(HERO_IMAGE_LOC);
        hero = new ImageView(heroImage);
        

        moveHeroTo( 2, 2);
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Group dungeon = new Group(root, hero);
        
        Scene scene = new Scene(dungeon, W, H, Color.FORESTGREEN);
        
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode()) {
                    case W:    goNorth = true; break;
                    case S:  goSouth = true; break;
                    case A:  goWest  = true; break;
                    case D: goEast  = true; break;
                    case SHIFT: running = true; break;
                }
            }
        });

        scene.setOnKeyReleased((KeyEvent event) -> {
            switch (event.getCode()) {
                case W:    goNorth = false; break;
                case S:  goSouth = false; break;
                case A:  goWest  = false; break;
                case D: goEast  = false; break;
                case SHIFT: running = false; break;
            }
         });
        stage.setScene(scene);
        stage.show();
    

     AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                int dx = 0, dy = 0;

                if (goNorth) dy -= 2;
                if (goSouth) dy += 2;
                if (goEast)  dx += 2;
                if (goWest)  dx -= 2;
                if (running) { dx *= 4; dy *= 4; }

                moveHeroBy(dx, dy);
            }
        };
        timer.start();
    }

    private void moveHeroBy(int dx, int dy) {
        if (dx == 0 && dy == 0) return;

        final double cx = hero.getBoundsInLocal().getWidth()  / 2;
        final double cy = hero.getBoundsInLocal().getHeight() / 2;

        double x = cx + hero.getLayoutX() + dx;
        double y = cy + hero.getLayoutY() + dy;

        moveHeroTo(x, y);
    }

    private void moveHeroTo(double x, double y) {
        final double cx = hero.getBoundsInLocal().getWidth()  / 2;
        final double cy = hero.getBoundsInLocal().getHeight() / 2;

        if (x - cx >= 0 &&
            x + cx <= W &&
            y - cy >= 0 &&
            y + cy <= H) {
            hero.relocate(x - cx, y - cy);
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}

