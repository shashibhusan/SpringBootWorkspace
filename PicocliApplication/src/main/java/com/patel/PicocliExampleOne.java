package com.patel;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(
		name="hello",
		description="say hello world"
		)

public class PicocliExampleOne implements Runnable {

	private String userName;
	
	@Override
	public void run() {
		System.out.println("Hello world!");
		
	}
	
	public static void main(String[] args) {
		CommandLine.run(new PicocliExampleOne(), args);
	}

}
