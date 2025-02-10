/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package com.splunk.opentelemetry.instrumentation.jsonrpc4j;

import java.lang.reflect.Method;

public final class JsonRpcClientRequest {

  private final String methodName;
  private final Object argument;
  private Method method;

  public JsonRpcClientRequest(String methodName, Object argument) {
    this.methodName = methodName;
    this.argument = argument;
  }

  public JsonRpcClientRequest(Method method, Object argument) {
    this.method = method;
    this.methodName = method.getName();
    this.argument = argument;
  }

  public String getMethodName() {
    return methodName;
  }

  public Object getArgument() {
    return argument;
  }

  public Method getMethod() {
    return method;
  }
}
