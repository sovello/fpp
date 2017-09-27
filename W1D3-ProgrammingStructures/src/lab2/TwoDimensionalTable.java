package lab2;

public class TwoDimensionalTable {
	public static void main(String[] args) {
		double[][] balances = new double[3][6];
		double principle = 10000;
		for(int i = 0; i < 3; i++) {
			double rate = 10;
			for (int j = 1; j <= 6; j++) {
				if( i == 0) {
					rate = 0;
					balances[i][j-1] = principle;
				}else {
					rate = rate + j-1;
					double profit = getProfit(balances[i-1][j-1], rate);
					balances[i][j-1] = balances[i-1][j-1]+profit;
				}
			}
		}
		
		for(int i=0; i<3; i++) {
			System.out.format("Average for row %d", i+1);
			double sum = 0;
			double average;
			for(int j=0; j<6; j++) {
				//System.out.format("%,15.2f", balances[i][j]);
				sum += balances[i][j];
			}
			average = sum / balances[0].length;
			
			System.out.format(":%,10.2f%n", average);
		}
		
		for(int i=0; i<6; i++) {
			System.out.format("Average for column %d", i+1);
			double sum = 0;
			double average;
			for(int j=0; j<3; j++) {
				//System.out.format("%,15.2f", balances[i][j]);
				sum += balances[j][i];
			}
			average = sum / 3;
			
			System.out.format(":%,10.2f%n", average);
		}
		
	}
	
	static double getProfit(double principle, double rate) {	
		return (principle * rate) / 100;
	}
	
	public static double avg(double[] arrayOfBalance) {
		double sum = 0;
		for(int i = 0; i < arrayOfBalance.length; i++) {
			sum += arrayOfBalance[i];
		}
		return sum/arrayOfBalance.length;
	}
}
