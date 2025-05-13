libraries {
  jenkins-template-lib
}

application_environments {
  dev {
    build = true
    s3Deploy = true
  }
}
