# Project Guidelines

Below is an implementation of a service that can retrieve the latest version from maven central. You can curl yourself the latest versions by running an equivalent command from the CLI.

Here is an example command to retrieve the latest version of the org.jetbrains.kotlinx:kotlinx-serialization-json artifact:

```bash
curl "https://search.maven.org/solrsearch/select?q=g:%22org.jetbrains.kotlinx%22+AND+a:%22kotlinx-serialization-json%22&rows=1&wt=json"
```

When you add new dependencies to a project, make sure that all the artifacts are actually the latest version by looking them up on Maven Central.

The exception for this are the following groups and subgroups, which cannot be looked up on Maven Central:

androidx
com.android
com.google
