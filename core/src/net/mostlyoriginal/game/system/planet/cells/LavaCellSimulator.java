package net.mostlyoriginal.game.system.planet.cells;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.MathUtils;

/**
 * @author Daan van Yperen
 */
public class LavaCellSimulator implements CellSimulator {
    @Override
    public void process(CellDecorator c, float delta) {
        c.cell.color = Color.rgba8888( MathUtils.random(0.6f, 1f), 0f,0F, 1f);
    }
}
