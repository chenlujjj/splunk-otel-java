/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package com.splunk.opentelemetry.instrumentation.jsonrpc4j;

import com.fasterxml.jackson.databind.JsonNode;
import java.lang.reflect.Method;
import java.util.List;

final class JsonRpcServerResponse {
  private final Method method;
  private final List<JsonNode> params;
  private final Object result;

  JsonRpcServerResponse(Method method, List<JsonNode> params, Object result) {
    this.method = method;
    this.params = params;
    this.result = result;
  }

  public Method getMethod() {
    return method;
  }

  public List<JsonNode> getParams() {
    return params;
  }

  public Object getResult() {
    return result;
  }
}
