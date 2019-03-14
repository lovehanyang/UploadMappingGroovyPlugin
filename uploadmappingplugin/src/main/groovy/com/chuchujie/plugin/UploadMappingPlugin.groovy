package com.chuchujie.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class UploadMappingPlugin implements Plugin<Project>{

    @Override
    void apply(Project project) {
        println('this is a lovehanyang plugin...')
    }
}
