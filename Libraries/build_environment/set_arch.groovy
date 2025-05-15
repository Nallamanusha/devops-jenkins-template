void call(String arch = "amd64") {
    echo "Setting architecture..."

    if (!env.ARCH) {
        env.ARCH = arch
        echo "Architecture set to default: ${arch}"
    } else {
        echo "Architecture already set: ${env.ARCH}"
    }
}
