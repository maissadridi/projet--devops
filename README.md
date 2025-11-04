 **Configure SonarCloud** (free for public repos):
   - Create a project on https://sonarcloud.io and link your GitHub repo.
   - In GitHub repo **Settings → Secrets and variables → Actions → New repository secret**, add:
     - `SONAR_TOKEN` = your SonarCloud token
     - Optionally `SONAR_ORG` and `SONAR_PROJECT_KEY` (or edit the values in `pom.xml`).

 **Run the pipeline**: push to `main`. The workflow:
   - builds and tests with Maven
   - runs Javadoc
   - runs SonarCloud analysis
   - generates a CycloneDX SBOM at `target/bom.json` (and `bom.xml` if enabled)
   - publishes the JAR in `target/`

## Local build
```bash
mvn -B -q clean verify
java -jar target/java-ci-sonar-sbom-demo-1.0.0.jar
```
