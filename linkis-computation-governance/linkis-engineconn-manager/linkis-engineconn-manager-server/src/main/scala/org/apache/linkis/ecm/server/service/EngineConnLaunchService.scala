/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 
package org.apache.linkis.ecm.server.service

import org.apache.linkis.manager.common.entity.node.EngineNode
import org.apache.linkis.manager.engineplugin.common.launch.entity.{EngineConnBuildRequest, EngineConnLaunchRequest}



trait EngineConnLaunchService {
  /**
    * launchEngine启动一个引擎的方法
    * to start an engineconn
    * @param engineConnBuildRequest 封装了引擎启动的参数
    */
  def launchEngineConn(engineConnBuildRequest: EngineConnBuildRequest): EngineNode

  def launchEngineConn(engineConnLaunchRequest: EngineConnLaunchRequest, duration: Long): EngineNode

}
