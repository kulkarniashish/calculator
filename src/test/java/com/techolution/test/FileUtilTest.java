package com.techolution.test;

import org.junit.Test;

import com.techolution.test.util.FileUtil;

public class FileUtilTest {

	@Test
	public void testReadFile() {
		
		FileUtil fileUtil = new FileUtil();
		Input readFile = null;
		readFile = fileUtil.readFile("input");
		System.out.println(readFile);
	}

}
