
void call() {
    echo "Setting up build environment..."

    // Set default values if not already set
    if (!env.OS) {
        env.OS = "linux"
    }
    if (!env.ARCH) {
        env.ARCH = "amd64"
    }

    env.BUILD_ENV_TAG = "${env.OS}-${env.ARCH}"
    echo "Build Env Tag: ${env.BUILD_ENV_TAG}"
}
