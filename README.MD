
# Kafka-Docker

Service Docker proposant un simple broker Kafka 

## Outils
https://www.kafkatool.com/download.html

### 1. Server Kafka
Pour démarrer le serveur Kafka (Docker)
```bash
docker-compose up
```
En mode daemon:
```bash
docker-compose up -d
```

Pour arrêter le service
```bash
docker-compose stop
```

Le serveur zookeeper expose sur le port *2181*
Le Broker est accessible via : *localhost:29092*

### 2. Produceur
RAS.
### 3. Consumer
RAS.