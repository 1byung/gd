package com.javaman.controller;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.javaman.domain.Member;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
public class MemberTests {
	
	@Setter @Autowired
	private Member member;
	
	@Test
	public void existMember() {
		member.setUserid("asd");
		member.setUserpw("1234");
		log.warn(member);
//		assertNotNull(member);
	}
}
