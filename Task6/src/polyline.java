public class polyline extends point{
    private String points[];

    public polyline(){

    }

    public polyline(String[] points) {
        this.points = points;
    }

    public void appendPoint(int x , int y){
        points[0]= "("+x+","+y+")";
    }
    public String c(){
        return points[0];
    }
}
