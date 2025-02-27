/*
 * (C) Copyright IBM Corp. 2020, 2021.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.watson.assistant.v1.model;

import static org.testng.Assert.*;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.watson.assistant.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;

/** Unit test class for the UpdateValueOptions model. */
public class UpdateValueOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata =
      TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateValueOptions() throws Throwable {
    UpdateValueOptions updateValueOptionsModel =
        new UpdateValueOptions.Builder()
            .workspaceId("testString")
            .entity("testString")
            .value("testString")
            .newValue("testString")
            .newMetadata(
                new java.util.HashMap<String, Object>() {
                  {
                    put("foo", "testString");
                  }
                })
            .newType("synonyms")
            .newSynonyms(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
            .newPatterns(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
            .append(false)
            .includeAudit(false)
            .build();
    assertEquals(updateValueOptionsModel.workspaceId(), "testString");
    assertEquals(updateValueOptionsModel.entity(), "testString");
    assertEquals(updateValueOptionsModel.value(), "testString");
    assertEquals(updateValueOptionsModel.newValue(), "testString");
    assertEquals(
        updateValueOptionsModel.newMetadata(),
        new java.util.HashMap<String, Object>() {
          {
            put("foo", "testString");
          }
        });
    assertEquals(updateValueOptionsModel.newType(), "synonyms");
    assertEquals(
        updateValueOptionsModel.newSynonyms(),
        new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(
        updateValueOptionsModel.newPatterns(),
        new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(updateValueOptionsModel.append(), Boolean.valueOf(false));
    assertEquals(updateValueOptionsModel.includeAudit(), Boolean.valueOf(false));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateValueOptionsError() throws Throwable {
    new UpdateValueOptions.Builder().build();
  }
}
