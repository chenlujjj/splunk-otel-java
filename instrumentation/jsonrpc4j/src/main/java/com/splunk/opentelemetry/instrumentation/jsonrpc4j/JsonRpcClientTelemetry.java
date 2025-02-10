/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package com.splunk.opentelemetry.instrumentation.jsonrpc4j;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.instrumentation.api.instrumenter.Instrumenter;

public final class JsonRpcClientTelemetry {
  public static JsonRpcClientTelemetry create(OpenTelemetry openTelemetry) {
    return builder(openTelemetry).build();
  }

  public static JsonRpcClientTelemetryBuilder builder(OpenTelemetry openTelemetry) {
    return new JsonRpcClientTelemetryBuilder(openTelemetry);
  }

  private final Instrumenter<JsonRpcClientRequest, JsonRpcClientResponse> clientInstrumenter;

  JsonRpcClientTelemetry(
      Instrumenter<JsonRpcClientRequest, JsonRpcClientResponse> clientInstrumenter) {
    this.clientInstrumenter = clientInstrumenter;
  }

  public Instrumenter<JsonRpcClientRequest, JsonRpcClientResponse> getClientInstrumenter() {
    return clientInstrumenter;
  }
}
