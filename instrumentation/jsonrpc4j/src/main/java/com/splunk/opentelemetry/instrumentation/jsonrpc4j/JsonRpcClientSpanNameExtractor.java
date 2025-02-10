/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package com.splunk.opentelemetry.instrumentation.jsonrpc4j;

import io.opentelemetry.instrumentation.api.instrumenter.SpanNameExtractor;
import java.lang.reflect.Method;

final class JsonRpcClientSpanNameExtractor implements SpanNameExtractor<JsonRpcClientRequest> {
  @Override
  public String extract(JsonRpcClientRequest request) {
    if (request.getMethod() == null) {
      return request.getMethodName();
    }
    Method method = request.getMethod();
    return String.format("%s/%s", method.getDeclaringClass().getName(), method.getName());
  }
}
