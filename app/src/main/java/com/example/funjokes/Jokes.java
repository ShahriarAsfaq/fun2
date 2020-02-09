package com.example.funjokes;

import java.util.Random;

public class Jokes {
    String fact[] ={
            "If you think really hard, you will see that whiteboards are remarkable",
            "While going to get lunch in cafeteria mr.x did not get any DAL ,so he came back to his table without DAL. Then started thinking in his own mind.what is he doing? . . . Nodal analysis",
             "Why was the stadium so cold? . . .  . Because there were a lot of fans." ,
            "Why do the French eat snails?  . . .  They don't like fast food" ,
            "The man was hit in the head with a can of Sprite. . . . . . He's okay, it was a soft drink." ,
            "What do you call a cow in an earthquake? ..... A milkshake." ,
            "What did the seal with the broken arm say to the Polar bear? . . ..  Do not consume if seal is broken." ,
            "What do you call a shoe made from a banana? .... A slipper." ,
            "What did the buffalo say to his son when he left for college? . . ..  Bison."



    };

    String getfact(){
        Random randomnogenerator = new Random();
        int randomno= randomnogenerator.nextInt(fact.length);
        return fact[randomno];

    }
}
