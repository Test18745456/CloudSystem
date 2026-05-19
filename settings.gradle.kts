rootProject.name = "nythera-cloud"

include(
    "nythera-api",
    "nythera-core",
    "nythera-network",
    "nythera-master",
    "nythera-worker"
)

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}
