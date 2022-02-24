package com.kata.gbsuftblai.services

import org.springframework.stereotype.Component

@Component
class GbsuFtbLaiService {

	fun convertNumber(inputNumber: Int): String {
		val result = StringBuilder()

		if (inputNumber % 3 == 0) {
			result.append("Gbsu")
		}

		if (inputNumber % 5 == 0) {
			result.append("Ftb")
		}
		var array = inputNumber.toString().split("").filter { s -> s == "3" || s == "5" || s == "7" }


		for (occ in array) {
			when (occ) {
				"3" -> result.append("Gbsu")
				"5" -> result.append("Ftb")
				"7" -> result.append("Lai")
			}

		}

		if (result.isBlank()) {
			return inputNumber.toString()
		}

		return result.toString()
	}


}