package io.github.aaronchenwei.micronaut.example

import io.micronaut.runtime.Micronaut

fun main(args: Array<String>) {
  Micronaut.build(*args)
    .banner(false)
    .start()
}

