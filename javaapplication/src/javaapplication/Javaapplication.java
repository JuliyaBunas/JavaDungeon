package javaapplication;

import static java.awt.AlphaComposite.SRC_OVER;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import static javafx.application.Application.launch;
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
public class Javaapplication extends Application {
    private static final double W = 1920, H = 1080;

    private static final String HERO_IMAGE_LOC =
            "https://raw.githubusercontent.com/JuliyaBunas/JavaDungeon/master/ForIlia.gif";

    private Image heroImage;
    private Node  hero;
    boolean running, goNorth, goSouth, goEast, goWest, attack;
    @Override
    public void start(Stage stage) throws Exception {
        
        
        
        
        heroImage = new Image(HERO_IMAGE_LOC);
        hero = new ImageView(heroImage);
        hero.setLayoutY(700);

        moveHeroTo( 2, 2);
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Group dungeon = new Group(root, hero);
        
        Scene scene = new Scene(dungeon, W, H, Color.FORESTGREEN);
        
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode()) {
                    case W:    goNorth = true; FXMLDocumentController.goNorth = true; break;
                    case S:  goSouth = true; FXMLDocumentController.goSouth = true; break;
                    case A:  goWest  = true; FXMLDocumentController.goWest = true; break;
                    case D: goEast  = true; FXMLDocumentController.goEast = true; break;
                    case SHIFT: running = true; FXMLDocumentController.running = true; break;
                    case SPACE: attack = true; FXMLDocumentController.attack = true; break;
                }
            }
        });

        scene.setOnKeyReleased((KeyEvent event) -> {
            switch (event.getCode()) {
                case W:    goNorth = false; FXMLDocumentController.goNorth = false; break;
                case S:  goSouth = false; FXMLDocumentController.goSouth = false; break;
                case A:  goWest  = false;  FXMLDocumentController.goWest = false; break;
                case D: goEast  = false; FXMLDocumentController.goEast = false; break;
                case SHIFT: running = false; FXMLDocumentController.running = false; break;
                case SPACE: attack = true; FXMLDocumentController.attack = false; break;
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
            y - cy >= 415 &&
            y + cy <= H-30) {
            hero.relocate(x - cx, y - cy);
            FXMLDocumentController.px = hero.getLayoutX();
            FXMLDocumentController.py = hero.getLayoutY();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}

