package sharedObject;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javafx.scene.image.Image;

public class RenderableHolder {
	private static final RenderableHolder instance = new RenderableHolder();
	
	private List<IRenderable> entities;
	private Comparator<IRenderable> comparator;
	
	public static Image backgroundMM , backgroundGS ,backgroundGO;
	
	static {
		loadResource();
	}
	
	public static void loadResource() {
		backgroundMM = new Image(ClassLoader.getSystemResource("background/bg1.png").toString());
		backgroundGS = new Image(ClassLoader.getSystemResource("background/bg2.png").toString());
	}
	
	public static RenderableHolder getInstance() {
		return instance;
	}
	
	public void add(IRenderable entity) {
		entities.add(entity);
		Collections.sort(entities, comparator);
	}
	
	public void update() {
		for (int i = entities.size()-1 ; i>=0 ; i--) {
			if(entities.get(i).isDestroyed()) entities.remove(i);
		}
	}
	
	public void clear() {
		entities.clear();
	}
	
	public List<IRenderable> getEntities(){
		return entities;
	}
}
