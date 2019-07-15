package org.jetbrains.kotlin.tools.gradleimportcmd

import org.jetbrains.kotlin.tools.testutils.TestSuite
import org.jetbrains.kotlin.tools.testutils.enableModelBuilderStatistics
import org.jetbrains.kotlin.tools.testutils.importProject
import org.jetbrains.kotlin.tools.testutils.reportModelBuildersOverhead

open class MeasureModelBuildersStatistics : ImportAndSave() {

    override fun run(args: List<String>, workingDir: String?) {
        enableModelBuilderStatistics(projectPath)
        importProject(projectPath, jdkPath, false)
        reportModelBuildersOverhead()
    }
}