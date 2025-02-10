plugins {
  id("splunk.instrumentation-conventions")
  id("splunk.muzzle-conventions")
}


muzzle {
  pass {
    group.set("com.github.briandilley.jsonrpc4j")
    module.set("jsonrpc4j")
    versions.set("[1.3.3,)")
    assertInverse.set(true)
  }
}


dependencies {
  compileOnly("com.github.briandilley.jsonrpc4j:jsonrpc4j:1.3.3")
  compileOnly("com.fasterxml.jackson.core:jackson-databind")
}
