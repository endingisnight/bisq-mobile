enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "BisqApps"
include(":shared:domain")
include(":shared:ui")
include(":shared:presentation")
include(":androidClient")
include(":androidNode")