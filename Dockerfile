FROM openjdk:11
ADD target/BudgetPlan-1.0-SNAPSHOT.jar BudgetPlan-1.0-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "BudgetPlan-1.0-SNAPSHOT.jar"]