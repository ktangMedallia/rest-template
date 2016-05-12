package com.medallia.resttemplate;

import org.junit.Assert;
import org.junit.Test;

import com.medallia.resttemplate.HelloWorld;

public class HelloWorldTest {

	@Test
	public void test() {
		Assert.assertEquals("Hello World", HelloWorld.get());
	}

}
