package view;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;

public class TileMapHelper {

    private TiledMap tiledMap;

    public OrthogonalTiledMapRenderer setupMap() {
        tiledMap = new TmxMapLoader().load("assets/maps/map0.tmx");
        return new OrthogonalTiledMapRenderer(tiledMap);
    }
}
