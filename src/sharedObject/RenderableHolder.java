package sharedObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javafx.scene.image.Image;

public class RenderableHolder {
	private static final RenderableHolder instance = new RenderableHolder();
	
	private List<IRenderable> entities;
	private Comparator<IRenderable> comparator;
	
	public static Image backgroundMM, backgroundGS, backgroundGO, randomBox, bossBullet, roundBulletB, roundBulletY, roundBulletR, roundBulletP, bullet, eGod, eGoku, eGorem, eGrim, eGrimreaper , player, exploArr[];
//	public static AudioClip ;
//	public static Font ;
//  public static AudioClip[] explosions;
	
	static {
		loadResource();
	}
	
	public RenderableHolder() {
		entities = Collections.synchronizedList(new ArrayList<>());
		comparator = (IRenderable o1, IRenderable o2) -> {
			if (o1.getZ() > o2.getZ()) {
				return 1;
			}
			return -1;
		};
	}

	
	public static void loadResource() {
		backgroundMM = new Image(ClassLoader.getSystemResource("background/bg1.png").toString());
		backgroundGS = new Image(ClassLoader.getSystemResource("background/bg2.png").toString());
		
		player = new Image(ClassLoader.getSystemResource("player/dragon.gif").toString());
		
		eGod = new Image(ClassLoader.getSystemResource("enemy/eGod.gif").toString());
		eGoku = new Image(ClassLoader.getSystemResource("enemy/eGoku.gif").toString());
		eGorem = new Image(ClassLoader.getSystemResource("enemy/eGorem.gif").toString());
		eGrim = new Image(ClassLoader.getSystemResource("enemy/eGrim.gif").toString());
		eGrimreaper = new Image(ClassLoader.getSystemResource("enemy/eGrimreaper.gif").toString());
		
		exploArr = new Image[12];
		for (int i = 0; i < 12; i++) {
			exploArr[i] = new Image(ClassLoader.getSystemResource("explosion/explosion/" + i + ".gif").toString());
		}
		
		bullet = new Image(ClassLoader.getSystemResource("bullet/bullet.png").toString());
		bossBullet = new Image(ClassLoader.getSystemResource("bullet/bossBullet.gif").toString());
		roundBulletB = new Image(ClassLoader.getSystemResource("bullet/roundBulletB.png").toString());
		roundBulletY = new Image(ClassLoader.getSystemResource("bullet/roundBulletY.png").toString());
		roundBulletR = new Image(ClassLoader.getSystemResource("bullet/roundBulletR.png").toString());
		roundBulletP = new Image(ClassLoader.getSystemResource("bullet/roundBulletP.png").toString());
		
		randomBox = new Image(ClassLoader.getSystemResource("items/randomBox.png").toString());
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
