void call() {
    echo "Setting URL based on environment..."

    if (!env.URL) {
        env.URL = "https://example.com/builds/${env.OS}/${env.ARCH}"
        echo "URL set to: ${env.URL}"
    } else {
        echo "URL already set: ${env.URL}"
    }
}

