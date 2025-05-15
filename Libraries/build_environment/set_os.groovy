void call(String os = "linux") {
    echo "Setting operating system..."

    if (!env.OS) {
        env.OS = os
        echo "OS set to default: ${os}"
    } else {
        echo "OS already set: ${env.OS}"
    }
}

