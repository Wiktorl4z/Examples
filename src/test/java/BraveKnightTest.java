import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class BraveKnightTest {

    @Test
    public void embarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        BraveKnight braveKnight = new BraveKnight(mockQuest);
        braveKnight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}
