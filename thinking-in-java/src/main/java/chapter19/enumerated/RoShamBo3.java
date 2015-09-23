//: enumerated/RoShamBo3.java
// Using constant-specific methods.
package chapter19.enumerated;

public enum RoShamBo3 implements Competitor<RoShamBo3> {
  PAPER {
    public Outcome compete(RoShamBo3 it) {
      switch(it) {
        default: // To placate the compiler
        case PAPER: return Outcome.DRAW;
        case SCISSORS: return Outcome.LOSE;
        case ROCK: return Outcome.WIN;
      }
    }
  },
  SCISSORS {
    public Outcome compete(RoShamBo3 it) {
      switch(it) {
        default:
        case PAPER: return Outcome.WIN;
        case SCISSORS: return Outcome.DRAW;
        case ROCK: return Outcome.LOSE;
      }
    }
  },
  ROCK {
    public Outcome compete(RoShamBo3 it) {
      switch(it) {
        default:
        case PAPER: return Outcome.LOSE;
        case SCISSORS: return Outcome.WIN;
        case ROCK: return Outcome.DRAW;
      }
    }
  };
  public abstract Outcome compete(RoShamBo3 it);
  public static void main(String[] args) {
    RoShamBo.play(RoShamBo3.class, 20);
  }
} /* Same output as RoShamBo2.java *///:~
