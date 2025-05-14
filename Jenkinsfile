@Library('jenkins-template-lib') _

build()
s3Deploy()
stage('Set Build Env') {
    steps {
        script {
            def needsUpdate = build_environment.get_build_environment()
            echo "Needs update: ${needsUpdate}"
        }
    }
}
