package com.github.germanslok.customlang.services

import com.github.germanslok.customlang.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
