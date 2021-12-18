pluginManagement {
  repositories {
    //gradle 国内镜像仓
    maven("https://maven.aliyun.com/repository/gradle-plugin")
    //google 国内镜像仓
    maven("https://maven.aliyun.com/repository/google")
    //jcenter 国内镜像仓
    maven("https://maven.aliyun.com/repository/jcenter")
    
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
    gradlePluginPortal()
    mavenCentral()
  }
}

//rootProject.name = ""
include(":common")

