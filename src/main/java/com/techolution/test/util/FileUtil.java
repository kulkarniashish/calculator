package com.techolution.test.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.techolution.test.Input;
import com.techolution.test.SatisfactionToTimeRatio;

@Component
public class FileUtil {
	
	public Input readFile(String filename) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(filename));
		} catch (FileNotFoundException e) {
			System.out.println("File not found with name: " + filename);
		}
		String sCurrentLine = null;
		Long maxTime = null;
		Long noOfValues = null;
		List<SatisfactionToTimeRatio> inputs = new ArrayList<>();
		
		try {
			sCurrentLine = br.readLine();
			String[] split = sCurrentLine.split(" ");
			maxTime = Long.valueOf(split[0]);
			noOfValues = Long.valueOf(split[1]);					
			
			while ((sCurrentLine = br.readLine()) != null) {
				split = sCurrentLine.split(" ");
				SatisfactionToTimeRatio satisfactionToTimeRatio = new SatisfactionToTimeRatio(Long.valueOf(split[0]), Long.valueOf(split[1]), 
						(double) (Long.valueOf(split[0]) / Long.valueOf(split[1])));
				inputs.add(satisfactionToTimeRatio);
			}
			
			br.close();
		} catch (IOException e) {
			System.out.println("Error in reading the file");
		}	
		
		return new Input(noOfValues, maxTime, inputs);		
	}
}
