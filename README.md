# Create an archetype for a simple and working struts2 basic application

To create and install the archetype in the local repository:

```
mvn clean install
```

To generate a new project with the new local archetype:

```
mvn archetype:generate -DarchetypeCatalog=local
```

### Appendix A:

When experimenting with archetypes in the local catalogue, you may want to delete test archetypes from it. Delete them from:

```
~/.m2/archetype-catalog.xml
```

References:

[http://maven.apache.org/archetype/maven-archetype-plugin/specification/archetype-catalog.html](archetype-catalog)

[https://maven.apache.org/archetype/archetype-models/archetype-descriptor/archetype-descriptor.html](archetype-descriptor)

