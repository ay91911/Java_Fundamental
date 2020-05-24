package java_20200519;

import java.lang.*;

public class SuperDemo extends Object{
	public SuperDemo(){
		super();
	}
}

class A extends Object{
	A(int a){
		super();
	}
	A(){
		super();
	}//해당 디폴트생성자 안만들면 자식클래스에서 에러남
}

class B extends A{
	B(){
		super();
	}
}

// 부모클래스에 생성자가 없었는데 만들경우, 컴파일러가 자동으로 생성하는 디폴트생성자가 없어져서 자식클래스에 에러가 뜸..
// 하여, 부모클래스에 생성자 새로 만들 경우, 반드시 디폴트 생성자 꼭 추가로생성해줘야 함.



/*
class A extends Object{
	A(){
		super();
	}
}

class B extends A{
	B(){
		super();
	}
	*/
