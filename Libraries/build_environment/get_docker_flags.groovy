
String call() {
    echo "Generating Docker flags..."

    def flags = "--platform=${env.OS}/${env.ARCH}"

    echo "Docker Flags: ${flags}"
    return flags
}
