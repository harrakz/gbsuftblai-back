package com.kata.gbsuftblai.services

import org.springframework.beans.factory.annotation.Autowired
import org.junit.jupiter.api.Test
import com.kata.gbsuftblai.services.GbsuFtbLaiService
import org.junit.jupiter.api.Assertions.assertEquals
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class GbsuFtbLaiServiceTest {


	@Test
	fun if_no_match_1() {
		assertEquals("1", service.convertNumber(1))
	}

	@Autowired
	private lateinit var service: GbsuFtbLaiService

	@Test
	fun divisible_by_3_And_contains_3() {
		assertEquals("GbsuGbsu", service.convertNumber(3))
	}


	@Test
	fun divisible_by_5_and_contains_5() {
		assertEquals("FtbFtb", service.convertNumber(5))
	}

	@Test
	fun divisible_by_55_and_contains_55() {
		assertEquals("FtbFtbFtb", service.convertNumber(55))
	}


	@Test
	fun contains_7() {
		assertEquals("Lai", service.convertNumber(7))
		assertEquals("LaiLai", service.convertNumber(77))
	}

	@Test
	fun contains_5_and_divisible_by_3() {
		assertEquals("GbsuFtb", service.convertNumber(51))
	}

	@Test
	fun contains_5_and_contains_3() {
		assertEquals("FtbGbsu", service.convertNumber(53))
	}

	@Test
	fun divisible_by_3_and_contains3_twice() {
		assertEquals("GbsuGbsuGbsu", service.convertNumber(33))
	}

	@Test
	fun divisible_by_3_and_contains_3_thrice() {
		assertEquals("GbsuGbsuGbsuGbsu", service.convertNumber(333))
	}

	@Test
	fun divisible_by_3_and_contains_7() {
		assertEquals("GbsuLai", service.convertNumber(27))
	}


	@Test
	fun divisible_by_5_3_and_contains_5() {
		assertEquals("GbsuFtbFtb", service.convertNumber(15))
	}


	@Test
	fun if_no_match_149() {
		assertEquals("149", service.convertNumber(149))
	}


}