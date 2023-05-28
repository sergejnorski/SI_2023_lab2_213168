import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    public List<User> setList(){
        List<User> list = new ArrayList<>();

        return list;
    }

    @Test
    void multipleCondition(){
        RuntimeException ex;
        //T X X -> user == null
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null,setList()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        //F T X -> user.getPassword() == null
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(new User("sergej",null,"sergej@finki.com"),setList()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        //F F T -> user.getEmail() == null
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(new User("sergej","Norski123!?!",null),setList()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        //F F F -> dokolku site informacii se OK i ne vleguva vo IF
        assertTrue(SILab2.function(new User("sergej","Norski123!?","sergej@finki.com"),setList()));
    }

    @Test
    void evertBranch(){
        RuntimeException ex;
        //user == null
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null,setList()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));


    }
}