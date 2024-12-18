package mkr2;

import java.lang.Math;
import java.util.List;
import java.util.ArrayList;

public class Arena {

    private List<Character> characters;
    private List<Client> clients;

    public Arena() {
        characters = new ArrayList<>();
        clients = new ArrayList<>();
    }

    private Character findNearbyCharacter(Character origin, int radius) {
        for(Character c: characters) {
            if(c == origin) continue;
            int dx2 = (c.coordinates.x - origin.coordinates.x) * (c.coordinates.x - origin.coordinates.x);
            int dy2 = (c.coordinates.y - origin.coordinates.y) * (c.coordinates.y - origin.coordinates.y);
            float d = Math.sqrt(dx2 + dy2);
            if(d <= radius) return c;
        }
        return null;
    }

    public void move(Character character, int dx, int dy) {
        character.coordinates += dx;
        character.coordinates += dy;
    }

    public boolean attack(Character character, int range, int multiplier) {
        Character target = findNearbyCharacter(character, range);
        if(target == null) return false;
        target.takeDamage(character.getDamage() * multiplier);
        return true;
    }

    public void addPlayer(Client client, Character character) {
        clients.add(client);
        characters.add(characters);
    }

}
