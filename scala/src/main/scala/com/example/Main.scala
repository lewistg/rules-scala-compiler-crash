package com.example

import os.Path

object Main {
  def main(args: Array[String]): Unit = {
    println(os.proc("echo", "foo").spawn().stdout)
  }
}
