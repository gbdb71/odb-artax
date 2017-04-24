package net.mostlyoriginal.game.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import net.mostlyoriginal.game.GdxArtemisGame;
import net.mostlyoriginal.game.component.G;

public class HtmlLauncher extends GwtApplication {

    @Override
    public GwtApplicationConfiguration getConfig() {
        return new GwtApplicationConfiguration(G.SCREEN_WIDTH, G.SCREEN_HEIGHT);
    }

    @Override
    public ApplicationListener createApplicationListener() {
        return new GdxArtemisGame();
    }
}