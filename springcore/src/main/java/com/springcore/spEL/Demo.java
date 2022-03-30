package com.springcore.spEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{55+66}")
	private int x;
	@Value("#{5>10?100:-100}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double z;
	
	@Value("#{T(java.lang.Math).E}")
	private double e;
	
	@Value("#{new java.lang.String('Ram')}")
	private String name;
	
	@Value("#{2>3}")
	private boolean flag;

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", flag=" + flag + "]";
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public double getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}



	

}
