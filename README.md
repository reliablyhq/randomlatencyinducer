# randomlatencyinducer
A sample Random Latency Inducer service.

## Building the service

This service is built using [Maven][mvn]. To build the service, run the tests and package ready for distributing using  Docker use the following command:

[mvn]:

```shell
./mvnw package
```

## Build a Docker image for the service

To build a Docker image for distribution of the service, run the :
```shell
docker build -t reliably/randomlatencyinjector .
```

## Run the service using Docker

```shell
docker run -p 8080:8080 reliably/randomlatencyinjector
```