FROM openjdk:16
ADD target/BudgetPlan-1.0-SNAPSHOT.jar BudgetPlan-1.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/BudgetPlan-1.0-SNAPSHOT.jar"]

