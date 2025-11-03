
# Java CI/CD + SonarCloud + SBOM Demo

This repository demonstrates a minimal Java (Maven) project wired with:
- **GitHub Actions** CI (build, test, Javadoc, package)
- **SonarCloud** code quality analysis
- **CycloneDX** SBOM generation
- Executable **JAR** artifact

## Quick start

1. **Create a new GitHub repo** and push this project:
   ```bash
   git init
   git add .
   git commit -m "Initial CI/CD + Sonar + SBOM setup"
   git branch -M main
   git remote add origin https://github.com/<your-user>/<your-repo>.git
   git push -u origin main
   ```

2. **Configure SonarCloud** (free for public repos):
   - Create a project on https://sonarcloud.io and link your GitHub repo.
   - In GitHub repo **Settings → Secrets and variables → Actions → New repository secret**, add:
     - `SONAR_TOKEN` = your SonarCloud token
     - Optionally `SONAR_ORG` and `SONAR_PROJECT_KEY` (or edit the values in `pom.xml`).

3. **Run the pipeline**: push to `main`. The workflow:
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

## Where to find outputs
- **JAR**: `target/java-ci-sonar-sbom-demo-1.0.0.jar`
- **Javadoc**: `target/site/apidocs/index.html`
- **SBOM** (CycloneDX): `target/bom.json`
