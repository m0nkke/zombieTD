package com.main;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;

import org.graalvm.compiler.virtual.phases.ea.EffectsBlockState;

public class Resources {
    //UI Elements
    static Texture bg = new Texture(Gdx.files.internal("DungeonBackground.png"));
    static Texture button_cannon = new Texture(Gdx.files.internal("CannonIcon.png"));
    static Texture button_cannon_fire = new Texture(Gdx.files.internal("FireCannonIcon.png"));
    static Texture button_cannon_super = new Texture(Gdx.files.internal("SuperCannonIcon.png"));
    static Texture button_cannon_double = new Texture(Gdx.files.internal("doubleCannonIcon.png"));
    static Texture button_cannon_laser = new Texture(Gdx.files.internal("laserCannonIcon.png"));
    static Texture button_cannon_mounted = new Texture(Gdx.files.internal("mountedCannonIcon.png"));
    static Texture locked = new Texture(Gdx.files.internal("locked.png"));
    static Texture selected = new Texture(Gdx.files.internal("border.png"));
    static Texture red_bar= new Texture(Gdx.files.internal("red_bar.png"));
    static Texture green_bar = new Texture(Gdx.files.internal("green_bar.png"));
    static Texture tooltip_bg = new Texture(Gdx.files.internal("ttbg.png"));
    static Texture button_close = new Texture(Gdx.files.internal("x.png"));



    //Cannons
    static Texture cannon = new Texture(Gdx.files.internal("regularSnorlax.png"));
    static Texture cannon_fire = new Texture(Gdx.files.internal("Charmeleon.png"));
    static Texture cannon_super = new Texture(Gdx.files.internal("Darkrai.png"));
    static Texture cannon_double = new Texture(Gdx.files.internal("Klink.png"));
    static Texture cannon_laser = new Texture(Gdx.files.internal("Magneton.png"));
    static Texture cannon_mounted = new Texture(Gdx.files.internal("mountedCannon.png"));

    //Zombies
    static Texture test_zombie = new Texture(Gdx.files.internal("Zombie.png"));
    static Texture zombie = new Texture(Gdx.files.internal("Zombies.png"));
    static Texture zombie_dif = new Texture(Gdx.files.internal("DifZombies.png"));
    static Texture zombie_speedy = new Texture(Gdx.files.internal("speedy_zombie.png"));
    static Texture zombie_riot = new Texture(Gdx.files.internal("riotzombieBIG.png"));
    static Texture zombie_fast = new Texture(Gdx.files.internal("Fastzombies.png"));

    //Bullets
    static Texture bullet = new Texture(Gdx.files.internal("Bullet.png"));

    //Effects
    static Texture click = new Texture(Gdx.files.internal("click_effect.png"));
    static Texture boom = new Texture(Gdx.files.internal("boom.png"));

    //Sounds
    static Sound bullet_sound = Gdx.audio.newSound(Gdx.files.internal("Bullet.mp3"));
    static Sound bullet_pew_sound = Gdx.audio.newSound(Gdx.files.internal("FireBullet.mp3"));

}
