package java_generic_;

public class Point {
	
	private double xCoordinate;
	private double yCoordinate;
	public double getxCoordinate() {
		return xCoordinate;
	}
	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public double getyCoordinate() {
		return yCoordinate;
	}
	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	
	public Point(double xCoordinate,double yCoordinate) {
		this.xCoordinate=xCoordinate;
		this.yCoordinate=yCoordinate;
	}
	
	public double calculateDistance() {
		double x1=this.getxCoordinate();double y1=this.getyCoordinate();
		double x2=0;double y2=0;
		double distance=Math.sqrt((Math.pow((x2-x1),2)+Math.pow(y2-y1, 2)));
		return (double)Math.round(distance*100)/100;
	}
	
	public double calculateDistance(Point point) {
		double x1=this.getxCoordinate();double y1=this.getyCoordinate();
		double x2=point.xCoordinate;double y2=point.yCoordinate;
		double distance=Math.sqrt((Math.pow((x2-x1),2)+Math.pow(y2-y1, 2)));
		return (double)Math.round(distance*100)/100;
	}
	
	public static void main(String[] args) {
		Point point1 = new Point(3.5, 1.5);
        Point point2 = new Point(6, 4);
                                
        System.out.println("Distance of point1 from origin is "+point1.calculateDistance());
        System.out.println("Distance of point2 from origin is "+point2.calculateDistance());
        System.out.println("Distance of point1 from point2 is "+point1.calculateDistance(point2));

}
	
}
