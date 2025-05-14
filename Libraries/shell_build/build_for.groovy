void call(String env) {
    echo "Running shell build for environment: ${env}"

    if (fileExists('package.json')) {
        echo "Detected Node.js project. Installing and building..."
        sh 'npm install'
        sh 'npm run build'
    } else if (fileExists('pom.xml')) {
        echo "Detected Maven project. Packaging..."
        sh 'mvn clean package'
    } else {
        echo "No recognized build file found. Skipping shell build."
    }
}
