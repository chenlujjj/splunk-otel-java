plugins {
  id("splunk.instrumentation-conventions")
}

dependencies {
  compileOnly("org.glassfish.main.common:common-util:5.0")

  compileOnly("com.github.briandilley.jsonrpc4j:jsonrpc4j:1.3.3")
  compileOnly("com.fasterxml.jackson.core:jackson-databind")
}
