package com.github.garrettjmu.intellijcadenceplugin.services

import com.github.garrettjmu.intellijcadenceplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
