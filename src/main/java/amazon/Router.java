package amazon;

import java.util.HashMap;

public class Router {

    // buildingCount = [1,2,1,2,2]
    // routerLocation=[3,1]
    // routerRange=[1,2]
    // a building is served if the number of routers covering it is bigger or equal to the number of tenants

    public static int getServedBuildings(int buildingCount[], int routerLocation[], int routerRange[]) {
        int servedBuildings = 0;

        HashMap<Integer, Integer> houseNumberOfRoutersMap = new HashMap<>();

        for (int i = 0; i<routerLocation.length; i++) {
            int leftRange = routerLocation[i] - routerRange[i];
            int rightRange = routerLocation[i] + routerRange[i];
            while (leftRange <= routerLocation[i]) {
                if(leftRange > 0) {
                    if(!houseNumberOfRoutersMap.containsKey(leftRange)){
                        houseNumberOfRoutersMap.put(leftRange, 1);
                    }else{
                        houseNumberOfRoutersMap.put(leftRange, houseNumberOfRoutersMap.get(leftRange) + 1);
                    }
                }
                leftRange++;
            }

            while (rightRange != routerLocation[i]) {
                if(rightRange < buildingCount.length) {
                    if(!houseNumberOfRoutersMap.containsKey(rightRange)){
                        houseNumberOfRoutersMap.put(rightRange, 1);
                    }else{
                        houseNumberOfRoutersMap.put(rightRange, houseNumberOfRoutersMap.get(rightRange) + 1);
                    }
                }
                rightRange--;
            }
        }

        for (int i = 1; i<buildingCount.length; i++) {
            if(houseNumberOfRoutersMap.get(i) != null &&
                    houseNumberOfRoutersMap.get(i) >= buildingCount[i-1]) {
                servedBuildings++;
            }
        }

        return servedBuildings;
    }
}
