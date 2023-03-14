import gradle.kotlin.dsl.accessors._8031e8204a17d8ab5c478cc96d740be9.test
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.getByType

dependencies {
    val libs = project.extensions.getByType<VersionCatalogsExtension>().named("libs")

    add("testImplementation", libs.findLibrary("junit5").get())
    add("testImplementation", libs.findLibrary("truth").get())
}

tasks {
    test {
        useJUnitPlatform()
    }
}
