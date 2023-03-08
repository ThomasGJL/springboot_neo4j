# springboot_neo4j

拉取容器  
```
docker pull neo4j:3.5.35-community
```

运行容器  
```
docker run -d --name neo4j -p 7474:7474 -p 7687:7687 -v /home/neo4j/data:/data -v /home/neo4j/logs:/logs -v /home/neo4j/conf:/var/lib/neo4j/conf -v /home/neo4j/import:/var/lib/neo4j/import –-env NEO4J_AUTH=neo4j/admin neo4j:3.5.35-community
```

浏览器输入  
```
localhost:7474
```

进入容器  
```
docker exec -it neo4j /bin/bash
```

