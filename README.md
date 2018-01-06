# Vaadin Light

Minimal Standalone Vaadin Application Jar with Maven (~ 6.2MB).

This project is a fork from [samie](https://github.com/samie)'s [gist](https://gist.github.com/samie/e2bc8f690ddd6f2fa653), to add some structure and upgrade the Vaadin version.

## Compiling

To compile the entire project, run `mvn package`.

## Running

To run the application, locat the generated `jar` file in the `target` directory, and run `java -jar <filename>.jar`, 
e.g:

```bash
java -jar target/vaadin-light-1.0-SNAPSHOT-jar-with-dependencies.jar
```

Then open http://localhost:8080/.
