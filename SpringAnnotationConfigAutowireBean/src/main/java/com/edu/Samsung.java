package com.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Component   
public class Samsung {
	@Autowired
	MobileProcessor mcpu;

	
	public MobileProcessor getMcpu() {
		return mcpu;
	}



	public void setMcpu(MobileProcessor mcpu) {
		this.mcpu = mcpu;
	}



	public void MobileConfig() {
		System.out.println("8gb Ram Dual Core 128px camera");
		mcpu.processor();
	}

}