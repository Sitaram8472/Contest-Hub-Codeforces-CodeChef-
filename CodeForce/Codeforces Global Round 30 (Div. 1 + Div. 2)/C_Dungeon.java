import java.util.*;

public class C_Dungeon {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int testCases = sc.nextInt();

    while (testCases-- > 0) {
      int swordCount = sc.nextInt();
      int monsterCount = sc.nextInt();

      TreeMap<Integer, Integer> swords = new TreeMap<>();
      for (int i = 0; i < swordCount; i++) {
        int damage = sc.nextInt();
        swords.put(damage, swords.getOrDefault(damage, 0) + 1);
      }

      int[] monsterHealth = new int[monsterCount];
      int[] monsterReward = new int[monsterCount];

      for (int i = 0; i < monsterCount; i++) {
        monsterHealth[i] = sc.nextInt();
      }
      for (int i = 0; i < monsterCount; i++) {
        monsterReward[i] = sc.nextInt();
      }

      List<Monster> monsters = new ArrayList<>();
      for (int i = 0; i < monsterCount; i++) {
        monsters.add(new Monster(monsterHealth[i], monsterReward[i]));
      }

      monsters.sort(Comparator.comparingInt(o -> o.health));

      int kills = 0;

      for (Monster monster : monsters) {
        Integer chosenSword = swords.ceilingKey(monster.health);
        if (chosenSword == null)
          continue;

        kills++;

        if (swords.get(chosenSword) == 1)
          swords.remove(chosenSword);
        else
          swords.put(chosenSword, swords.get(chosenSword) - 1);

        if (monster.reward > 0) {
          int gainedSword = Math.max(chosenSword, monster.reward);
          swords.put(gainedSword, swords.getOrDefault(gainedSword, 0) + 1);
        }
      }

      System.out.println(kills);
    }

    sc.close();
  }

  static class Monster {
    int health, reward;

    Monster(int health, int reward) {
      this.health = health;
      this.reward = reward;
    }
  }
}
