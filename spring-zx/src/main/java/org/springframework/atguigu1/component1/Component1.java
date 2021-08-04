package org.springframework.atguigu1.component1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("component1")
public class Component1 {

	@Autowired
	Component2 component2;

	@PostConstruct
	public void postConstruct1() { //@1
		System.out.println("postConstruct1()");
	}


//	public Component1(Component2 component2){
//        System.out.println("Component1 create-----component2");
//    }
}
