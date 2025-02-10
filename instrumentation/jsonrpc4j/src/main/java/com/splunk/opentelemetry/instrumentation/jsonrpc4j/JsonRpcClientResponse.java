/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package com.splunk.opentelemetry.instrumentation.jsonrpc4j;

public final class JsonRpcClientResponse {

  private final Object result;

  public JsonRpcClientResponse(Object result) {
    this.result = result;
  }

  public Object getResult() {
    return result;
  }
}
