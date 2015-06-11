import akka.actor.ActorSystem
import akka.event.{Logging, LoggingAdapter}
import akka.http.scaladsl.Http
import akka.stream.{ActorFlowMaterializer, FlowMaterializer}
import com.typesafe.config.{ConfigFactory, Config}
import akka.http.scaladsl.server.Directives._


object HelloWorldService extends App {
  implicit val system = ActorSystem()
  implicit val executor = system.dispatcher
  implicit val materializer = ActorFlowMaterializer()

  val config = ConfigFactory.load()
  val logger = Logging(system, getClass)

  val routes =
    get {
      pathSingleSlash {
        complete {
          "Hello, World!"
        }
      }
    }

  Http().bindAndHandle(routes, config.getString("http.address"), config.getInt("http.port"))
}
