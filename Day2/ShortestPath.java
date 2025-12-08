public class ShortestPath {
    public static float getShortestPath(String path){
        int x = 0, y = 0;

        for(int i=0; i<path.length(); i++){
            //South
            if(path.charAt(i) == 'S'){
                y--;
            }
            //North
            else if(path.charAt(i) == 'N'){
                y++;
            }
            //West
            else if(path.charAt(i) == 'W'){
                x--;
            }
            //East
            else{
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)(Math.sqrt(X2 + Y2));
    }
    public static void main(String args[]){
        String path = "WN";
        System.out.println(getShortestPath(path));
    }
}
