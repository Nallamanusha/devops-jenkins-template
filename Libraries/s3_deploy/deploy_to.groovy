void call(Map config = [:]) {
    def source = config.source ?: 'build/**'
    def target = config.target ?: 's3://my-default-bucket/'
    def exclude = config.exclude ?: ''

    echo "Deploying to S3..."
    echo "Source: ${source}"
    echo "Target: ${target}"
    echo "Exclude: ${exclude}"

    sh """
    aws s3 sync ${source} ${target} \
        --delete \
        ${exclude ? "--exclude '${exclude}'" : ''} \
        --acl public-read
    """
}
