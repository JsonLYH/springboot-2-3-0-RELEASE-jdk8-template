FROM 10.10.10.13:8898/base-image/base-jdk8:1.0.0
COPY target/mebay_2_3_0_release_jdk8_template.jar mebay_2_3_0_release_jdk8_template.jar
ENV SW_AGENT_NAME "mebay_2_3_0_release_jdk8_template"

ENTRYPOINT ["java","-javaagent:/home/skywalking-agent/skywalking-agent/skywalking-agent.jar","-jar","/mebay_2_3_0_release_jdk8_template.jar","--spring.profiles.active=prod"," >mebay_2_3_0_release_jdk8_template.log 2>&1 &"]