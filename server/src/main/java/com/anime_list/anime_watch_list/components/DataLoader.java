package com.anime_list.anime_watch_list.components;

import com.anime_list.anime_watch_list.models.Anime;
import com.anime_list.anime_watch_list.models.Genre;
import com.anime_list.anime_watch_list.models.User;
import com.anime_list.anime_watch_list.models.WatchList;
import com.anime_list.anime_watch_list.repositroies.AnimeRepository;
import com.anime_list.anime_watch_list.repositroies.GenreRepository;
import com.anime_list.anime_watch_list.repositroies.UserRepository;
import com.anime_list.anime_watch_list.repositroies.WatchListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    AnimeRepository animeRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    WatchListRepository watchListRepository;

    @Autowired
    GenreRepository genreRepository;

    @Override
    public void run (ApplicationArguments args) throws Exception {

//      Add Anime
        Anime naruto = new Anime("Naruto", LocalDate.of(2002, 10, 03),
                "Moments prior to Naruto Uzumaki's birth, a huge demon known as the Kyuubi, the Nine-Tailed " +
                        "Fox, attacked Konohagakure, the Hidden Leaf Village, and wreaked havoc. ",
                4.6, 500, true,
                "https://media.kitsu.io/anime/11/poster_image/small-db4debb693482e09f5d9615864b99b3d.jpeg",
                "https://media.kitsu.io/anime/cover_images/11/original.jpg");
        Anime narutoShippuden = new Anime("Naruto Shippuden", LocalDate.of(2007, 02, 15), "It " +
                "has been two and a half years since Naruto Uzumaki left Konohagakure, the Hidden Leaf Village, for " +
                "intense training following events which fueled his desire to be stronger.", 10, 500,
                true, "https://media.kitsu.io/anime/poster_images/1555/small.jpg",
                "https://media.kitsu.io/anime/cover_images/1555/original.jpg");
        Anime bleach = new Anime("Bleach", LocalDate.of(2004, 10, 05),
                "Ichigo Kurosaki is an ordinary high schooler—until his family is attacked by a Hollow, " +
                        "a corrupt spirit that seeks to devour human souls.",
                4.5, 366, false,
                "https://media.kitsu.io/anime/poster_images/244/small.jpg", "https://media.kitsu.io/anime/cover_images/244/original.jpg");
        Anime attackOnTitan = new Anime("Attack on Titan", LocalDate.of(2013, 04, 07),
                "Centuries ago, mankind was slaughtered to near extinction by monstrous humanoid creatures" +
                        " called titans, forcing humans to hide in fear behind enormous concentric walls.",
                4.5, 86, false,
                "https://media.kitsu.io/anime/poster_images/7442/small.jpg","https://media.kitsu.io/anime/cover_images/7442/original.png");
        Anime onePiece = new Anime("One Piece", LocalDate.of(1999, 10, 03),
                "Enter Monkey D. Luffy, a 17-year-old boy who defies your " +
                        "standard definition of a pirate.",  4.5, 1014, false,
                "https://media.kitsu.io/anime/poster_images/12/small.jpg","https://media.kitsu.io/anime/12/cover_image/21ecb556255bd46b95aea4779d19789f.jpg");
        Anime haikyuu = new Anime("Haikyuu", LocalDate.of(2014, 04, 06),
                "Inspired after watching a volleyball ace nicknamed \\\"Little Giant\\\" in action, " +
                        "small-statured Shouyou Hinata revives the volleyball club at his middle school.",
                4.5, 73, true,
                "https://media.kitsu.io/anime/poster_images/8133/small.jpg","https://media.kitsu.io/anime/cover_images/8133/original.jpg");
        Anime kurokosBasketball = new Anime("Kuroko's Basketball", LocalDate.of(2012, 04, 07),
                "Teikou Junior High School's basketball team is crowned champion three years in a row " +
                        "thanks to five outstanding players who, with their breathtaking and unique skills.",
                4.5, 75, true,
                "https://media.kitsu.io/anime/6595/poster_image/small-e15bd563bb282dce553074560247c421.jpeg",
                "https://media.kitsu.io/anime/cover_images/6595/original.jpg");
        Anime bungoStrayDogs2 = new Anime("Bungo Stray Dogs 2", LocalDate.of(2016, 04, 07),
                "Guild has entered Yokohoma city. Along with the city, they want Atsushi of The Armed " +
                        "Detective Agency too.",
                4.5, 500, true,
                "https://media.kitsu.io/anime/poster_images/11882/small.jpg",
                "https://media.kitsu.io/anime/cover_images/11882/original.jpg");
        Anime deathNote = new Anime("Death Note", LocalDate.of(2002, 10, 03),
                "A shinigami, as a god of death, can kill any person—provided they see their victim's face " +
                        "and write their victim's name in a notebook called a Death Note.",
                4.5, 500, true,
                "https://media.kitsu.io/anime/poster_images/1376/small.jpg",
                "https://media.kitsu.io/anime/cover_images/1376/original.jpg");
        Anime slamDunk = new Anime("Slam Dunk", LocalDate.of(2002, 10, 03),
                "Hanamichi Sakuragi, infamous for this temper, massive height, and fire-red hair, enrolls " +
                        "in Shohoku High, hoping to finally get a girlfriend and break his record of being rejected " +
                        "50 consecutive times in middle school.",
                4.5, 500, true,
                "https://media.kitsu.io/anime/poster_images/148/small.jpg",
                "https://media.kitsu.io/anime/cover_images/148/original.jpg");
        Anime jojosBizzareAdventure2012 = new Anime("Jojo's Bizzare Adventure 2012", LocalDate.of(2002, 10, 03),
                "In 1868, Dario Brando saves the life of an English nobleman, George Joestar. By taking in Dario's " +
                        "son Dio when the boy becomes fatherless, George hopes to repay the debt he owes to his " +
                        "savior.",
                4.5, 500, true,
                "https://media.kitsu.io/anime/7158/poster_image/small-bde68eb96267be7833813f3a85b68df0.jpeg",
                "https://media.kitsu.io/anime/cover_images/7158/original.png");
        Anime onePunchMan = new Anime("One Punch man", LocalDate.of(2015,10,05),"test",
                4.5,500, false,"https://media.kitsu.io/anime/poster_images/10740/small.jpg",
                "https://media.kitsu.io/anime/cover_images/10740/original.jpg");
        Anime assinationClassroom = new Anime("Assassination Classroom", LocalDate.of(2015,10,05),"test",
                4.5,500, false,"https://media.kitsu.io/anime/poster_images/8640/small.jpg",
                "https://media.kitsu.io/anime/cover_images/8640/original.jpg");
        Anime mobPsycho100 = new Anime("Mob Psycho 100", LocalDate.of(2015,10,05),"test",
                4.5,500, false,"https://media.kitsu.io/anime/41071/poster_image/medium-a4eb2d884a8d4ff6498113309c97f0da.jpeg","https://media.kitsu.io/anime/cover_images/41071/original.jpg" );
        Anime blackClover = new Anime("Black Clover", LocalDate.of(2015,10,05),"test",
                4.5,500, false,"https://media.kitsu.io/anime/poster_images/13209/medium.jpg",
                "https://media.kitsu.io/anime/cover_images/789/original.jpeg");

//      Add Genre
        Genre comedy = new Genre("Comedy", Arrays.asList(naruto, bleach, attackOnTitan, onePunchMan, assinationClassroom, mobPsycho100, blackClover));
        Genre action = new Genre("Action", Arrays.asList(naruto, bungoStrayDogs2, attackOnTitan, onePunchMan, assinationClassroom, mobPsycho100, blackClover));
        Genre ecchi = new Genre("Ecchi", Arrays.asList(onePiece, bleach, attackOnTitan, deathNote));
        Genre sports = new Genre("Sports", Arrays.asList(slamDunk));
        Genre adventure = new Genre("Adventure", Arrays.asList(jojosBizzareAdventure2012));
        Genre supernatural = new Genre("Supernatural", Arrays.asList(jojosBizzareAdventure2012, mobPsycho100));
        Genre fantasy = new Genre("Fantasy", Arrays.asList(blackClover));

//      Add User
        User user1 = new User("Onoda", LocalDate.of(1999,9,2), "onodaKun@gmail.com", "kangaboo23!");
        User user2 = new User("John", LocalDate.of(1959,6,25),"lol@gmail.com","bomba345");
        User user3 = new User("Rem", LocalDate.of(2001,9,4), "Kem@gmail.com","madman76!");
        User user4 = new User("Jenny", LocalDate.of(1969,3,27), "janjenny@gmail.com", "gangnam45!");
        User user5 = new User("Shiki", LocalDate.of(1999,9,14), "Shiki43@gmail.com", "tokyorevengers22");
        User user6 = new User("Randy", LocalDate.of(1599,5,15), "Randy432@gmail.com", "bossgyal45");
        User user7 = new User("Shuka", LocalDate.of(1999,9,2), "onodaKun@gmail.com", "ganggang1!");
        User user8 = new User("Obu", LocalDate.of(2003,9,3), "ObiObi@gmail.com","whiskers89");
        User user9 = new User("Kite", LocalDate.of(1998,6,6), "Kie7673@gmail.com", "1derland!");
        User user10 = new User("Pete", LocalDate.of(1987,9,23), "PITY@gmail.com","bambideer2");
        User user11 = new User("Kwnichi", LocalDate.of(1989,6,24), "koitd@gmail.com", "raahted20");
        User user12 = new User("Quinnie", LocalDate.of(2001,9,2), "qunie432@gmail.com", "quebec203");

//      Add WatchList
        WatchList watchList1 = new WatchList(user1, naruto);
        WatchList watchList2 = new WatchList(user1, bleach);
        WatchList watchList3 = new WatchList(user1, attackOnTitan);
        WatchList watchList4 = new WatchList(user2, onePiece);
        WatchList watchList5 = new WatchList(user2, haikyuu);
        WatchList watchList6 = new WatchList(user2, kurokosBasketball);
        WatchList watchList7 = new WatchList(user3, haikyuu);
        WatchList watchList8 = new WatchList(user3, deathNote);
        WatchList watchList9 = new WatchList(user3, jojosBizzareAdventure2012);
        WatchList watchList10 = new WatchList(user4, kurokosBasketball);
        WatchList watchList11 = new WatchList(user4, bungoStrayDogs2);
        WatchList watchList12 = new WatchList(user4, attackOnTitan);
        WatchList watchList13 = new WatchList(user5, slamDunk);
        WatchList watchList14 = new WatchList(user5, naruto);
        WatchList watchList15 = new WatchList(user5, jojosBizzareAdventure2012);
        WatchList watchList16 = new WatchList(user6, bleach);
        WatchList watchList17 = new WatchList(user6, onePiece);
        WatchList watchList18 = new WatchList(user6, deathNote);
        WatchList watchList19 = new WatchList(user7, attackOnTitan);
        WatchList watchList20 = new WatchList(user7, deathNote);
        WatchList watchList21 = new WatchList(user7, jojosBizzareAdventure2012);
        WatchList watchList22 = new WatchList(user8, bleach);
        WatchList watchList23 = new WatchList(user8, onePiece);
        WatchList watchList24 = new WatchList(user8, haikyuu);
        WatchList watchList25 = new WatchList(user9, deathNote);
        WatchList watchList26 = new WatchList(user10, naruto);
        WatchList watchList27 = new WatchList(user11, jojosBizzareAdventure2012);
        WatchList watchList28 = new WatchList(user12, kurokosBasketball);
        WatchList watchList29 = new WatchList(user12, onePiece);
        WatchList watchList30 = new WatchList(user12, bleach);

//      Save models
        animeRepository.saveAll(Arrays.asList(naruto, narutoShippuden,bleach, attackOnTitan, onePiece, haikyuu, kurokosBasketball,
                bungoStrayDogs2, deathNote, slamDunk, jojosBizzareAdventure2012, onePunchMan, assinationClassroom,
                mobPsycho100, blackClover));
        userRepository.saveAll(Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10,
                user11, user12));
        watchListRepository.saveAll(Arrays.asList(watchList1,watchList2,watchList3,watchList4,watchList5, watchList6,
                watchList7, watchList8, watchList9, watchList10, watchList11, watchList12, watchList13, watchList14,
                watchList15,watchList16, watchList17, watchList18,watchList19,watchList20,watchList21, watchList22,
                watchList23, watchList24, watchList25, watchList26, watchList27,watchList28, watchList29, watchList30));
        genreRepository.saveAll(Arrays.asList(comedy, action, ecchi, sports, adventure, supernatural, fantasy));
    }
}
