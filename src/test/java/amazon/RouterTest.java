package amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RouterTest {

    @Test
    void shouldReturnNumberOfServedBuildings() {
        int[] buildingCount = {1,2,1,2,2};
        int[] routerLocation = {3,1};
        int[] routerRange = {1,2};

        int expected = 3;

        int actual = Router.getServedBuildings(buildingCount, routerLocation, routerRange);

        assertEquals(expected, actual);

    }

}