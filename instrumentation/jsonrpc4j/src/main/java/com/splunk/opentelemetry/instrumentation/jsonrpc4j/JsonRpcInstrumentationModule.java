/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package com.splunk.opentelemetry.instrumentation.jsonrpc4j;

import static java.util.Arrays.asList;

import com.google.auto.service.AutoService;
import io.opentelemetry.javaagent.extension.instrumentation.InstrumentationModule;
import io.opentelemetry.javaagent.extension.instrumentation.TypeInstrumentation;
import java.util.List;

@AutoService(InstrumentationModule.class)
public class JsonRpcInstrumentationModule extends InstrumentationModule {
  public JsonRpcInstrumentationModule() {
    super("jsonrpc4j", "jsonrpc4j-1.3");
  }

  @Override
  public List<TypeInstrumentation> typeInstrumentations() {
    return asList(
        new JsonRpcServerInstrumentation(),
        new JsonRpcClientInstrumentation(),
        new JsonRpcProxyInstrumentation());
  }
}
