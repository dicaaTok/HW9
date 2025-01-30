package src.kg.geeks.game.players;

import java.util.Random;

public class Ludoman extends Hero implements Fighter {
    public Ludoman(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.LUDOMAN);
    }

    @Override
    public void attack(GameEntity entity) {

    }

    @Override
    public void applySuperPower(Berserk.Boss boss, Hero[] heroes) {
        Random random=new Random();
        int kosti1 = random.nextInt(6) + 1;
        int kosti2 = random.nextInt(6) + 1;
        System.out.println("Результат броска:" + kosti2 + "|" + kosti1);
        if (kosti1 == kosti2) {
            int damage1 = kosti2 * kosti1;
            System.out.println("Урон боссу:" + damage1);
            boss.setHealth(boss.getHealth() - damage1);
        } else {
            Hero hero = heroes[random.nextInt(heroes.length)];
            int damage2 = kosti2 + kosti1;
            hero.setHealth(hero.getHealth() - damage2);
            System.out.println("Отнято " + damage2 + " здоровья сокоманднику " + hero.getName() + ".");


        }
        /* int a1 = RPG_Game.random.nextInt(6);
        int a2 = RPG_Game.random.nextInt(6);
        int a4 = a1 + a2 ;

        int a3 = RPG_Game.random.nextInt(Hero.getHealth());

        if (a2 == a1 ){
            boss.setHealth(boss.getHealth() - a2);
            System.out.println("У лудамана совпали кости " + a1 + a2);
        }   //if ( hero.getHealth() > 0 && hero != this && a2 !=a1){
            for (Hero hero : heroes)
                if ( hero.getHealth() > 0 && hero != this && a2 !=a1) {
                    hero.setHealth(hero.getHealth() - a4);

                } System.out.println("У лудамана не совпали кости " + a1 + a2);*/


        }


}
//Лудоман. Его способность: Он бросает две игральные кости, YES
// если они совпадают,YES
// то он отнимает произведение чисел которые выпали из здоровья босса,YES
// если же они не совпадают,
// то он отнимает сумму чисел из здоровья случайного сокомандника.