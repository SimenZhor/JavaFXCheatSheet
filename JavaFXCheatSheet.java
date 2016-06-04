import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.image.*;
import javafx.geometry.Insets;
import javafx.scene.input.MouseEvent;
import javafx.event.*;

public class JavaFXCheatSheet extends Application{

  @Override
  public void start(Stage primaryStage) {
    /*
      Det aller viktigste:
    */
    GridPane grid = new GridPane();
    Scene scene = new Scene(grid,380,395); //bredde,hoyde
    primaryStage.setScene(scene);

    /*
      Denne koden får man oppgitt i eksamen:
    */
    final Image unpopped = new Image("unpopped.jpg");
    final Image popped = new Image("popped.jpg");

    /*
      Bestemmer griden/brettet:
    */
    int ruterbredde = 5;
    int ruterhoyde = 5;

    for (int h = 0; h < ruterhoyde; h++){
      for (int b = 0; b < ruterbredde; b++){
        final ImageView imv = new ImageView();
        imv.setImage(unpopped);

        /*
        imv.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
          if(imv.getImage() == unpopped){
            imv.setImage(popped);
          }
        });
        */
        /*
        evt:
        *//*
        imv.setOnMouseClicked(new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent event){
            if(imv.getImage() == unpopped){
              imv.setImage(popped);
            }
          }
        });
        */
        imv.setOnMouseClicked(event -> {
          if(imv.getImage() == unpopped){
            imv.setImage(popped);
          }
        });

        grid.add(imv,b,h);

      }
    }

    primaryStage.show();
  }

}
