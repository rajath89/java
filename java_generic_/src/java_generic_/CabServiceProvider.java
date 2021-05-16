package java_generic_;
//Association exercise 1;

public class CabServiceProvider {
	
	private String cabServiceName;
	private int totalCabs;
	
	CabServiceProvider(String cabServiceName,int totalCabs){
		this.cabServiceName=cabServiceName;
		this.totalCabs=totalCabs;
		
	}
	
	public String getCabServiceName() {
		return cabServiceName;
	}
	public void setCabServiceName(String cabServiceName) {
		this.cabServiceName = cabServiceName;
	}
	public int getTotalCabs() {
		return totalCabs;
	}
	public void setTotalCabs(int totalCabs) {
		this.totalCabs = totalCabs;
	}
	
	public double calculateRewardPrice(Driver driver) {
		if(cabServiceName=="Halo") {
			if(driver.getAverageRating()>=4.5&&driver.getAverageRating()<=5) {
				return (double)10*driver.getAverageRating();
			}else if(driver.getAverageRating()>=4&&driver.getAverageRating()<=4.5) {
				return (double)5*driver.getAverageRating();
			}else if(driver.getAverageRating()<4) {
				return (double)0.0;
			}
			
		}
		else if(cabServiceName=="Aber") {
			if(driver.getAverageRating()>=4.5&&driver.getAverageRating()<=5) {
				return (double)8*driver.getAverageRating();
			}else if(driver.getAverageRating()>=4&&driver.getAverageRating()<=4.5) {
				return (double)3*driver.getAverageRating();
			}else if(driver.getAverageRating()<4) {
				return (double)0.0;
			}
		}
		
		return 0.0;
	}

}
