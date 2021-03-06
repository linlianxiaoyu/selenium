// Licensed to the Software Freedom Conservancy (SFC) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The SFC licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package org.openqa.grid.internal.mock;

import org.openqa.grid.internal.GridRegistry;
import org.openqa.grid.internal.TestSession;
import org.openqa.grid.internal.exception.NewSessionException;
import org.openqa.grid.web.servlet.handler.RequestHandler;
import org.openqa.grid.web.servlet.handler.SeleniumBasedRequest;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

public class MockedRequestHandler extends RequestHandler {

  public MockedRequestHandler(
    SeleniumBasedRequest request,
    HttpServletResponse response,
    GridRegistry registry) {
    super(request, response, registry);
  }

  @Override
  public void setSession(TestSession session) {
    super.setSession(session);
  }

  @Override
  protected void forwardRequest(TestSession session, RequestHandler handler) {
    // do nothing
  }

  @Override
  public void forwardNewSessionRequestAndUpdateRegistry(TestSession session)
      throws NewSessionException {
    // do nothing
  }

}
