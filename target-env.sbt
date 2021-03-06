/*
 * The `cloudflowDockerRegistry` and `cloudflowDockerRepository` settings specify
 * the Docker registry (e.g. hostname) and repository (e.g. path on that host)
 * that the Cloudflow sbt plugin uses for pushing application Docker images.
 *
 * Example:
 *
 * cloudflowDockerRegistry := Some("foo.com")
 * cloudflowDockerRepository := Some("bar/baz")
 *
 * This will cause your application Docker images to be pushed as:
 *
 * `foo.com/bar/baz/[image name]:[tag]`
 *
 * In multi-project SBT setups, please prefix both values with `ThisBuild / `, e.g.:
 *
 * ThisBuild / cloudflowDockerRegistry := Some("foo.com")
 * ThisBuild / cloudflowDockerRepository := Some("bar/baz")
 *
 * The sbt plugin expects you to have logged in to the specified registry using
 * the `docker login` command.
 */
ThisBuild / cloudflowDockerRegistry := None
ThisBuild / cloudflowDockerRepository := Some("localhost:5001")
