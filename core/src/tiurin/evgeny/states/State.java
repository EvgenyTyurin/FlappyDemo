package tiurin.evgeny.states;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

/**
 * Game screen abstract root class
 */

public abstract class State {

    protected OrthographicCamera camera;
    protected Vector3 mouse;
    protected GameStateManager gsm;

    public State(GameStateManager gsm) {
        this.gsm = gsm;
        camera = new OrthographicCamera();
        mouse = new Vector3();
    }

    protected abstract void handelInput();
    public abstract void update(float dt);
    public abstract void render(SpriteBatch sb);
    public abstract void dispose();

}
