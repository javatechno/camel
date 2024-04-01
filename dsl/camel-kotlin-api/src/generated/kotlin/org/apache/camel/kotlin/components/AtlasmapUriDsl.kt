/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kotlin.components

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import org.apache.camel.kotlin.CamelDslMarker
import org.apache.camel.kotlin.UriDsl

/**
 * Transforms the message using an AtlasMap transformation.
 */
public fun UriDsl.atlasmap(i: AtlasmapUriDsl.() -> Unit) {
  AtlasmapUriDsl(this).apply(i)
}

@CamelDslMarker
public class AtlasmapUriDsl(
  it: UriDsl,
) {
  private val it: UriDsl

  init {
    this.it = it
    this.it.component("atlasmap")
  }

  private var resourceUri: String = ""

  /**
   * Path to the resource. You can prefix with: classpath, file, http, ref, or bean. classpath, file
   * and http loads the resource using these protocols (classpath is default). ref will lookup the
   * resource in the registry. bean will call a method on a bean to be used as the resource. For bean
   * you can specify the method name after dot, eg bean:myBean.myMethod.
   */
  public fun resourceUri(resourceUri: String) {
    this.resourceUri = resourceUri
    it.url("$resourceUri")
  }

  /**
   * Sets whether the context map should allow access to all details. By default only the message
   * body and headers can be accessed. This option can be enabled for full access to the current
   * Exchange and CamelContext. Doing so impose a potential security risk as this opens access to the
   * full power of CamelContext API.
   */
  public fun allowContextMapAll(allowContextMapAll: String) {
    it.property("allowContextMapAll", allowContextMapAll)
  }

  /**
   * Sets whether the context map should allow access to all details. By default only the message
   * body and headers can be accessed. This option can be enabled for full access to the current
   * Exchange and CamelContext. Doing so impose a potential security risk as this opens access to the
   * full power of CamelContext API.
   */
  public fun allowContextMapAll(allowContextMapAll: Boolean) {
    it.property("allowContextMapAll", allowContextMapAll.toString())
  }

  /**
   * Sets whether to use resource content cache or not
   */
  public fun contentCache(contentCache: String) {
    it.property("contentCache", contentCache)
  }

  /**
   * Sets whether to use resource content cache or not
   */
  public fun contentCache(contentCache: Boolean) {
    it.property("contentCache", contentCache.toString())
  }

  /**
   * Whether to enable or disable force reload mode. This is set to false by default and ADM file is
   * loaded from a file only on a first Exchange, and AtlasContext will be reused after that until
   * endpoint is recreated. If this is set to true, ADM file will be loaded from a file on every
   * Exchange.
   */
  public fun forceReload(forceReload: String) {
    it.property("forceReload", forceReload)
  }

  /**
   * Whether to enable or disable force reload mode. This is set to false by default and ADM file is
   * loaded from a file only on a first Exchange, and AtlasContext will be reused after that until
   * endpoint is recreated. If this is set to true, ADM file will be loaded from a file on every
   * Exchange.
   */
  public fun forceReload(forceReload: Boolean) {
    it.property("forceReload", forceReload.toString())
  }

  /**
   * The Exchange property name for a source message map which hold java.util.Map&lt;String,
   * Message&gt; where the key is AtlasMap Document ID. AtlasMap consumes Message bodies as source
   * documents, as well as message headers as source properties where the scope equals to Document ID.
   */
  public fun sourceMapName(sourceMapName: String) {
    it.property("sourceMapName", sourceMapName)
  }

  /**
   * TargetMapMode enum value to specify how multiple target documents are delivered if exist.
   * 'MAP': Stores them into a java.util.Map, and the java.util.Map is set to an exchange property if
   * 'targetMapName' is specified, otherwise message body. 'MESSAGE_HEADER': Stores them into message
   * headers. 'EXCHANGE_PROPERTY': Stores them into exchange properties. )
   */
  public fun targetMapMode(targetMapMode: String) {
    it.property("targetMapMode", targetMapMode)
  }

  /**
   * The Exchange property name for a target document map which hold java.util.Map&lt;String,
   * Object&gt; where the key is AtlasMap Document ID. AtlasMap populates multiple target documents
   * into this map.
   */
  public fun targetMapName(targetMapName: String) {
    it.property("targetMapName", targetMapName)
  }

  /**
   * Whether the producer should be started lazy (on the first message). By starting lazy you can
   * use this to allow CamelContext and routes to startup in situations where a producer may otherwise
   * fail during starting and cause the route to fail being started. By deferring this startup to be
   * lazy then the startup failure can be handled during routing messages via Camel's routing error
   * handlers. Beware that when the first message is processed then creating and starting the producer
   * may take a little time and prolong the total processing time of the processing.
   */
  public fun lazyStartProducer(lazyStartProducer: String) {
    it.property("lazyStartProducer", lazyStartProducer)
  }

  /**
   * Whether the producer should be started lazy (on the first message). By starting lazy you can
   * use this to allow CamelContext and routes to startup in situations where a producer may otherwise
   * fail during starting and cause the route to fail being started. By deferring this startup to be
   * lazy then the startup failure can be handled during routing messages via Camel's routing error
   * handlers. Beware that when the first message is processed then creating and starting the producer
   * may take a little time and prolong the total processing time of the processing.
   */
  public fun lazyStartProducer(lazyStartProducer: Boolean) {
    it.property("lazyStartProducer", lazyStartProducer.toString())
  }
}
