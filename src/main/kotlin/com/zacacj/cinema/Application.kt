package com.zacacj.cinema

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.zacacj.cinema")
		.start()
}

