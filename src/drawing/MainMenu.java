package drawing;

import javafx.application.Platform;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import sharedObject.RenderableHolder;
import window.SceneManager;

public class MainMenu extends Canvas {
	
	
	
	public MainMenu() {
		super(SceneManager.Scene_WIDTH,SceneManager.Scene_HEIGHT);
		
		GraphicsContext gc = this.getGraphicsContext2D();
		gc.drawImage(RenderableHolder.backgroundMM, 0, 0, SceneManager.Scene_WIDTH, SceneManager.Scene_HEIGHT);
		gc.setTextAlign(TextAlignment.CENTER);
		gc.setFill(Color.WHITE);
		gc.setFont(Font.font(70));
		gc.fillText("Knight Run", SceneManager.Scene_WIDTH/2, SceneManager.Scene_HEIGHT/4);
		gc.setFont(Font.font(40));
		gc.fillText("Press Enter to Start", SceneManager.Scene_WIDTH/2, SceneManager.Scene_HEIGHT * 3 / 4);
		
//		this.addKeyEventHadler();
	}
/*	
	private void addKeyEventHandler() {
		this.setOnKeyPressed(new EventHandler<KeyEvent>() {
			
			@Override
			public void handle(KeyEvent event) {
				if(event.getCode()== KeyCode.ENTER) {
					//GameMain.newGame();
				} else if (event.getCode() == KeyCode.ESCAPE) {
					Platform.exit();
				}
			}
			
		});
	}
	*/
		
}
