package com.github.antoniosabljic.hibernatetemplategenerator.services

import com.intellij.openapi.project.Project
import com.github.antoniosabljic.hibernatetemplategenerator.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
