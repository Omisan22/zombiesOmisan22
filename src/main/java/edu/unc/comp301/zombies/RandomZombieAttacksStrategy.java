package edu.unc.comp301.zombies;

public class RandomZombieAttacksStrategy implements IDayStrategy {
  @Override
  public void execute(Base base, int durationMilliseconds) throws InterruptedException {
    int attack = durationMilliseconds / 5;
    int gap = (durationMilliseconds - 2 * attack) / 3;
    int lastGap = durationMilliseconds - 2 * attack - 2 * gap;

    Thread.sleep(gap);
    base.startAttack();
    Thread.sleep(attack);
    base.endAttack();

    Thread.sleep(gap);
    base.startAttack();
    Thread.sleep(attack);
    base.endAttack();

    Thread.sleep(lastGap);
  }
}
