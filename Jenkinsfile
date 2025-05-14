// This Jenkinsfile is the entry point for the JTE pipeline

pipeline {
    agent any

    stages {
        stage('Check Build Environment') {
            steps {
                script {
                    def needsUpdate = build_environment.get_build_environment()
                    if (needsUpdate) {
                        echo "Build environment update is needed"
                        // Implement logic for updating if required
                    } else {
                        echo "No update needed for build environment"
                    }
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    s3_build.build_for(env.BRANCH_NAME)
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    s3_deploy.deploy_to(env.BRANCH_NAME)
                }
            }
        }
    }
}
