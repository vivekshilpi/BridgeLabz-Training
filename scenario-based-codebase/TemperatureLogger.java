/*
Temperature Logger 
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks.
*/

import java.util.Scanner;
public class TemperatureLogger {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		// create an array temperature to record temperature over 7 days by taking user input
		double[] temperature = new double[7];

        for(int i=0;i<temperature.length;i++){
        	System.out.println("Enter temperature in °C on day "+ (i+1) + " : ");
        	temperature[i] = input.nextDouble();
        }
        
        // calculating maximum temperature and avergae temperature over 7 days
        double sum = 0.0;
        double maxTemperature = temperature[0];

        for(int i=0;i<temperature.length;i++){
        	sum+=temperature[i];
        	if(temperature[i]>maxTemperature){
        		maxTemperature=temperature[i];
        	}
        }

        double averageTemp = sum/7;
        
        // Displaying result
        System.out.println("Average temperature over 7 days is : "+averageTemp+"°C");
        System.out.println("Maximum temperature over 7 days is : "+maxTemperature+"°C");


	}
	
}