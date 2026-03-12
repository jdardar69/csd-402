import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXLayoutExample extends Application {

    @Override
    public void start(Stage stage) {
        Label title = new Label("VBox Example");
        Button btn1 = new Button("Option 1");
        Button btn2 = new Button("Option 2");
        Button btn3 = new Button("Option 3");

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10));
        vbox.getChildren().addAll(title, btn1, btn2, btn3);

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(10);
        grid.setVgap(10);

        Label userLabel = new Label("Username:");
        TextField userField = new TextField();

        Label passLabel = new Label("Password:");
        TextField passField = new TextField();

        Button loginBtn = new Button("Login");

        grid.add(userLabel, 0, 0);
        grid.add(userField, 1, 0);
        grid.add(passLabel, 0, 1);
        grid.add(passField, 1, 1);
        grid.add(loginBtn, 1, 2);

        VBox mainLayout = new VBox(20);
        mainLayout.getChildren().addAll(vbox, grid);

        Scene scene = new Scene(mainLayout, 350, 300);

        stage.setTitle("JavaFX VBox and GridPane Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}