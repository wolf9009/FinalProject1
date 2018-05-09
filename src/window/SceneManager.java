package window;

import drawing.MainMenu;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public final class SceneManager {
	private static Stage primaryStage;
	private static Canvas mainMenuCanvas = new MainMenu();
	private static Scene mainMenuScene = new Scene(new Pane(mainMenuCanvas));
	public static final int Scene_WIDTH = 900;
	public static final int Scene_HEIGHT = 600;
	
	public static void initialize(Stage stage) {
		primaryStage = stage;
		primaryStage.show();
	}
	
	public static void gotoMainMenu() {
		primaryStage.setScene(mainMenuScene);
		mainMenuCanvas.requestFocus();
	}
	
	public static void gotoSceneOf(Canvas canvas) {
		primaryStage.setScene(new Scene(new Pane(canvas), 900, 600));
		canvas.requestFocus();
	}
}
