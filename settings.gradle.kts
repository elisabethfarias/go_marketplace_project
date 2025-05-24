pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "GoMarkeplace"
include(":app")
include(":modulo")
include(":modulo:gomarkeplace:data:contract")
include(":modulo:gomarkeplace:data:implementation")
include(":modulo:gomarkeplace:domain:contract")
include(":modulo:gomarkeplace:presentation")
include(":modulo:gomarkeplace:domain:implementation")
