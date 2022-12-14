object Main2 extends App {
  println("cau")

  class CoffeeMachineCoffeine {
    val coffeineMgs: Int = 0

    def printMgs: Unit = {
      println(coffeineMgs)
    }
  }

  trait Sugar {
    val sugarMgs = 1
  }

  class Coffeine extends CoffeeMachineCoffeine with Sugar {
    override val coffeineMgs: Int = 50
    sugarMgs
  }

  class NoCoffeine extends CoffeeMachineCoffeine {
    override val coffeineMgs: Int = 0
  }

  val coffeine = new Coffeine

  def makeCoffee(machine: CoffeeMachineCoffeine): Unit = {
    println(s"making coffee with ${machine.coffeineMgs} mg coffeine")
  }

  makeCoffee(new Coffeine)
    makeCoffee(new NoCoffeine)

}
