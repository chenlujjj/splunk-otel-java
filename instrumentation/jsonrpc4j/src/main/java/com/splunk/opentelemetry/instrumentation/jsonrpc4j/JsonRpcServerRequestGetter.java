/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package com.splunk.opentelemetry.instrumentation.jsonrpc4j;

import io.opentelemetry.context.propagation.TextMapGetter;
import java.util.ArrayList;
import javax.annotation.Nullable;

enum JsonRpcServerRequestGetter implements TextMapGetter<JsonRpcServerRequest> {
  INSTANCE;

  @Override
  public Iterable<String> keys(JsonRpcServerRequest request) {
    return new ArrayList<>();
  }

  @Override
  @Nullable
  public String get(@Nullable JsonRpcServerRequest request, String key) {
    return null;
  }
}
