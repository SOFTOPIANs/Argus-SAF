/*
 * Copyright (c) 2018. Fengguo Wei and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License v2.0
 * which accompanies this distribution, and is available at
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Detailed contributors are listed in the CONTRIBUTOR.md
 */

package org.argus.jnsaf.analysis

import org.argus.amandroid.alir.taintAnalysis.AndroidSourceAndSinkManager
import org.argus.amandroid.core.ApkGlobal
import org.argus.jawa.flow.cfg.ICFGCallNode
import org.argus.jawa.flow.pta.PTAResult

/**
  * Created by fgwei on 4/27/17.
  */
class JNISourceAndSinkManager(sasFilePath: String) extends AndroidSourceAndSinkManager(sasFilePath) {

  override def isIntentSink(apk: ApkGlobal, invNode: ICFGCallNode, pos: Option[Int], s: PTAResult): Boolean = false
}