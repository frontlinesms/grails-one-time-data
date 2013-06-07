grails.project.dependency.resolution = {
        def gebVersion = '0.7.2'

        // inherit Grails' default dependencies
        inherits("global") {
                // uncomment to disable ehcache
                // excludes 'ehcache'
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

                // uncomment these to enable remote dependency resolution from public Maven repositories
                //mavenCentral()
                //mavenRepo "http://snapshots.repository.codehaus.org"
                //mavenRepo "http://repository.codehaus.org"
                //mavenRepo "http://download.java.net/maven/2/"
                //mavenRepo "http://repository.jboss.com/maven2/"
        }
}
