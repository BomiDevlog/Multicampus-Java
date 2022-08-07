package day08practice;//[연습문제8.문제4]

public class BaseClass {
	private float x=1.0f;
	protected float getVar() {return x;}
}
	
class SubClass extends BaseClass{
	private float x=2.0f;
			//insert code here
	//float getVar() {return x;}//(x)
	//public float getVar() {return x;} //(o)
	//public double getVar() {return x;}//(x)
	//protected float getVar() {return x;}//(o)
	//public float  getVar(float f) {return x;}//(o)
}
