package view;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MainView extends Game {

	private int widthScreen;
	private int heightScreen;
	private OrthographicCamera orthographicCamera;


	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		this.widthScreen = Gdx.graphics.getWidth();
		this.heightScreen = Gdx.graphics.getHeight();
		this.orthographicCamera = new OrthographicCamera();
		this.orthographicCamera.setToOrtho(false, widthScreen, heightScreen);

		setScreen(new GameScreen(orthographicCamera));

		//batch = new SpriteBatch();
		//img = new Texture("assets/badlogic.jpg");
	}

	/*@Override
	public void render () {
		//ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}*/
}












