package com.redhat.samples.camel

import org.assertj.core.api.Assertions._
import org.junit.Test

class HelloTest {

  @Test
  def hello: Unit = {
    assertThat(1 + 1).isEqualTo(2)
  }

}
