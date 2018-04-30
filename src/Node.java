import java.util.HashMap;

public class Node{
    private int x;
    private int y;
    private String name;
    private HashMap<String, Node> neighbors;

    public Node(int x, int y, String name){
        this.x = x;
        this.y = y;
        this.name = name;
        neighbors = new HashMap<String, Node>();
    }

    public void addNeighbor(Node neighbor){
        neighbors.put(neighbor.getName(), neighbor);
    }

    public float getLengthToNeighbor(Node neighbor){
        float dist;

        if(!neighbors.containsValue(neighbor)){
            dist = -1;
        }
        else{
            dist = (float)Math.sqrt((double)(x * neighbor.getX() + y * neighbor.getY()));
        }

        return dist;
    }

    public String getName(){
        return name;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public String toString(){
        return "Node " + name + ": (" + x + ", " + y + ")";
    }
}
