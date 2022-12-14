import scala.io.Source

object Main extends App {
  val cardsFile = Source.fromFile("src/main/resources/cards.csv")

  trait Card {
    val limit: Int

    val number: Long
    val cvc: Int
    val owner: String
    val credit: Int
  }
  class GoldCard(
    val number: Long,
    val cvc: Int,
    val owner: String,
    val credit: Int
  ) extends Card {
    val limit = 1000
  }
  class BlueCard(
    val number: Long,
    val cvc: Int,
    val owner: String,
    val credit: Int
  ) extends Card {
    val limit = 500
  }

  val cards: List[Card] = cardsFile.getLines().map { line =>
    val csvVals = line.split(",")

    if (csvVals(0) == "g")
      new GoldCard(csvVals(1).toLong, csvVals(2).toInt, csvVals(3), csvVals(4).toInt)
    else
      new BlueCard(csvVals(1).toLong, csvVals(2).toInt, csvVals(3), csvVals(4).toInt)
  }.toList

  println(cards)
}
