package legopathfinderv;

public class Road
{
    public int roadLength;
    public Road nextRoadStraight;
    public Road nextRoadLeft;
    public Road nextRoadRight;
    public Park nextParkStraight;
    public Park nextParkLeft;
    public Park nextParkRight;

    public boolean right = false;
    public boolean left = false;
    public boolean striaght = false;
    public boolean roadMark = false;

    public void length(int rL)
    {
         roadLength = rL;
    }
    public int getLength()
    {
        return roadLength;
    }
    public Road turnLeft(Road tL)
    {
        left = true;
        return nextRoadLeft = tL;
    }
    public Road goStrait(Road tS)
    {
        striaght = true;
        return nextRoadStraight = tS;
    }
    public Road turnRight(Road tR)
    {
        right = true;
        return nextRoadRight = tR;
    }
    public Park parkStrait(Park pS)
    {
        return nextParkStraight = pS;
    }
    public Park parkLeft(Park pL)
    {
        return nextParkLeft = pL;
    }
    public Park parkRight(Park pR)
    {
        return nextParkRight = pR;
    }
    public boolean leftTrue()
    {
        if (left) return true;
        else return false;
    }
        public boolean rightTrue()
    {
        if (right) return true;
        else return false;
    }
    public boolean straightTrue()
    {
        if (this.striaght) return true;
        else return false;
    }
    public static void main(String[] args)
    {
        
    }
}
