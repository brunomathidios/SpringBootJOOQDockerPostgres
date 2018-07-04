#!/bin/bash

java -classpath jooq-3.11.2.jar:jooq-meta-3.11.2.jar:jooq-codegen-3.11.2.jar:postgresql-42.2.2.jar:. org.jooq.codegen.GenerationTool jooq_gen.xml
