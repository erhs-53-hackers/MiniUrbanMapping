package legopathfinderv;

import java.util.ArrayList;

public class Path {

    private ArrayList<Road> currentRoute = new ArrayList<Road>();
    private ArrayList<Road> touchedRoads = new ArrayList<Road>();
    private int routeTime = 0;

    public boolean roadMark(Road currentRoad) 
    {
        if(touchedRoads.contains(currentRoad))return true;
        else return false;
    }
    public void changePath(Road newRoad) 
    {
        currentRoute.add(newRoad);
        routeTime += newRoad.getLength();
        touchedRoads.add(newRoad);
    }
    public int getPathTime() 
    {
        return routeTime;
    }
    public Path getNewPath() 
    {
        Path newPath = new Path();
        for(int i = 0; i < currentRoute.size(); i++)newPath.currentRoute.add(currentRoute.get(i));
        for(int i = 0; i < currentRoute.size(); i++)newPath.touchedRoads.add(touchedRoads.get(i));
        newPath.routeTime = routeTime;
        return newPath;
    }
    public void printPath() 
    {
        Road currentRoad = currentRoute.get(0);
        Road nextRoad = currentRoute.get(0);
        for(int i = 0; i < currentRoute.size(); i++) 
        {
            currentRoad = nextRoad;
            nextRoad = currentRoute.get(i);
            if(nextRoad.equals(currentRoad.nextRoadLeft))System.out.println("goStrait();\nturnLeft();");
            else if(nextRoad.equals(currentRoad.nextRoadRight))System.out.println("goStrait();\nturnRight();");
            else if(nextRoad.equals(currentRoad.nextRoadStraight))System.out.println("goStrait();");
        }
    }
}
