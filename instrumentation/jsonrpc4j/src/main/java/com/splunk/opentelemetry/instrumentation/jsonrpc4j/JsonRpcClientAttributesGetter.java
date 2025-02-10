/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package com.splunk.opentelemetry.instrumentation.jsonrpc4j;

import io.opentelemetry.instrumentation.api.incubator.semconv.rpc.RpcAttributesGetter;

// Check
// https://github.com/open-telemetry/semantic-conventions/blob/main/docs/rpc/rpc-metrics.md#attributes
// Check https://opentelemetry.io/docs/specs/semconv/rpc/json-rpc/
enum JsonRpcClientAttributesGetter implements RpcAttributesGetter<JsonRpcClientRequest> {
  INSTANCE;

  @Override
  public String getSystem(JsonRpcClientRequest request) {
    return "jsonrpc";
  }

  @Override
  public String getService(JsonRpcClientRequest request) {
    if (request.getMethod() != null) {
      return request.getMethod().getDeclaringClass().getName();
    }
    return null;
  }

  @Override
  public String getMethod(JsonRpcClientRequest request) {
    return request.getMethodName();
  }
}
