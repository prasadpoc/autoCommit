FROM ubuntu
 RUN apt-get update && apt-get install -y \
  openjdk-8-jdk \
  maven \
  git
 ENTRYPOINT ["/bin/bash"]
 

 