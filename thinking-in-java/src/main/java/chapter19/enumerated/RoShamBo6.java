//: enumerated/RoShamBo6.java
// Enums using "tables" instead of multiple dispatch.
package chapter19.enumerated;

enum RoShamBo6 implements Competitor<RoShamBo6> {
  PAPER, SCISSORS, ROCK;
  private static Outcome[][] table = {
    { Outcome.DRAW, Outcome.LOSE, Outcome.WIN }, // PAPER
    { Outcome.WIN, Outcome.DRAW, Outcome.LOSE }, // SCISSORS
    { Outcome.LOSE, Outcome.WIN, Outcome.DRAW }, // ROCK
  };
  public Outcome compete(RoShamBo6 other) {
    return table[this.ordinal()][other.ordinal()];
  }
  public static void main(String[] args) {
    RoShamBo.play(RoShamBo6.class, 20);
  }
} ///:~
