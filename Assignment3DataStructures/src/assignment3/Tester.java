package assignment3;



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;


public class Tester {

	public static void main(String[] args) {
		
		new Tester();
		

	}
	public Tester() {
		int datasetSize = 2*(int)Math.pow(10, 7);
		int[]dataSet = new int[datasetSize];

		double[] AlgOneTime = AlgortithmOneTime(dataSet,150);
		double[] AlgTwoTime = AlgorithmTwoTime(dataSet,150);
		
		writeToFile(AlgOneTime,AlgTwoTime,150);
		
		
	}
	
	
	void writeToFile(double[] AlgOneTime, double[] AlgTwoTime, int dataSourceMaxSize) {
		PrintWriter printer = null;
		String fileName = "output.csv";
		
		try {
			printer = new PrintWriter(new FileOutputStream(fileName));
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		int count  = 1;
		
		for(int i = 0; i<dataSourceMaxSize;i++) {
			printer.print(count+ ", " + AlgOneTime[i] + ", ");
			printer.println(AlgTwoTime[i]);
			count++;
		}
		
		printer.close();
	}
	
	double[] AlgortithmOneTime(int[] dataSet, int iterations) {
		
		double[] time = new double[iterations];
		int t = 0;
		populateDataSet(dataSet);
		for(int i =1; i<time.length;i++) {
			int[] dataSource = new int[i];
			populateDataSource(dataSource);
			long start = System.nanoTime();
		for(int j =0; j<dataSource.length;j++ ) {
			SearchingAlgorithms.linearSearch(dataSet, dataSource[j]);

		}
		long end = System.nanoTime();	
		double durationNano = end-start;
		time[t]= durationNano/1000000000;
		t++;
		}
		
		return time;

	}
	double[] AlgorithmTwoTime(int[] dataSet, int iterations) {
		
	double[] time = new double[iterations];
		int t = 0;
		for(int i = 1; i<time.length;i++) {
			int[] dataSource = new int[i];
			populate(dataSet,dataSource);
			long start = System.nanoTime();	
			SearchingAlgorithms.quickSort(dataSet);
		for(int j = 0; j<dataSource.length;j++) {	
			SearchingAlgorithms.binarySearch(dataSet, dataSource[j]);
	
			}
		long end = System.nanoTime();
		double durationNano = end-start;
		time[t] = durationNano/1000000000;
		t++;
	
		}
		
		return time;
	}
	
	
	
	void populate(int[] dataSet,int[] dataSource) {
		Random rgen = new Random();
		for(int i = 0; i<dataSet.length; i++) {
			if(i<dataSource.length) {
				dataSource[i] = rgen.nextInt(0,2*dataSet.length-1);
			}
			dataSet[i] = rgen.nextInt(0,dataSet.length-1);
			
		}
	}
	void populateDataSource(int[] dataSource) { 
		int datasetSize = 2* (int)Math.pow(10, 7);
		Random rgen = new Random();
		for(int i = 0; i<dataSource.length; i++) {
				dataSource[i] = rgen.nextInt(0,datasetSize-1);
			
			
	}
	}
		void populateDataSet(int[] dataSet) {
			Random rgen = new Random();
			for(int i = 0; i<dataSet.length; i++) {

				dataSet[i] = rgen.nextInt(0,dataSet.length-1);

	}
		}
		}

