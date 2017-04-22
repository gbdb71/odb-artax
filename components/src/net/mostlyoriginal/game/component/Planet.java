package net.mostlyoriginal.game.component;

import com.artemis.Component;

/**
 * @author Daan van Yperen
 */
public class Planet extends Component {

    public static final int SIMULATION_WIDTH = 800;
    public static final int SIMULATION_HEIGHT = 450;

    public Planet() {
    }

    public PlanetCell[][] grid = new PlanetCell[SIMULATION_HEIGHT][SIMULATION_WIDTH];

    public PlanetCell get(int x, int y) {
        if ( x < 0 || y < 0 || x >= SIMULATION_WIDTH || y >= SIMULATION_HEIGHT ) return null;
        return grid[y][x];
    }
}
