package org.springframework.atguigu1.component1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("component2")
public class Component2 {

	@Autowired
	Component1 component1;

	void A() {

	}

}
