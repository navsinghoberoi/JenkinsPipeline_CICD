# JenkinsPipeline
Declarative Jenkins Pipeline integrated with a demo application.

# Getting Started :
Below mentioned instructions will get you a copy of the project up and running on your local machine for testing purposes.

# Prerequisites :
IntelliJ Idea                                                                                                                                                                                  
Java 8               
Docker                                                                                                                                                   
                                                       
Clone the repository via ssh/http using URL -->                                                                                      
https://github.com/navsinghoberoi/JenkinsPipeline.git


# Setting up Jenkins & Running the pipeline  :
1. Go to src/test/resources folder.
2. Run the command **docker-compose up -d** (Make sure docker is running on machine)
3. Go to browser and open **localhost:8080**, sign in via admin account.
4. On Jenkins, click on New item and select **Pipeline** type project.
5. On configure job page, go to **Pipeline** section -> Select **Pipeline script from SCM option** -> Select **Git** and provide repo url -> provide exact **JenkinsFile name** created in the repo in the **Script path** field.
6. Now run the created pipeline. Stages created in the pipeline are -> Initialize, Build and Test


# Built With :
1. Jenkins
2. Java
3. Maven
4. Git
5. Docker

# Author :
Navpreet Singh

# Sample jenkins job result :
![ocean_blue_results](https://user-images.githubusercontent.com/21955275/86538295-d14ca880-bf12-11ea-956a-faff68ba246e.png)


<img width="1439" alt="jenkins_results_page" src="https://user-images.githubusercontent.com/21955275/86538304-df022e00-bf12-11ea-951f-111be3e28ba6.png">
