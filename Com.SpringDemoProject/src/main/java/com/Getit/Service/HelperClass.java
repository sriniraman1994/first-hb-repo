
package com.Getit.Service;
public class HelperClass {
	private DiDemo demo;
	public int getValue(){
		return demo.getId();
	}

	public HelperClass(DiDemo demo) {
		
		this.demo = demo;
	}
	

}
