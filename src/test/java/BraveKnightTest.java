import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class BraveKnightTest {

    @InjectMocks
    private BraveKnight braveKnight;
    @Mock
    private Quest mockQuest;

    @Test
    void embarkOnQuest() {
        braveKnight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}
