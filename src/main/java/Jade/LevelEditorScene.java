package Jade;

import java.awt.event.KeyEvent;

public class LevelEditorScene extends Scene{

    private boolean changingScene = false;
    private float timeToChangeScene = 2;

    public LevelEditorScene() {
        System.out.println("inside level editor scene");
    }

    @Override
    public void update(float dt) {

        //changes scene on space press
        if (!changingScene && KeyListener.isKeyPressed(KeyEvent.VK_SPACE)){
            changingScene = true;
        }

        //changes window to black if changing scene
        if (changingScene && timeToChangeScene > 0) {

            timeToChangeScene -= dt;
            Window.get().r -= dt * 5.0f;
            Window.get().g -= dt * 5.0f;
            Window.get().b -= dt * 5.0f;
        } else if (changingScene) {
            Window.changeScene(1);
        }
    }
}
