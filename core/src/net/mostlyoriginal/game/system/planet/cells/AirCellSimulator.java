package net.mostlyoriginal.game.system.planet.cells;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.MathUtils;
import net.mostlyoriginal.game.component.PlanetCell;

/**
 * @author Daan van Yperen
 */
public class AirCellSimulator implements CellSimulator {

    private int airColor = Color.rgba8888(0f, MathUtils.random(0.6f, 0.7f), MathUtils.random(0.6f, 1f), 1f);

    @Override
    public void process(CellDecorator c, float delta) {
        c.cell.color = airColor;

        if (swapIfSwappable(c, c.getNeighbourAbove())) {
            return;
        }
        if (swapIfSwappable(c, c.getNeighbourAboveL())) {
            return;
        }
        if (swapIfSwappable(c, c.getNeighbourAboveR())) {
            return;
        }

        if (MathUtils.randomBoolean()) {
            if (c.swapWithBestFlowing(c.getNeighbourLeft())) return;
        } else {
            if (c.swapWithBestFlowing(c.getNeighbourRight())) return;
        }

        c.cell.sleep = 1;
    }

    @Override
    public void updateMask(CellDecorator c, float delta) {

    }

    private boolean swapIfSwappable(CellDecorator c, PlanetCell neighbourAbove) {
        if (neighbourAbove != null && neighbourAbove.type.density != null && neighbourAbove.type.isLighter(c.cell.type)) {
            c.swapWith(neighbourAbove);
            return true;
        }
        return false;
    }
}
