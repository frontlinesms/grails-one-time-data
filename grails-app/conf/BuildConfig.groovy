grails.project.dependency.resolution = {
        inherits("global") {
        }
        log "error" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
        checksums true // Whether to verify checksums on resolve

        repositories {
                inherits true // Whether to inherit repository definitions from plugins
                grailsHome()
                grailsPlugins()
                mavenLocal()
                mavenRepo "http://192.168.0.200:8081/artifactory/simple/super-repo/"
                grailsRepo "http://192.168.0.200:8081/artifactory/simple/super-repo/"
                mavenRepo 'http://dev.frontlinesms.com/m2repo/'
                mavenCentral()
                grailsCentral()
        }

	plugins {

		build ":release:$grailsVersion", {
			excludes 'http-builder'
			export = false
		}
	}
}
