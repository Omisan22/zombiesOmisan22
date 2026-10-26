package edu.unc.comp301.zombies;

public class MyDayStrategy implements IDayStrategy {
    @Override
    public void execute(Base base, int durationMilliseconds) throws InterruptedException {
        int attack = durationMilliseconds / 10;
        int gap = (durationMilliseconds - 3 * attack) / 4;
        int lastGap = durationMilliseconds - 3 * attack - 3 * gap;

        for (int i = 0; i < 3; i++) {
            Thread.sleep(gap);
            base.startAttack();
            Thread.sleep(attack);
            base.endAttack();
        }
        Thread.sleep(lastGap);
    }
}