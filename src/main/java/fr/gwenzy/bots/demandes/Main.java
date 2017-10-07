package fr.gwenzy.bots.demandes;

import sx.blah.discord.api.ClientBuilder;
import sx.blah.discord.api.IDiscordClient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by gwend on 07/10/2017.
 */
public class Main {
    public static final String COMMAND_PREFIX = "!demande";
    public static IDiscordClient client;

    public static void main(String[] args){



    public static void main(String[] args) throws Exception {
        client = new ClientBuilder()
                .withToken(Tokens.TOKEN_BOT)
                .registerListener(new Main())
                .registerListener(new AdminCommandsListener())
                .registerListener(new ReadyListener())
                .login();

        search = new Search();
    }
    }
}
