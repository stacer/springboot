package com.wisely.highlight_spring4.ch3.fortest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={TestConfig.class})
@ActiveProfiles("prod")
public class DemoBeanIntegrationTests {
	
	@Autowired
	private TestBean testBean;
	
	@Test
	public void prodBeanShouldInject(){
		String expected = "form production profile";
		String actual = testBean.getContent();
		Assert.assertEquals(expected, actual);
	}
}
