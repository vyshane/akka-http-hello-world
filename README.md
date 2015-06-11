#Akka HTTP Hello World

Build the Akka application:

```bash
$ sbt assembly
```

Launch in a Docker container. You need to have [Docker](https://www.docker.com) and [Docker Compose](https://docs.docker.com/compose/) installed.

```bash
$ docker-compose up
```

Send a test request, where xxx.xxx.xxx.xxx is the IP address of the Docker container:

```bash
$ curl http://xxx.xxx.xxx.xxx
Hello, World!
```

You can find the Akka HTTP documentation [here](http://doc.akka.io/docs/akka-stream-and-http-experimental/1.0-M2/scala/http/).
